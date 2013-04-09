grammar HelloWorld;

options {
  language = Java;
}
@header{
	package columbia.plt.tt;
}	
@lexer :: header {
	package columbia.plt.tt;
}

statement 	: print
		/*	| IfThenStatement
			| IfThenElseStatement
			| EveryFromToByStatement
			| EveryInStatement
			| EveryInFromToStatement
			| EveryInOnStatement
			| untilStatement
			| BreakStatement
			| ContinueStatement
			| ExitStatement
			| functionInvocationStatement*/
	;


print : 'print' '(' '"' STRING '"' ')' ';' 
				{System.out.println($STRING.text);} ; 

//STRING : 'a'..'z' + ;


// Arithmetic Expressions .. Jason

logicalExpression
    : booleanAndExpression (OR booleanAndExpression)*
    ;

booleanAndExpression
    : equalityExpression (AND equalityExpression)*
    ;

equalityExpression
    : relationalExpression ((EQUALS | NOTEQUALS) relationalExpression)*
    ;

relationalExpression
    : additiveExpression ((LT | LTEQ | GT | GTEQ) additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((MULT | DIV | MOD) unaryExpression)*
    ;

unaryExpression 
    : NOT primaryExpression
    ;

primaryExpression 
    : '(' logicalExpression ')'
    | NUMBER
    | STRING
    ;

OR    	  : '||';
AND   	  : '&&';
EQUALS	  : '==';
NOTEQUALS : '!=';
LT    	  : '<';
LTEQ  	  : '<=';
GT    	  : '>';
GTEQ  	  : '>=';
PLUS  	  : '+';
MINUS 	  : '-';
MULT  	  : '*';
DIV   	  : '/';
MOD   	  : 'mod';
NOT   	  : 'not';

NUMBER : '0'..'9'+;
IDENT : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
STRING : ('a'..'z'|'A'..'Z'|'0'..'9')+;
WS : (' '|'\t'|'\n'|'\r'|'\f')+ {$channel = HIDDEN;};

// End of Arithmetic Expression


