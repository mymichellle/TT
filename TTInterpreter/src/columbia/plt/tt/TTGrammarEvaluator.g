tree grammar TTGrammarEvaluator;

options {
  language = Java;
  tokenVocab = TTGrammar;
  ASTLabelType = CommonTree;
}

@header {
  package columbia.plt.tt;
}

@members {
  private SymbolTable symbolTable = new SymbolTable();
}


// Variable declaration and definition
//@Author : Athresh

declarationStatement
  : ^(e=type WS* IDENT WS* ';') {			
  		if (e == "Calendar") {				
  			int scopeID = symbolTable.addScope();
  			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Calendar", new Calendar("myCalendar"));				
  			Calendar c = (Calendar)symbolTable.getScope(scopeID).get($IDENT.text).getValue();
  			System.out.println(c.getName());				
  		}
  	}
  ;

type returns [String result]
  : 'String' {result = "String";}
  | 'Number' {result = "Number";}
  | 'Date' {result = "Date";}
  | 'Task' {result = "Task";}
  | 'TimeFrame' {result = "TimeFrame";}
  | 'Calendar' {result = "Calendar";}
  | 'Time' {result = "Time";}
  ;
  
definitionStatement
  : dateDefnStmt
  | calendarDefnStmt
  | timeFrameDefnStmt
  | taskDefnStmt
  | stringDefnStmt
  | numberDefnStmt
  | fieldDefnStmt
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
/*  | everyInFromToStatement
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
//  | date	
  ; 
  
timeframeOrIdent
  : IDENT
  | TIMEFRAME
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
  




