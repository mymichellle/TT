tree grammar DefinitionAnalyzer;
options {
	tokenVocab = TT;
	ASTLabelType = CommonTree;
	filter = true;
}

@header{
	package columbia.plt.tt;
	import columbia.plt.tt.datatype.*;
	import columbia.plt.tt.interpreter.*;
}

@members {
	SymbolTable symbolTable;
	Scope currentScope;
	public DefinitionAnalyzer(TreeNodeStream input, SymbolTable symbolTable) {
		this(input);
		this.symbolTable = symbolTable;
		currentScope = symbolTable.getScope(0);
	}
}

topdown
	: enterBlock
	| enterMethod
	| enterMain
	| varDeclaration
	;

bottomup
	: exitBlock
	| exitMethod
	| exitMain
	;

enterBlock
	: SLIST 
	{
//		symbolTable.addScope();
		currentScope = symbolTable.getCurrentScope();
	}
	;
exitBlock
	: SLIST
	{
		System.out.println("locals: " + currentScope);
//		currentScope = currentScope.getEnclosingScope(); // pop scope
	}
	;

enterMethod
	: ^(METHOD type=. IDENT .*) // match method subtree with 0-or-more args
	{
		String methodName = $IDENT.text;
		System.out.println("line " + $IDENT.getLine()+":  method " + methodName);
		String typeString = ( $type != null ? $type.getText() : null );
		MethodSymbol ms = new MethodSymbol(typeString, null, methodName);
		
		CommonTree t = $METHOD;
		int childrenCount = t.getChildCount();
		int argsCount = childrenCount - 1;
		ms.methodBody = (CommonTree) t.getChild(childrenCount - 1);

		int i = (typeString == null ? 1 : 2);
		for (; i < argsCount; i++) {
			CommonTree childNode = (CommonTree)t.getChild(i);
			CommonTree argType = (CommonTree)childNode.getChild(0);
			CommonTree argName = (CommonTree)childNode.getChild(1);
			String aName = argName.getText();
			Symbol argSym = new Symbol(argType.getText(), null, aName);
			ms.addParameter(aName, argSym);
		}
		symbolTable.addSymbol(methodName, ms);
	}
	;
exitMethod
	: METHOD
	;
enterMain
	: ^(MAIN block=.) // match main
	{
		String methodName = "main";
		MethodSymbol ms = new MethodSymbol(null, null, methodName);
		ms.methodBody = $block;
		symbolTable.addSymbol(methodName, ms);
	}
	;
exitMain
	: MAIN
	;

varDeclaration // parameter, or local
	: ^((DECLARE | DEFINE) type=. IDENT .?)
	{
		System.out.println("line " + $IDENT.getLine() + ": def " + $IDENT.text);
//		$type.scope = currentScope;
//		VariableSymbol vs = new VariableSymbol($IDENT.text,null);
//		vs.def = $IDENT;            // track AST location of def's ID
//		$IDENT.symbol = vs;         // track in AST
//		currentScope.define(vs);
	}
	;