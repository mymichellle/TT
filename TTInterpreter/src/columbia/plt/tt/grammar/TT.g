grammar TT;

options {
	language = Java;
	output=AST;
	ASTLabelType =  CommonTree;
}
tokens {
	TUNIT;
	IMPORTS;
	METHOD;
	ARG;
	CALL;
	SLIST;
	EMPTY;
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
	EVERYDATE;
	EVERYTASK;
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
	
	OP;
	DECLARE;
	DEFINE;
	UNARY;
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
	: IDENT ASSIGN^ expr ';'!
	| memberAccessExpr ^ASSIGN expr ';'!
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
	: IF '(' expr ')' block elseStatement? -> ^(IF expr block elseStatement)
	;

elseStatement
	: ELSE block -> ^(ELSE block)
	;

everyFromToByStatement
	: EVERY 'Date' IDENT FROM dateOrIdent TO dateOrIdent BY timeframeOrIdent block -> ^(EVERYDATE ^('Date' IDENT) ^(FROM dateOrIdent) ^(TO dateOrIdent) ^(BY timeframeOrIdent) block)
	;

everyInStatement
	//: EVERY 'Task' IDENT IN IDENT constraintOptions  block -> ^(EVERYTASK ^('Task' IDENT) ^(IN IDENT) ^(constraintOptions) block)
	: EVERY 'Task' IDENT IN IDENT FROM dateOrIdent TO dateOrIdent ON expr block -> ^(EVERYTASK ^('Task' IDENT) ^(IN IDENT) ^(FROM dateOrIdent) ^(TO dateOrIdent) ^(ON expr) block)
	| EVERY 'Task' IDENT IN IDENT FROM dateOrIdent TO dateOrIdent block -> ^(EVERYTASK ^('Task' IDENT)  ^(IN IDENT) ^(FROM dateOrIdent) ^(TO dateOrIdent) block)
	| EVERY 'Task' IDENT IN IDENT ON expr block -> ^(EVERYTASK ^('Task' IDENT) ^(IN IDENT) ^(ON expr) block)
	| EVERY 'Task' IDENT IN IDENT block -> ^(EVERYTASK ^('Task' IDENT)  ^(IN IDENT) block)
	;
	
dateOrIdent
	: IDENT^
	| DATE_CONSTANT^	
	; 
	
timeframeOrIdent
	: IDENT
	| timeFrameConstant
	;

breakStatement
	: BREAK ';'
	;

continueStatement
	: CONTINUE ';'
	;

exitStatement
	: 'exit' ';'
	;

returnStatement
	: 'return' expr? ';'
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
	: expr (','expr)* -> expr*
	;

/* TODO: We should remove 'read' and 'print' they belong
 * to the [standard] library. */
readStatement
	: READ '(' STRING_CONSTANT ')' ';'
	;
print : PRINT '(' STRING_CONSTANT  ')' ';' -> ^(PRINT STRING_CONSTANT); 

timeFrameConstant
	: NUMBER timeFrameSuffix
	;

// Arithmetic Expressions .. Jason
// @Author : Jason
expr
	: logicalExpr
	| functionInvocation
	;

logicalExpr
	: booleanAndExpr (op=OR booleanAndExpr)*   -> ^(OP["booleanOrExpr"] booleanAndExpr+)
	;

booleanAndExpr
	: equalityExpr (op=AND equalityExpr)*   -> ^(OP["booleanAndExpr"] equalityExpr+)
	;

equalityExpr
	: relationalExpr (op=(EQUALS|NOTEQUALS) relationalExpr)*  -> ^(OP["equalityExpr"] relationalExpr+)
	
	;

relationalExpr
	: additiveExpr (op=(LT | LTEQ | GT | GTEQ) additiveExpr)* -> ^(OP["relationalExpr"] additiveExpr+)
	;

additiveExpr
	: multExpr (op=(PLUS | MINUS) multExpr)* -> ^(OP["additiveExpr"] multExpr+)
	;

multExpr
	: unaryExpr (op=(MULT | DIV | MOD) unaryExpr)* -> ^(OP["multExpr"] unaryExpr+)
	;

memberAccessExpr
	:	IDENT DOT IDENT 		 -> ^(DOT IDENT IDENT)
	;

unaryExpr 
	: NOT? primaryExpr    -> ^(UNARY NOT? primaryExpr)
	;

primaryExpr  			
	: exprInParentheses  			
	| constant				
	| IDENT
	| memberAccessExpr
	|	assignmentStmt
	;

exprInParentheses
	: '(' expr ')'    -> expr
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
