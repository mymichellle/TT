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
	: 'main('WS*')' block -> ^(MAIN block)
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
	: type^ (WS*)! assignmentStmt 
	;

assignmentStmt
	: IDENT '='^ expression ';'!
	| memberAccessExpression ^'=' expression ';'!
	;

type
	: 'String'
	| 'Number'
	| 'Date'
	| 'Task'
	| 'TimeFrame'
	| 'Calendar'
	| 'Time' /* LRM was TimeEntity */
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
	: 'if' '(' expression ')' block elseStatement?
	;

elseStatement
	: 'else' block
	;

everyFromToByStatement
	: 'every'! 'Date'! IDENT^ 'from'! dateOrIdent 'to'! dateOrIdent 'by'! timeframeOrIdent block
	;

everyInStatement
	: 'every' 'Task' IDENT 'in' IDENT constraintOptions  block
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
	: 'break' ';'
	;

continueStatement
	: 'continue' ';'
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
	: 'read' '(' STRING_CONSTANT ')' ';'
	;
print : 'print' '(' STRING_CONSTANT  ')' ';' {System.out.println($STRING_CONSTANT.text);} ; 

timeFrameConstant
  : NUMBER? timeFrameSuffix
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
	:'year'
	|'years'
	|'month'
	|'months'
	|'day'
	|'days'
	|'hour'
	|'hours'
	|'minute'
	|'minutes'
	;

boolConstant
	: 'true' 
	| 'false' 
	;

timeEntityConstant
	:'Monday'
	|'Tuesday'
	|'Wednesday'
	|'Thursday'
	|'Friday'
	|'Saturday'
	|'Sunday'
	|'January'
	|'February'
	|'March'
	|'April'
	|'May'
	|'June'
	|'July'
	|'August'
	|'September'
	|'October'
	|'November'
	|'December'
	|'Weekend'
	|'Weekday'
	;
// End by Zheng
