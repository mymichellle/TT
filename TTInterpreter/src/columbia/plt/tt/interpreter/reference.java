package columbia.plt.tt.interpreter;

public class reference {
	/***
	 * Excerpted from "Language Implementation Patterns",
	 * published by The Pragmatic Bookshelf.
	 * Copyrights apply to this code. It may not be used to create training material, 
	 * courses, books, articles, and the like. Contact us if you are in doubt.
	 * We make no guarantees that this code is fit for any purpose. 
	 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
	***/
	import org.antlr.runtime.*;

	import java.io.InputStream;
	import java.io.IOException;
	import java.util.List;
	import java.util.Stack;

	  //  public static final ReturnValue sharedReturnValue = new ReturnValue();

	  //  GlobalScope globalScope;   // global scope is filled by the parser
	  //  MemorySpace globals = new MemorySpace("globals");       // global memory
	  //  MemorySpace currentSpace = globals;
	//    Stack<FunctionSpace> stack = new Stack<FunctionSpace>();// call stack
	      CommonTree root;               // the AST represents our code memory
	 //   TokenRewriteStream tokens;
	    TTLexer lex;              // lexer/parser are part of the processor
	    TTParser parser;  

	    public void interp(InputStream input) throws RecognitionException, IOException {
	        globalScope = new GlobalScope();
	        lex = new TTLexer(new ANTLRInputStream(input));
	        tokens = new TokenRewriteStream(lex);
	        parser = new TTParser(tokens, this);
	        parser.setTreeAdaptor(InterPie.pieAdaptor);

	        TTParser.program_return r = parser.program();
	        if ( parser.getNumberOfSyntaxErrors()==0 ) {
	            root = (CommonTree)r.getTree();
	            //System.out.println("tree: "+root.toStringTree());
	            block(root);
	        }
	    }

	    /** visitor dispatch according to node token type */
	    public Object exec(CommonTree t) {
	        try {
	            switch ( t.getType() ) {
	                case TTParser.BLOCK : block(t); break;
	                case TTParser.ASSIGN : assign(t); break;
	                case TTParser.RETURN : ret(t); break;
	                case TTParser.PRINT : print(t); break;
	                case TTParser.IF : ifstat(t); break;
	                case TTParser.WHILE : whileloop(t); break;
	                case TTParser.CALL : return call(t);
	                case TTParser.NEW : return instance(t);
	                case TTParser.ADD : return add(t);
	                case TTParser.SUB : return op(t);
	                case TTParser.MUL : return op(t);
	                case TTParser.EQ : return eq(t);
	                case TTParser.LT : return lt(t);
	                case TTParser.INT : return Integer.parseInt(t.getText());
	                case TTParser.CHAR : return new Character(t.getText().charAt(1));
	                case TTParser.FLOAT : return Float.parseFloat(t.getText());
	                case TTParser.STRING :
	                    String s = t.getText();
	                    return s.substring(1,s.length()-1);
	                case TTParser.DOT :
	                case TTParser.ID :
	                    return load(t);
	                default : // catch unhandled node types
	                    throw new UnsupportedOperationException("Node "+
	                        t.getText()+"<"+t.getType()+"> not handled");
	            }
	        }
	        catch (Exception e) {
	            listener.error("problem executing "+t.toStringTree(), e);
	        }
	        return null;
	    }

	    public void block(CommonTree t) {
	        if ( t.getType()!=TTParser.BLOCK ) {
	            listener.error("not a block: "+t.toStringTree());
	        }
	        List<CommonTree> stats = t.getChildren();
	        for (CommonTree x : stats) exec(x);
	    }

	    public Object call(CommonTree t) {
	        // Resolve function's name
	        String fname = t.getChild(0).getText();
	        FunctionSymbol fs = (FunctionSymbol)t.scope.resolve(fname);
	        if ( fs==null ) {
	            listener.error("no such function "+fname, t.token);
	            return null;
	        }
	        FunctionSpace fspace = new FunctionSpace(fs);
	        MemorySpace saveSpace = currentSpace;
	        currentSpace = fspace;

	        int argCount = t.getChildCount()-1;
	        // check for argument compatibility
	        if ( fs.formalArgs==null && argCount>0 || // args compatible?
	             fs.formalArgs!=null && fs.formalArgs.size()!=argCount ) {
	            listener.error("function "+fs.name+" argument list mismatch");
	            return null;
	        }
	        int i = 0; // define args according to order in formalArgs
	        for (Symbol argS : fs.formalArgs.values()) {
	            VariableSymbol arg = (VariableSymbol)argS;
	            CommonTree ithArg = (CommonTree)t.getChild(i+1);
	            Object argValue = exec(ithArg);
	            fspace.put(arg.name, argValue);
	            i++;
	        }
	        Object result = null;
	        stack.push(fspace);        // PUSH new arg, local scope
	        try { exec(fs.blockAST); } // do the call
	        catch (ReturnValue rv) { result = rv.value; } // trap return value
	        stack.pop();               // POP arg, locals
	        currentSpace = saveSpace;
	        return result;
	    }

	    public void ret(CommonTree t) {
	        sharedReturnValue.value = exec((CommonTree)t.getChild(0));
	        throw sharedReturnValue;
	    }

	    public void print(CommonTree t) {
	        CommonTree expr = (CommonTree)t.getChild(0);
	        System.out.println( exec(expr) );
	    }

