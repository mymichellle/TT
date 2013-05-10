tree grammar DefinitionAnalyzer;
//tree walker for anakyzing global scope variables and methods
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
	| varDefinition
	;

bottomup
	: exitBlock
	| exitMethod
	| exitMain
	;

enterBlock
	: SLIST 
	{
	}
	;
exitBlock
	: SLIST
	{
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

varDefinition // parameter, or local
	: ^(DEFINE ^(DECLARE type=. IDENT) expr=.)
	{
		System.out.println("DEFINE");
		if ($DEFINE.getParent().getType() == TTParser.TUNIT) {
			String name = $IDENT.getText();
			System.out.println("line " + $IDENT.getLine() + ": DEFINE " + name);
			
			VariableSymbol vs = new VariableSymbol(null, null, name);
			vs.assignmentExpression = $DEFINE;
			symbolTable.addSymbol(name, vs);
		}
	}
	;
	
varDeclaration // parameter, or local
	: ^(DECLARE type=. IDENT)
	{
		if ($DECLARE.getParent().getType() == TTParser.TUNIT) {
			System.out.println("line " + $IDENT.getLine() + ": DECLARE " + $IDENT.text);
			String name = $IDENT.text;
			String typeText = $type.getText();
			VariableSymbol vs = new VariableSymbol(typeText, null, name);
			vs.declaration = $DECLARE;
			symbolTable.addSymbol(name, vs);
		}
	}
	;