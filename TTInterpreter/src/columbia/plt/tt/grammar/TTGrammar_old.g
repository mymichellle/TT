grammar TTGrammar_old;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}
tokens {
	TUNIT;
	IMPORTS;
	METHOD;
	ARG;
	CALL;
	SLIST;
	MAIN;
}
@header{
	package columbia.plt.tt;
	import columbia.plt.tt.datatype.*;
	import columbia.plt.tt.interpreter.*;
}	
@lexer :: header {
	package columbia.plt.tt;
}

@lexer::members { 
	private ArrayList<String> errors = new ArrayList<String>();    
  
	public ArrayList<String> getErrors()
	{
		return errors;
	}
	
	@Override  
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		errors.add(hdr + " " + msg);
	}
}

@parser::members { 
	private ArrayList<String> errors = new ArrayList<String>();    
  
    	public ArrayList<String> getErrors()
	{
		return errors;
	}
	
	@Override  
	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		errors.add(hdr + " " + msg); 
	}  
}

translationUnit
	: imports programBody -> ^(TUNIT imports programBody)
	;

imports :
	importedLibraries* -> ^(IMPORTS importedLibraries*)
	;
importedLibraries
	: 'import' STRING_CONSTANT ';' -> STRING_CONSTANT
	;

programBody
	: methodsAndFieldsDeclarations*
	;

methodsAndFieldsDeclarations
	: declarationStatement
	| definitionStatement 
	| main
	| methodDeclarations
	;

main
	: 'main('WS*')' methodBody -> ^(MAIN methodBody)
	;

methodDeclarations
	: methodSignature methodBody -> ^(METHOD methodSignature methodBody)
	;
	
methodSignature
	: type? IDENT methodParameters
	;
	
methodParameters
	: '(' methodParametersList? ')' -> methodParametersList?
	;

methodParametersList
	: argDeclaration (','argDeclaration)* -> argDeclaration+
	;

argDeclaration
	: type IDENT -> ^(ARG type IDENT)
	;

methodBody
	:'{' statement_type* '}' -> ^(SLIST statement_type*)
	;


// Variable declaration and definition
//@Author : Athresh

declarationStatement
	: type (WS*)! IDENT (WS*)! SEMICOLON!
	;

	
definitionStatement
	: type (WS*)! assignmentStmt 
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

assignmentStmt
	: IDENT ^ASSIGN (WS*)! expression (WS*)! SEMICOLON!
	| memberAccessExpression ^ASSIGN (WS*)! expression (WS*)! SEMICOLON!
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
	|	assignmentStmt
	| ifThenStatement
	| everyFromToByStatement
	| everyInStatement
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
	| DATE_CONSTANT	
	; 
	
timeframeOrIdent
	: IDENT
	| timeFrameConstant
	;
	
breakStatement
	: 'break' SEMICOLON
	;
	
continueStatement
	: 'continue' SEMICOLON
	;
	
exitStatement
	: 'exit' SEMICOLON
	;
	
readStatement
	: 'read' '(' STRING_CONSTANT ')' SEMICOLON
	;
	
functionInvocationStatement
	: functionInvocation ';'!
	;
	
functionInvocation
	: IDENT argumentList -> ^(CALL IDENT argumentList)
	;
	
argumentList
	: '(' expressionList? ')' -> expressionList?
	;
	
expressionList
	: expression (','expression)* -> expression*
	;
	
	

print : 'print' '(' STRING_CONSTANT  ')' SEMICOLON {System.out.println($STRING_CONSTANT.text);} ; 



timeFrame
  : primaryExpression
    ('year'|'years'|'month'|'months'|'day'|'days'|'hour'|'hours'|'minute'|'minutes') 
  ;

timeFrameConstant
 : timeFrame ('+' timeFrame)*
 ;

// Arithmetic Expressions .. Jason
// @Author : Jason
      
logicalExpression
	: booleanAndExpression (OR^ booleanAndExpression)*
    ;

booleanAndExpression
    : equalityExpression (AND^ equalityExpression)*
    ;

equalityExpression
    : relationalExpression ((EQUALS | NOTEQUALS)^ relationalExpression)*
    ;

relationalExpression
    : additiveExpression ((LT | LTEQ | GT | GTEQ)^ additiveExpression)*
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS)^ multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((MULT | DIV | MOD)^ unaryExpression)*
    ;

memberAccessExpression
	:	IDENT DOT^ IDENT 
	;

unaryExpression 
	: (NOT?)^  primaryExpression
  ;

primaryExpression 
	: '('! expression ')'!
	| CONSTANT
	| IDENT
  ;

stringExpression
	: STRING_CONSTANT ((PLUS)^ STRING_CONSTANT)*
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
SEMICOLON		: ';' ;
IDENT 	: 	('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
WS 			: 	('\w'|'\t'|'\n'|'\r'|'\f')+ 	{$channel = HIDDEN;};
COMMENT : 	'//' (~('\n'|'\r'))*		{ $channel = HIDDEN; };


CONSTANT : STRING_CONSTANT
				| DATE_CONSTANT
				| TIMEFRAME
				| NUMBER
				| TIME_ENTITY_CONSTANT
				;

fragment STRING_CONSTANT: QUOTE NONCONTROL_CHAR+ QUOTE ;
fragment DATE_CONSTANT:	YEAR DOT MONTH DOT DAY DOT HOUR DOT MINUTE 
 			  |	YEAR DOT MONTH DOT DAY DOT HOUR  
 			  | YEAR DOT MONTH DOT DAY 
 			  | YEAR DOT MONTH  
 			  | YEAR  			   
 			  ;
fragment NUMBER		: 	DIGIT+;
fragment YEAR 		: 	DIGIT DIGIT DIGIT DIGIT; 
fragment MONTH   	:  ('0'('0'.. '9')) | ('1'('0'.. '2'));
fragment DAY     	:  ('0'('1'.. '9')) | (('1'..'2')('0'.. '9')) | ('3'('0'.. '1')) ;
fragment HOUR    	:  ('0'.. '1')('0'.. '9') | '2'('0'.. '3') ;    
fragment MINUTE  	:  ('0'.. '5')('0'.. '9') ;

fragment TIMEFRAME: 'year'|'years'|'month'|'months'
									|'weeks'|'week'|'day'|'days'
									|'hour'|'hours'|'minute'|'minutes'
									;

fragment BOOL    : 'true' | 'false' ;
fragment NONCONTROL_CHAR: LETTER | DIGIT | SYMBOL | SPACE;
fragment QUOTE 	: 	'\"' ;
fragment LETTER: LOWER | UPPER;
fragment LOWER: 'a'..'z';
fragment UPPER: 'A'..'Z';
fragment DIGIT: '0'..'9';
fragment SPACE: ' ' | '\t';
fragment SYMBOL: '!' | '#'..'/' | ':'..'@' | '['..'`' | '{'..'~';	
// Note that SYMBOL does not include the double-quote character.
// Windows uses \r\n. UNIX and Mac OS X use \n.
// To use newlines as a terminator,
// they can't be written to the hidden channel!


fragment TIME_ENTITY_CONSTANT
	: 'Monday'|'Tuesday'|'Wednesday'|'Thursday'
	|'Friday'|'Saturday'|'Sunday'
	|'January'|'February'|'March'|'April'
	|'May'|'June'|'July'|'August'
	|'September'|'October'|'November'|'December'
	|'Weekend'|'Weekday'
	;

// End by Zheng





