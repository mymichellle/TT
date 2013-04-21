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


translationUnit
	: importedLibraries* programBody
	;

importedLibraries
	: 'import' STRING_CONSTANT ';'
	;

programBody
	: methodsAndFieldsDeclarations*
	;

methodsAndFieldsDeclarations
	: declarationStatement
	| main
	| methodDeclarations
	;

main
	: 'BEGIN' statement_type* 'END'
	;

methodDeclarations
	: methodSignature methodBody
	;

methodSignature
	: type? IDENT methodParameters
	;

methodParameters
	: '(' methodParametersList? ')'
	;

methodParametersList
	: typeDeclaration (','typeDeclaration)*
	;

typeDeclaration
	: type IDENT
	;

methodBody
	:'{' statement_type* '}'
	;

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
  : ^(dateVar=IDENT start=dateOrIdent end=dateOrIdent increment=timeframeOrIdent statements=statement_type*){
        // Create a new scope for inside the every loop
        int scopeID = symbolTable.addScope();
        
        // Add the Date IDENT to the symbol table
        Date itterDate = new Date(start.getYear(), start.getMonth(), start.getDay(), start.getHour(), start.getMinute());
        symbolTable.getScope(scopeID).addSymbol($dateVar.text, "Date", itterDate);
        
        // Perform a while loop incrementing the dateVar by increment each loop
        while( itterDate.compareTo((Date)end) <= 0) {
          int day = itterDate.getDay();
          day += $increment.result.getDays();
          
          // Update the itterDate variable
          itterDate.setDay(day);
          symbolTable.getScope(scopeID).addSymbol($dateVar.text, "Date", itterDate);
        
          System.out.println("loopDate " + itterDate.toString());
          
        }
    }
 // 'every' 'Date' IDENT 'from' dateOrIdent 'to' dateOrIdent 'by' timeframeOrIdent '{' statement_type* '}'
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
  
dateOrIdent returns [Date result]
  : IDENT         { Scope scope = symbolTable.getCurrentScope();
                    $result = (Date)scope.getSymbol($IDENT.text);}
  | DATE_CONSTANT	{ $result = new Date($DATE_CONSTANT.text);}
  ; 
  
timeframeOrIdent returns [TimeFrame result]
  : IDENT { $result = new TimeFrame(0,0,1,0,0);}
  | TIMEFRAME { $result = new TimeFrame(0,0,1,0,0);}
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
  




