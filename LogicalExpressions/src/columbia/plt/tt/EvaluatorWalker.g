tree grammar EvaluatorWalker;

options {
  language = Java;
  tokenVocab = LogicalExpressions;
  ASTLabelType = CommonTree;
}

@header {
  package columbia.plt.tt;
  import java.util.Map;
  import java.util.HashMap;
}

@members {
  private Map<String, Boolean> symbolTable = new HashMap<String, Boolean>();
}

evaluator returns [boolean result]
	:	assignment* e=expression EOF{ result = e; }
	;
	
assignment
	:	^('=' IDENT e=expression)
			{ symbolTable.put($IDENT.text, e); }
	;
	
expression returns [boolean result]
	:	^('&&' op1=expression op2=expression) { result = op1 && op2; }
	|	^('||' op1=expression op2=expression) { result = op1 || op2; }
	|	^(NEGATION e=expression)  { result = !e; }
	|	IDENT { result = symbolTable.get($IDENT.text); }
	|	BOOL { result = Boolean.parseBoolean($BOOL.text); }
	;
