grammar TTGrammar;

options {
  language = Java;
}
@header{
	package columbia.plt.tt;
}	
@lexer :: header {
	package columbia.plt.tt;
}

// Variable declaration and definition
//@Author : Athresh

declarationStatement
	: type WS* IDENT WS* ';'
	;

type
	: 'String'
	| 'Number'
	| 'Date'
	| 'Task'
	| 'TimeFrame'
	|	'Calendar'
	|'Time'
	;
	
definitionStatement
	: dateDefnStmt
	|	calendarDefnStmt
	| timeFrameDefnStmt
	|	taskDefnStmt
	| stringDefnStmt
	| numberDefnStmt
	|	fieldDefnStmt
	;
	

dateDefnStmt
	: 'Date' WS* IDENT WS* ASSIGN WS* dateConstant WS* ';'
	|	IDENT ASSIGN WS* dateConstant WS* ';'
	;
	
timeFrameDefnStmt
	: 'Timeframe' WS* IDENT WS* ASSIGN WS* timeFrameConstant WS* ';'
	| IDENT WS* ASSIGN  WS* timeFrameConstant WS* ';'
	;

taskDefnStmt
	: 'Task' WS* IDENT ASSIGN WS* STRING WS* ';'
	;

fieldDefnStmt
	: IDENT '.''name' WS* ASSIGN STRING WS* ';'
	| IDENT '.' 'start' WS* ASSIGN dateConstant WS* ';'
	| IDENT '.' 'end'	WS*	ASSIGN dateConstant WS* ';'
	| IDENT '.' 'location' WS* ASSIGN STRING WS* ';'
	| IDENT '.' 'description' WS* ASSIGN STRING WS* ';'
	;
	
stringDefnStmt
	: 'String' WS* IDENT WS* ASSIGN WS* STRING WS* ';'
	| IDENT WS* ASSIGN WS* STRING ';'
	;

numberDefnStmt
	: 'Number' WS* IDENT WS* ASSIGN WS* NUMBER WS* ';'
	| IDENT WS* ASSIGN WS* NUMBER ';'
	;

calendarDefnStmt
	: 'Calendar' WS* IDENT WS* ASSIGN WS* STRING WS* ';'
	;
	

//Statement
//@Author : Michelle
statement 
	: statement_type+
	;

statement_type 
	: print
	| declarationStatement
	|	definitionStatement
	| ifThenStatement
	| everyFromToByStatement
	| everyInStatement
/*	| everyInFromToStatement
	| everyInOnStatement*/
	| untilStatement
	| breakStatement
	| continueStatement
	| exitStatement
	| readStatement
	| functionInvocationStatement
	;

expression
	: logicalExpression
	| functionInvocation
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
	| timeFrame
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
	
readStatement
	: 'Read' '(' STRING ')' ';'
	;
	
functionInvocationStatement
	: functionInvocation ';'
	;
	
functionInvocation
	: IDENT argumentList
	;
	
argumentList
	: '(' expressionList? ')'
	;
	
expressionList
	: expression (','expression)*
	;
	

print : 'print' '(' STRING  ')' ';' {System.out.println($STRING.text);} ; 



//Constants
//@Author : Zheng

dateConstant
 	: YEAR 
 	| YEAR '.' MONTH 
 	| YEAR '.' MONTH '.' DAY 
 	|	YEAR '.' MONTH '.' DAY '.' HOUR
 	|	YEAR '.' MONTH '.' DAY '.' HOUR '.' MINUTE  
 	;
	  
timeFrame
	: primaryExpression
	  ('year'|'years'|'month'|'months'|'day'|'days'|'hour'|'hours'|'minute'|'minutes') 
	;
	  
timeFrameConstant
	: timeFrame ('+' timeFrame)* 
	;

timeEntityConstant
	: TIMEENTITYDAY | TIMEENTITYWEEK | TIMEENTITYMONTH
	;
	



// Arithmetic Expressions .. Jason
// @Author : Jason

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
	: '(' expression ')'
	| NUMBER
	| IDENT
    ;

stringExpression
	: STRING ((PLUS) STRING)*
	;
	
	

//Lexer Rules
ASSIGN 		: '=';
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



NUMBER 	: 	DIGIT +;
IDENT 	: 	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
STRING 	: 	QUOTE ('a'..'z'|'A'..'Z'|'0'..'9'|' ')+ QUOTE;
QUOTE 	: 	'\"' ;
WS 			: 	(' '|'\t'|'\n'|'\r'|'\f')+ 	{$channel = HIDDEN;};
COMMENT : 	'//' (~('\n'|'\r'))*		{ $channel = HIDDEN; };


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