	    public void assign(CommonTree t) {
	        CommonTree lhs = (CommonTree)t.getChild(0);   // get operands
	        CommonTree expr = (CommonTree)t.getChild(1);
	        Object value = exec(expr);            // walk/evaluate expr
	        if ( lhs.getType()==TTParser.DOT ) {
	            fieldassign(lhs, value); // field ^('=' ^('.' a x) expr)
	            return;
	        }
	        // var assign ^('=' a expr)
	        MemorySpace space = getSpaceWithSymbol(lhs.getText());
	        if ( space==null ) space = currentSpace; // create in current space
	        space.put(lhs.getText(), value);         // store
	    }

	    public void fieldassign(CommonTree lhs, Object value) {
	        CommonTree o = (CommonTree) lhs.getChild(0);
	        CommonTree f = (CommonTree) lhs.getChild(1);
	        String fieldname = f.getText();
	        Object a = load(o);
	        if ( !(a instanceof StructInstance) ) {
	            // make a good error message:
	            String leftpart = parser.input.toString(lhs.getTokenStartIndex(),
	                                                    lhs.getTokenStopIndex()-2);
	            String all = parser.input.toString(lhs.getTokenStartIndex(),
	                                               lhs.getTokenStopIndex());
	            listener.error(leftpart+" is not a struct in "+all, o.token);
	            return;
	        }
	        StructInstance struct = (StructInstance)a;
	        if ( struct.def.resolveMember(fieldname) == null ) {
	            listener.error("can't assign; "+struct.name+" has no "+fieldname+
	                           " field", f.token);
	            return;
	        }
	        struct.put(fieldname, value);
	    }

	    public void whileloop(CommonTree t) {
	        CommonTree condStart = (CommonTree)t.getChild(0);
	        CommonTree codeStart = (CommonTree)t.getChild(1);
	        Boolean c = (Boolean)exec(condStart);
	        while ( c ) {
	            exec(codeStart);
	            c = (Boolean)exec(condStart);
	        }
	    }

	    public void ifstat(CommonTree t) {
	        CommonTree condStart = (CommonTree)t.getChild(0);
	        CommonTree codeStart = (CommonTree)t.getChild(1);
	        CommonTree elseCodeStart = null;
	        if ( t.getChildCount()==3 ) elseCodeStart = (CommonTree)t.getChild(2);
	        Boolean c = (Boolean)exec(condStart);
	        if ( ((Boolean)c).booleanValue() ) exec(codeStart);
	        else if ( elseCodeStart!=null ) exec(elseCodeStart);
	    }

	    public boolean eq(CommonTree t) {
	        Object a = exec( (CommonTree)t.getChild(0) );
	        Object b = exec( (CommonTree)t.getChild(1) );
	        return a.equals(b);
	    }

	    public boolean lt(CommonTree t) {
	        Object a = exec( (CommonTree)t.getChild(0) );
	        Object b = exec( (CommonTree)t.getChild(1) );
	        if ( a instanceof Number && b instanceof Number ) {
	            Number x = (Number)a;
	            Number y = (Number)b;
	            return x.floatValue() < y.floatValue();
	        }
	        return false;
	    }

	    public Object op(CommonTree t) {
	        Object a = exec( (CommonTree)t.getChild(0) );
	        Object b = exec( (CommonTree)t.getChild(1) );
	        if ( a instanceof Float || b instanceof Float ) {
	            float x = ((Number)a).floatValue();
	            float y = ((Number)b).floatValue();
	            switch (t.getType()) {
	                case TTParser.ADD : return x + y;
	                case TTParser.SUB : return x - y;
	                case TTParser.MUL : return x * y;
	            }
	        }
	        if ( a instanceof Integer || b instanceof Integer ) {
	            int x = ((Number)a).intValue();
	            int y = ((Number)b).intValue();
	            switch (t.getType()) {
	                case TTParser.ADD : return x + y;
	                case TTParser.SUB : return x - y;
	                case TTParser.MUL : return x * y;
	            }
	        }
	        return 0;
	    }

	    public Object add(CommonTree t) {
	        Object a = exec( (CommonTree)t.getChild(0) );
	        Object b = exec( (CommonTree)t.getChild(1) );
	        if ( a instanceof String || b instanceof String ) {
	            return a.toString() + b.toString();
	        }
	        return op(t);
	    }

	    public Object load(CommonTree t) {
	        if ( t.getType()==TTParser.DOT ) return fieldload(t);
	        MemorySpace s = getSpaceWithSymbol(t.getText()); // just a not a.b
	        if ( s!=null ) return s.get(t.getText());
	        listener.error("no such variable "+t.getText(), t.token);
	        return null;
	    }

	    public Object fieldload(CommonTree t) { // E.g., a.b in tree ^('.' a b)
	        CommonTree expr = (CommonTree)t.getChild(0); // get left node or subtree
	        CommonTree b = (CommonTree)t.getChild(1);    // must be an ID node
	        String id = b.getText();
	        StructInstance struct = (StructInstance)load(expr); // find expr
	        if ( struct.def.resolveMember(id)==null ) { // is it a struct?
	            listener.error(struct.name+" has no "+id+" field", b.token);
	            return null;
	        }
	        return struct.get(id);
	    }

	    /** Return scope holding id's value; current func space or global. */
	    public MemorySpace getSpaceWithSymbol(String id) {
	        if (stack.size()>0 && stack.peek().get(id)!=null) { // in top stack?
	            return stack.peek();
	        }
	        if ( globals.get(id)!=null ) return globals;        // in globals?
	        return null;                                        // nowhere
	    }

	    public StructInstance instance(CommonTree t) {
	        CommonTree structNameNode = (CommonTree)t.getChild(0);
	        StructSymbol s = (StructSymbol)
	            structNameNode.scope.resolve(structNameNode.getText());
	        return new StructInstance(s);
	    }
	

}
