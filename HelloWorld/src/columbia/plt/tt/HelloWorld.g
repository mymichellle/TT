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

// Statement - Michelle
statement 
	: statement_type+
	;

statement_type 
	: print
	| ifThenStatement
	| everyFromToByStatement
	| everyInStatement
/*	| everyInFromToStatement
	| everyInOnStatement*/
	| untilStatement
	| breakStatement
	| continueStatement
	| exitStatement
//	| functionInvocationStatement
	;

expression
	: logicalExpression
	;

ifThenStatement
	: 'if' '(' expression ')' '{' statement_type* '}' elseStatement
	;

elseStatement
	: 'else' '{' statement_type* '}'
	|
	;

everyFromToByStatement
	: 'every' 'Date' IDENT 'from' dateOrIdent 'to' dateOrIdent 'by' timeframeOrIdent '{' statement_type* '}'
	;
	
everyInStatement
	: 'every' 'Task' IDENT 'in' IDENT 'from' dateOrIdent 'to' dateOrIdent loopOptions '{' statement_type* '}'
	;
	
loopOptions
	: 'on' expression
	|
	;
	
dateOrIdent
	: IDENT
//	| date	
	; 
	
timeframeOrIdent
	: IDENT
//	| timeframe
	;
	
untilStatement
	: 'until' dateOrIdent ';'
	;
	
breakStatement
	: 'break' ';'
	;
	
continueStatement
	: 'continue' ';'
	;
	
exitStatement
	: 'exit' ';'
	;
	
// end of statement

print : 'print' '(' STRING  ')' ';' 
				{System.out.println($STRING.text);} ; 

//%%%%%%%%%%%%%%%%
// Constants by Zheng 
//%%%%%%%%%%%%%%%%%
/*da :
	YEAR && MONTH ||DAY
	;
	*/
	
dateConstant
 	: YEAR | YEAR '.' MONTH | YEAR '.' MONTH '.' DAY 
 	  |YEAR '.' MONTH '.' DAY '.' HOUR
 	  |YEAR '.' MONTH '.' DAY '.' HOUR '.' MINUTE  
 	;
// 	  
//timeFrame
//	: primaryExpression ((' ')*)
//	  ('year'|'years'|'month'|'months'|'day'|'days'|'hour'|'hours'|'minute'|'minutes') 
//	;
//	  
//timeFrameConstant
//	: timeFrame ('+' timeFrame)* 
//	;
//
timeEntityConstant
	: TIMEENTITYDAY | TIMEENTITYWEEK | TIMEENTITYMONTH
	;
	

//end of constants

// Arithmetic Expressions .. Jason
//program : logicalExpression
//        | stringExpression
//        ;
        
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
	: NOT? primaryExpression
    ;

primaryExpression 
	: '(' logicalExpression ')'
	| NUMBER
    ;

stringExpression
	: STRING ((PLUS) STRING)*
	;
	
OR    		: '||';
AND   		: '&&';
EQUALS		: '==';
NOTEQUALS	: '!=';
LT    		: '<';
LTEQ  		: '<=';
GT    		: '>';
GTEQ  		: '>=';
PLUS  		: '+';
MINUS 		: '-';
MULT  		: '*';
DIV   		: '/';
MOD   		: 'mod';
NOT   		: 'not';

NUMBER : '0'..'9'+;
IDENT : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
STRING : '"'('a'..'z'|'A'..'Z'|'0'..'9'|' ')+'"';
WS : (' '|'\t'|'\n'|'\r'|'\f')+ {$channel = HIDDEN;};

// End of Arithmetic Expression


//%%%%%%%%%%%%%%%%
// created by Zheng 
//%%%%%%%%%%%%%%%%%


fragment YEAR    :  ('0'.. '9')('0'.. '9')('0'.. '9')('0'.. '9') ;
fragment MONTH   :  ('0'('0'.. '9')) | ('1'('0'.. '2'));
fragment DAY     :  ('0'('1'.. '9')) | (('1'..'2')('0'.. '9')) | ('3'('0'.. '1')) ;
//           0 [1 - 9] | [1 - 2][0 - 9] | 3[0 - 1]
fragment HOUR    :  ('0'.. '1')('0'.. '9') | '2'('0'.. '3') ;    //[0 -1] [0 - 9]| 2 [0 - 3]
fragment MINUTE  :  ('0'.. '5')('0'.. '9') ;

fragment TIMEENTITYDAY:  'Monday'|'Tuesday'|'Wednesday'|'Thursday'|'Friday'|'Saturday'|'Sunday' ;
fragment TIMEENTITYMONTH: 'January'|'February'|'March'|'April'|'May'|'June'|'July'|'August'
	             |'September'|'October'|'November'|'December'  ;
fragment TIMEENTITYWEEK : 'Weekend'|'Weekday' ;	   

fragment BOOL    : 'true' | 'false' ;

STRING_CONSTANT: '"' NONCONTROL_CHAR* '"';
fragment NONCONTROL_CHAR: LETTER | DIGIT | SYMBOL | SPACE;
fragment LETTER: LOWER | UPPER;
fragment LOWER: 'a'..'z';
fragment UPPER: 'A'..'Z';
fragment DIGIT: '0'..'9';
fragment SPACE: ' ' | '\t';
// Note that SYMBOL does not include the double-quote character.
fragment SYMBOL: '!' | '#'..'/' | ':'..'@' | '['..'`' | '{'..'~';
// Windows uses \r\n. UNIX and Mac OS X use \n.
// To use newlines as a terminator,
// they can't be written to the hidden channel!

// End by Zheng



