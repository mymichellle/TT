grammar TT;

options {
	language = Java;
	output=AST;
	ASTLabelType =  CommonTree;
}
tokens {
	TUNIT;
	IMPORTS;
	IMPORT;  // is this same with IMPORTS?
	METHOD;
	ARG;
	CALL;
	SLIST;
	MAIN = 'main';
	STRINGTYPE = 'String';
	NUMBERTYPE = 'Number';
	DATETYPE = 'Date';
	TASKTYPE = 'Task';
	TIMEFRAMETYPE = 'TimeFrame';
	CALENDARTYPE = 'Calendar';
	TIMETYPE = 'Time';
	IF = 'if';
	ELSE = 'else';
	EVERY = 'every';
	FROM = 'from';
	TO = 'to';
	BY = 'by';
	IN = 'in';
	ON = 'on';
	BREAK = 'break';
	EXIT = 'exit';
	CONTINUE = 'continue';
	TRUE = 'true';
	FALSE = 'false';
	RETURN = 'return';
	READ = 'read';
	PRINT = 'print';
	TIMEFRAME_YEAR = 'year';
	TIMEFRAME_YEARS = 'years';
	TIMEFRAME_MONTH = 'month';
	TIMEFRAME_MONTHS = 'months';
	TIMEFRAME_DAY = 'day';
	TIMEFRAME_DAYS = 'days';
	TIMEFRAME_HOUR = 'hour';
	TIMEFRAME_HOURS = 'hours';
	TIMEFRAME_MINUTE = 'minute';
	TIMEFRAME_MINUTES = 'minutes';
	TIMEFRAME_MONDAY = 'Monday';
	TIMEFRAME_TUESDAY = 'Tuesday';
	TIMEFRAME_WEDNESDAY = 'Wednesday';
	TIMEFRAME_THURSDAY = 'Thursday';
	TIMEFRAME_FRIDAY = 'Friday';
	TIMEFRAME_SATURDAY = 'Saturday';
	TIMEFRAME_SUNDAY = 'Sunday';
	TIMEFRAME_JANUARY = 'January';
	TIMEFRAME_FEBRUARY = 'February';
	TIMEFRAME_MARCH = 'March';
	TIMEFRAME_APRIL = 'April';
	TIMEFRAME_MAY = 'May';
	TIMEFRAME_JUNE = 'June';
	TIMEFRAME_JULY = 'July';
	TIMEFRAME_AUGUST = 'August';
	TIMEFRAME_SEPTEMBER = 'September';
	TIMEFRAME_OCTOBER = 'October';
	TIMEFRAME_NOVEMBER = 'November';
	TIMEFRAME_DECEMBER = 'December';
	TIMEFRAME_WEEKEND = 'Weekend';
	TIMEFRAME_WEEKDAY = 'Weekday';
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
	: IMPORT STRING_CONSTANT ';' -> STRING_CONSTANT
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
	: MAIN '('WS*')' block -> ^(MAIN block)
	;

methodDeclarations
	: methodSignature block -> ^(METHOD methodSignature block)
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

// Variable declaration and definition
//@Author : Athresh

declarationStatement
	: type^ (WS*)! IDENT ';'
	;

definitionStatement
	: type (WS*)! assignmentStmt 
	;

assignmentStmt
	: IDENT ASSIGN^ expression ';'!
	| memberAccessExpression ^ASSIGN expression ';'!
	;

type
	: STRINGTYPE
	| NUMBERTYPE
	| DATETYPE
	| TASKTYPE
	| TIMEFRAMETYPE
	| CALENDARTYPE
	| TIMETYPE /* LRM was TimeEntity */
	;

//Statement
//@Author : Michelle

statement_type 
	: declarationStatement
	| definitionStatement
	| assignmentStmt
	| ifThenStatement
	| everyFromToByStatement
	| everyInStatement
	| breakStatement
	| continueStatement
	| exitStatement
	| functionInvocationStatement
	| returnStatement
	| print
	| readStatement
	;

block
	: '{' statement_type* '}'  -> ^(SLIST statement_type*)
	;



ifThenStatement
	: IF '(' expression ')' block elseStatement?
	;

elseStatement
	: ELSE block
	;

everyFromToByStatement
	: EVERY! 'Date'! IDENT^ FROM! dateOrIdent TO! dateOrIdent BY! timeframeOrIdent block
	;

everyInStatement
	: EVERY 'Task' IDENT IN IDENT constraintOptions  block
	;

constraintOptions
	: FROM dateOrIdent TO dateOrIdent loopOptions
	| loopOptions
	;

loopOptions
	: ON expression
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
	: EVERY ';'
	;

continueStatement
	: CONTINUE ';'
	;

exitStatement
	: 'exit' ';'
	;

returnStatement
	: 'return' expression? ';'
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

/* TODO: We should remove 'read' and 'print' they belong
 * to the [standard] library. */
readStatement
	: READ '(' STRING_CONSTANT ')' ';'
	;
print : PRINT '(' STRING_CONSTANT  ')' ';' {System.out.println($STRING_CONSTANT.text);} ; 

timeFrame
	//: primaryExpression timeFrameSuffix
	: (NUMBER|IDENT) timeFrameSuffix
	;

timeFrameConstant
	: timeFrame ('+' timeFrame)*
	;

// Arithmetic Expressions .. Jason
// @Author : Jason
expression
	: logicalExpression
	| functionInvocation
	;

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
	:	IDENT '.'^ IDENT 
	;

unaryExpression 
	: NOT? primaryExpression
	;

primaryExpression 
	: exprInParentheses
	| constant
	| IDENT
	| memberAccessExpression
	;

exprInParentheses
	: '(' expression ')'
	;

//Lexer Rules
ASSIGN 		: '=';
OR    		: '||';
AND   		: '&&';
EQUALS		: '==';
NOTEQUALS	: '!=';
LT    		: '<'	<assoc=right>;
LTEQ  		: '<='	<assoc=right>;
GT    		: '>'	<assoc=right>;
GTEQ  		: '>='	<assoc=right>;
PLUS  		: '+';
MINUS 		: '-';
MULT  		: '*';
DIV   		: '/';
MOD   		: 'mod';
NOT   		: 'not';

//Constants
//@Author : Zheng

DOT
	: '.'
	;

WS
	: ('\w'|'\t'|'\n'|'\r'|'\f')+
		{$channel = HIDDEN;}
	;

COMMENT 
	: '//' (~('\n'|'\r'))*
		{ $channel = HIDDEN; }
	;

constant 
	: STRING_CONSTANT
	| DATE_CONSTANT
	| NUMBER
	| timeFrameConstant
	| timeEntityConstant
	| boolConstant
	;

DATE_CONSTANT
	: YEAR DOT MONTH DOT DAY DOT HOUR DOT MINUTE
	| YEAR DOT MONTH DOT DAY DOT HOUR
	| YEAR DOT MONTH DOT DAY
	| YEAR DOT MONTH
	| YEAR 
	;
	
fragment
YEAR
	: DIGIT DIGIT DIGIT DIGIT
	; 
	
fragment
MONTH
	: ('0'('0'..'9'))
	| ('1'('0'..'2'))
	;
	
fragment
DAY
	:('0'('1'..'9')) 
	|('1'..'2'('0'..'9'))
	| ('3'('0'..'1'))
	;
	
fragment 
HOUR
	: ('0'..'1')('0'..'9')
	| '2'('0'..'3')
	;

fragment
MINUTE 
	: ('0'..'5')('0'..'9')
	;

STRING_CONSTANT
	: '"' (~('\\'|'\"') | ESCAPED_CHARS)* '"' 
	;

fragment
ESCAPED_CHARS
	: '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	;

IDENT 
	: LETTER(LETTER|DIGIT)*
	;

NUMBER
	: DIGIT+
	;
 
fragment 
LETTER
	: ('a'..'z'|'A'..'Z'|'$'|'_')
	;

fragment 
DIGIT
	: '0'..'9'
	;

//timeFrameConstant
//	: NUMBER? timeFrameSuffix
//	;

timeFrameSuffix
	: TIMEFRAME_YEAR
	| TIMEFRAME_YEARS
	| TIMEFRAME_MONTH
	| TIMEFRAME_MONTHS
	| TIMEFRAME_DAY
	| TIMEFRAME_DAYS
	| TIMEFRAME_HOUR
	| TIMEFRAME_HOURS
	| TIMEFRAME_MINUTE
	| TIMEFRAME_MINUTES
	;

boolConstant
	: TRUE
	| FALSE 
	;

timeEntityConstant
	: TIMEFRAME_MONDAY
	| TIMEFRAME_TUESDAY
	| TIMEFRAME_WEDNESDAY
	| TIMEFRAME_THURSDAY
	| TIMEFRAME_FRIDAY
	| TIMEFRAME_SATURDAY
	| TIMEFRAME_SUNDAY
	| TIMEFRAME_JANUARY
	| TIMEFRAME_FEBRUARY
	| TIMEFRAME_MARCH
	| TIMEFRAME_APRIL
	| TIMEFRAME_MAY
	| TIMEFRAME_JUNE
	| TIMEFRAME_JULY
	| TIMEFRAME_AUGUST
	| TIMEFRAME_SEPTEMBER
	| TIMEFRAME_OCTOBER
	| TIMEFRAME_NOVEMBER
	| TIMEFRAME_DECEMBER
	| TIMEFRAME_WEEKEND
	| TIMEFRAME_WEEKDAY
	;
// End by Zheng
