
grammar LogicalExpressions;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}
tokens {
	NEGATION;
}

@header {
  package columbia.plt.tt;
}

@lexer::header {
  package columbia.plt.tt;
}

evaluator
	:	assignmentStmt* expression EOF!
	;
	
assignmentStmt
	:	IDENT '='^ expression ';'!
	;
	
// expressions -- fun time!

term
	:	IDENT
	|	'('! expression ')'!
	|	BOOL
	;
	
unary
	:	(negation^)* term
	;

negation
	:	'!' -> NEGATION
	;

logicalAnd
	:	unary (('&&') unary)*
	;
	
expression
	:	logicalAnd (('||'^) logicalAnd)*
	;


fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
BOOL : 'true' | 'false';
IDENT : LETTER (LETTER | DIGIT)*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
