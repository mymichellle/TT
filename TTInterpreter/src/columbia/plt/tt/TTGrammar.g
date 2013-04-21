grammar TTGrammar;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
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
	: type^ WS* IDENT WS* ';'
	;

type
	: 'String'
	| 'Number'
	| 'Date'
	| 'Task'
	| 'TimeFrame'
	| 'Calendar'
	| 'Time'
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
	: 'Date' WS* IDENT WS* ASSIGN WS* DATE_CONSTANT WS* ';'
	|	IDENT ASSIGN WS* DATE_CONSTANT WS* ';'
	;
	
timeFrameDefnStmt
	: 'Timeframe' WS* IDENT WS* ASSIGN WS* TIME_FRAME_CONSTANT WS* ';'
	| IDENT WS* ASSIGN  WS* TIME_FRAME_CONSTANT WS* ';'
	;

taskDefnStmt
	: 'Task' WS* IDENT ASSIGN WS* STRING WS* ';'
	;

fieldDefnStmt
	: IDENT '.''name' WS* ASSIGN STRING WS* ';'
	| IDENT '.' 'start' WS* ASSIGN DATE_CONSTANT WS* ';'
	| IDENT '.' 'end'	WS*	ASSIGN DATE_CONSTANT WS* ';'
	| IDENT '.' 'location' WS* ASSIGN STRING_CONSTANT WS* ';'
	| IDENT '.' 'description' WS* ASSIGN STRING_CONSTANT WS* ';'
	;
	
stringDefnStmt
	: 'String' WS* IDENT WS* ASSIGN WS* STRING_CONSTANT WS* ';'
	| IDENT WS* ASSIGN WS* STRING_CONSTANT ';'
	;

numberDefnStmt
	: 'Number' WS* IDENT WS* ASSIGN WS* NUMBER WS* ';'
	| IDENT WS* ASSIGN WS* NUMBER ';'
	;

calendarDefnStmt
	: 'Calendar' WS* IDENT WS* ASSIGN WS* STRING_CONSTANT WS* ';'
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
  : 'every' 'Task' IDENT 'in' IDENT constraintOptions  '{' statement_type* '}'
  ;
  
constraintOptions
  : 'from' dateOrIdent 'to' dateOrIdent loopOptions
  | loopOptions
  ;
loopOptions
	: 'on' expression
	|
	;
	
dateOrIdent
	: IDENT
//	| date	        //WHAT IS THIS ?????
	; 
	
timeframeOrIdent
	: IDENT
	| TIME_FRAME_CONSTANT
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
	: 'read' '(' STRING_CONSTANT ')' ';'
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
	

print : 'print' '(' STRING_CONSTANT  ')' ';' {System.out.println($STRING.text);} ; 





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
	: STRING_CONSTANT ((PLUS) STRING_CONSTANT)*
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



//Constants
//@Author : Zheng

DOT         : '.';
fragment SYMPOL_PLUS  : '+';


IDENT 	: 	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
STRING 	: 	QUOTE ('a'..'z'|'A'..'Z'|'0'..'9'|' ')+ QUOTE;
QUOTE 	: 	'\"' ;
WS 			: 	(' '|'\t'|'\n'|'\r'|'\f')+ 	{$channel = HIDDEN;};
COMMENT : 	'//' (~('\n'|'\r'))*		{ $channel = HIDDEN; };


DATE_CONSTANT:	YEAR DOT MONTH DOT DAY DOT HOUR DOT MINUTE 
 			  |	YEAR DOT MONTH DOT DAY DOT HOUR  
 			  | YEAR DOT MONTH DOT DAY 
 			  | YEAR DOT MONTH  
 			  | YEAR  			   
 			  ;

fragment YEAR : DIGIT DIGIT DIGIT DIGIT; 
fragment MONTH   :  ('0'('0'.. '9')) | ('1'('0'.. '2'));
fragment DAY     :  ('0'('1'.. '9')) | (('1'..'2')('0'.. '9')) | ('3'('0'.. '1')) ;
                 //     0 [1 - 9] | [1 - 2][0 - 9] | 3[0 - 1]
fragment HOUR    :  ('0'.. '1')('0'.. '9') | '2'('0'.. '3') ;    //[0 -1] [0 - 9]| 2 [0 - 3]
fragment MINUTE  :  ('0'.. '5')('0'.. '9') ;



NUMBER: DIGIT+;


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


fragment TIME_ENTITY_CONSTANT
	: 'Monday'|'Tuesday'|'Wednesday'|'Thursday'|'Friday'|'Saturday'|'Sunday'
	 |'January'|'February'|'March'|'April'|'May'|'June'|'July'|'August'
	             |'September'|'October'|'November'|'December'
	 |'Weekend'|'Weekday'
	;

TIME_FRAME_CONSTANT
	:(NUMBER WS* TIMEFRAME_TYPE WS* SYMPOL_PLUS  )* WS* NUMBER WS* TIMEFRAME_TYPE	 
	;	

fragment TIMEFRAME_TYPE: 'year'|'years'|'month'|'months'|'weeks'|'week'|'day'|'days'|'hour'|'hours'|'minute'|'minutes'
				       ;  
				       
// End by Zheng





