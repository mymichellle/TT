package columbia.plt.tt.interpreter;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;

import columbia.plt.tt.TTLexer;
import columbia.plt.tt.TTParser;

import antlr.RecognitionException;

public class Interpreter {
	
	TTLexer lexer;
	TokenStream tokenStream;
	TTParser parser;
	// Right now our TTGrammar.g makes each node a CommonTree
	CommonTree root;
	
	public void interp(InputStream input) throws RecognitionException, IOException, org.antlr.runtime.RecognitionException {
		CharStream stream = new ANTLRInputStream(input);       
        lexer = new TTLexer(stream);
        tokenStream = new CommonTokenStream(lexer);
        parser = new TTParser(tokenStream);
        // Do we have a tree adaptor??
        //parser.setTreeAdaptor(InterPie.pieAdaptor);
        
        TTParser.translationUnit_return r = parser.translationUnit();
        if( parser.getNumberOfSyntaxErrors()==0 ) {
        	root = r.getTree();
        	System.out.println("tree: "+root.toStringTree());
        	mainBlock(root);
        }
    }
	
	/** visitor dispatch according to node token type */
    public Object exec(CommonTree t) {
        try {
            switch ( t.getType() ) {
            	case TTParser.MAIN : mainBlock(t); break;
             /*   case PieParser.BLOCK : block(t); break;
                case PieParser.ASSIGN : assign(t); break;
                case PieParser.RETURN : ret(t); break;
                case PieParser.PRINT : print(t); break;
                case PieParser.IF : ifstat(t); break;
                case PieParser.WHILE : whileloop(t); break;
                case PieParser.CALL : return call(t);
                case PieParser.NEW : return instance(t);
                case PieParser.ADD : return add(t);
                case PieParser.SUB : return op(t);
                case PieParser.MUL : return op(t);
                case PieParser.EQ : return eq(t);
                case PieParser.LT : return lt(t);
                case PieParser.INT : return Integer.parseInt(t.getText());
                case PieParser.CHAR : return new Character(t.getText().charAt(1));
                case PieParser.FLOAT : return Float.parseFloat(t.getText());
                case PieParser.STRING :
                    String s = t.getText();
                    return s.substring(1,s.length()-1);
                case PieParser.DOT :
                case PieParser.ID :
                    return load(t);*/
                default : // catch unhandled node types
                    throw new UnsupportedOperationException("Node "+
                        t.getText()+"<"+t.getType()+"> not handled");
            }
        }
        catch (Exception e) {
        }
        return null;
    }

    public void mainBlock(CommonTree t) {
        if ( t.getType()!=TTParser.MAIN ) {
        	// Handle error
            //listener.error("not a block: "+t.toStringTree());
        }
        // Execute code
        //List<PieAST> stats = t.getChildren();
        //for (PieAST x : stats) exec(x);
    }
	
}
