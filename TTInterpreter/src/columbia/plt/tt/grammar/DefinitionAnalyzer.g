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
	SymbolTable symtab;
	Scope currentScope;
	public DefinitionAbalyzer(TreeNodeStream input, SymbolTable symtab) {
		this(input);
		this.symtab = symtab;
		currentScope = symtab.globals;
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
		currentScope = new LocalScope(currentScope);
	}
	;
exitBlock
	: SLIST
	{
		System.out.println("locals: " + currentScope);
		currentScope = currentScope.getEnclosingScope(); // pop scope
	}
	;

enterMethod
	: ^(METHOD type=. IDENT .*) // match method subtree with 0-or-more args
	{
		System.out.println("line " + $IDENT.getLine()+": def method " + $IDENT.text);
		$type.scope = currentScope;
		MethodSymbol ms = new MethodSymbol($IDENT.text, null, currentScope);
		ms.def = $IDENT;            // track AST location of def's ID
		$IDENT.symbol = ms;         // track in AST
		currentScope.define(ms); // def method in globals
		currentScope = ms;       // set current scope to method scope
	}
	;
exitMethod
	: METHOD
	{
		System.out.println("args: "+currentScope);
		currentScope = currentScope.getEnclosingScope();    // pop arg scope
	}
	;
enterMain
	:
	;
exitMain
	:
	;

varDeclaration // parameter, or local
	: ^(ARG type=. IDENT .?)
	{
		System.out.println("line " + $IDENT.getLine() + ": def " + $IDENT.text);
		$type.scope = currentScope;
		VariableSymbol vs = new VariableSymbol($IDENT.text,null);
		vs.def = $IDENT;            // track AST location of def's ID
		$IDENT.symbol = vs;         // track in AST
		currentScope.define(vs);
	}
	;