tree grammar TTGrammarEvaluator;

options {
  language = Java;
  tokenVocab = TTGrammar_old;
  ASTLabelType = CommonTree;
}

@header {
  package columbia.plt.tt;
  import columbia.plt.tt.datatype.Calendar;
  import columbia.plt.tt.datatype.Date;
  import columbia.plt.tt.datatype.Task;
  import columbia.plt.tt.datatype.TimeFrame;
  import columbia.plt.tt.interpreter.*;
  import columbia.plt.tt.evaluator.implementations.*;
  import org.antlr.runtime.BitSet;
  import java.util.*;
}

@members {
  private SymbolTable symbolTable = new SymbolTable();

  private ArrayList<String> errors = new ArrayList<String>();  
  
  public ArrayList<String> getErrors()
  {
	return errors;
  }
}


// Variable declaration and definition
//@Author : Athresh

declarationStatement
  : ^(e=type IDENT) {			
  	
  		
  		//we can try switch here if all of you are using java 7
  		if( e == "String"){
  			int scopeID = symbolTable.addScope();
  			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "String", null);				

  		}
  		if( e == "Number"){
  			int scopeID = symbolTable.addScope();
  			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Number", null);				
 
  		}
  		if( e == "Bool"){
  			int scopeID = symbolTable.addScope();
  			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Bool", null);				
 
  		}
  		
  		if( e == "Date"){
  			int scopeID = symbolTable.addScope();
  			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Date", null);					
  		
  		}
  		if( e == "TimeFrame"){
  			int scopeID = symbolTable.addScope();
  			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "TimeFrame", null);				

  		}
  		if (e == "Calendar") {				
  			int scopeID = symbolTable.addScope();
  			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Calendar", null);				
  			
  		}
  		if( e == "Task"){
  			int scopeID = symbolTable.addScope();
  			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Task", null);				
  		}
  	}
  ;
  
//by zheng
definitionStatement
	: ^(ASSIGN ^(IDENT t=type) er=expression) {
	    
	    if(!checkType(t, er.getType())) {
	    	CommonTree ahead = (CommonTree)input.LT(1);
	    	int line = ahead.getToken().getLine();
	    	line = ahead.getToken().getCharPositionInLine();    
	    	throw new RuntimeException("line " + line + " Type Checking Error");
	    }
	    
		else{
			if( t == "String"){				
			int scopeID = symbolTable.addScope();
			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "String", er.getValue());				
		}
		
		if( t == "Number"){
			int scopeID = symbolTable.addScope();
			symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Number", er.getValue());				

		}
		
		    if( t == "Bool"){
		    	int scopeID = symbolTable.addScope();
		    	symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Bool", er.getValue());				

			}
		
			if( t == "Date"){
				int scopeID = symbolTable.addScope();
				symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Date", er.getValue());					
		
			}
			
		    if( t == "TimeFrame"){
		    	int scopeID = symbolTable.addScope();
		    	symbolTable.getScope(scopeID).addSymbol($IDENT.text, "TimeFrame", er.getValue());				

		    }
		
		    if (t == "Calendar") {				
		    	int scopeID = symbolTable.addScope();
		    	symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Calendar", er.getValue());				
			
		    }
		    
		    if( t == "Task"){
		    	int scopeID = symbolTable.addScope();
		    	symbolTable.getScope(scopeID).addSymbol($IDENT.text, "Task", er.getValue());				
		    }
  		}
	
	}
	
	;

assignmentStmt returns [Evaluator result]
	:	^(ASSIGN IDENT e=expression){
			Scope scope = symbolTable.getCurrentScope();
			if(!scope.containKey($IDENT.text)){
				CommonTree ahead = (CommonTree)input.LT(1);
				int line = ahead.getToken().getLine();
				line = ahead.getToken().getCharPositionInLine();    
				throw new RuntimeException("line " + line + " Type Checking Error");
			}
			
		}
	|   ^(ASSIGN memberAccessExpression e=expression){
			Scope scope = symbolTable.getCurrentScope();
			if(!scope.containKey($IDENT.text)){
				CommonTree ahead = (CommonTree)input.LT(1);
				int line = ahead.getToken().getLine();
				line = ahead.getToken().getCharPositionInLine();    
				throw new RuntimeException("line " + line + " Type Checking Error");
	    }
	    }
	;

//end by zheng

type returns [String result]
  : 'String' {result = "String";}
  | 'Number' {result = "Number";}
  | 'Bool' {result = "Bool";}
  | 'Date' {result = "Date";}
  | 'Task' {result = "Task";}
  | 'TimeFrame' {result = "TimeFrame";}
  | 'Calendar' {result = "Calendar";}
  ;


//checkType returns [boolean result]
//  : 
//  ;

  
memberAccessExpression returns[Evaluator result]
	:	^(DOT IDENT IDENT )
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
  | breakStatement
  | continueStatement
  | exitStatement
  | readStatement
  | functionInvocationStatement
  ;

ifThenStatement
  : 'if' '(' expression ')' '{' statement_type* '}' elseStatement
  ;

elseStatement
  : 'else' '{' statement_type* '}'
  |
  ;
/*
everyFromToByStatement
  :'every' 'Date' IDENT 'from' dateOrIdent 'to' dateOrIdent 'by' timeframeOrIdent '{' statement_type* '}'
  ;
*/
everyFromToByStatement
  : ^('every' dateVar=IDENT start=dateOrIdent end=dateOrIdent increment=timeframeOrIdent statements=statement_type*)
  {
         System.out.println("HMM: "+$increment.result);
         // Get the current scope
              Scope currentScope = symbolTable.getCurrentScope();
              
              // Add the Date IDENT to the current symbol table
              Date itterDate = new Date(start.getYear(), start.getMonth(), start.getDay(), start.getHour(), start.getMinute());
              currentScope.addSymbol($dateVar.text, "Date", itterDate);
              
              System.out.println("begin itterDate " + itterDate.toString());
              
          System.out.println(input.LT(0));
          BufferedTreeNodeStream stream = (BufferedTreeNodeStream)input;
          int place = stream.mark();
          
          stream.seek(place);
        // Perform a while loop incrementing the dateVar by increment each loop
        while( itterDate.compareTo((Date)end) <= 0) {
          int day = itterDate.getDay();
          day += $increment.result.getDays();
          
          // Update the itterDate variable
          itterDate.setDay(day);
          currentScope.addSymbol($dateVar.text, "Date", itterDate);
        
          System.out.println("loopDate " + itterDate.toString());
          System.out.println(input.LT(1));
          //stream.rewind(place);
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
                    $result = (Date)scope.get($IDENT.text).getValue();}
  | DATE_CONSTANT	{ $result = new Date($DATE_CONSTANT.text);}
  ; 
  
timeframeOrIdent returns [TimeFrame result]
  : IDENT
  { 
    // TODO get the saved IDENT data
    $result = new TimeFrame("1 days");}
  | t=timeFrameConstant { $result = $t.result;}
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
  

print : ^('print' '(' STRING_CONSTANT ')') 		{System.out.println($STRING_CONSTANT.text);} ; 

timeFrame returns [String result]
  : p=primaryExpression
    t=('year'|'years'|'month'|'months'|'day'|'days'|'hour'|'hours'|'minute'|'minutes') 
    {
      //TODO get primaryExpression
      $result = "1 "+$t.text;
    }
  ;

timeFrameConstant returns [TimeFrame result]
  : t1=timeFrame (p='+' t2=timeFrame)* 
  {
    if ($t2.result != null && $p.text != null)
       $result = new TimeFrame($t1.result + " " + $p.text + " " + $t2.result);
    else
      $result = new TimeFrame($t1.result);
    }
 ;

//// Arithmetic Expressions .. Jason
//// @Author : Jason

         
 //// Arithmetic Expressions .. Jason
//// @Author : Jason

// need to handle a+= 
primaryExpression returns [String result]
	: ^(VARDEF VARDEF e = expression)		{ result = e;}
	| ^(VARDEF VARDEF CONSTANT	)	{ result = $CONSTANT.text;}
	| ^(VARDEF VARDEF IDENT) {	int scopeID = symbolTable.addScope();	
															result = (String)symbolTable.get(scopeID).getValue($IDENT.text);} 
  ;


expression returns [ String result]
:logicalExpression
//|stringExpression
|memberAccessExpr
|functionInvocation
;

      
logicalExpression returns [boolean result]
		: ^(OR a = booleanAndExpression b = booleanAndExpression*)	{ result = a && b ;}
    ;

booleanAndExpression returns [boolean result]
		: ^(AND a = equalityExpression b = equalityExpression*)	{result = a && b;}
    ;

// what about logical expression comparsion
equalityExpression returns [ boolean result]
		: ^(EQUALS a = relationalExpression b = relationalExpression *)			{result = a == b;}
    | ^(NOTEQUALS a = relationalExpression b = relationalExpression*)		{result = a != b;}
    ;

relationalExpression returns [boolean result]
		: ^(LT a = additionExpression b = additionExpression*)			{result = a < b;}
		| ^(LTEQ a = additionExpression b = additionExpression*)		{result = a <= b;}
		|	^(GT a = additionExpression b = additionExpression*)			{result = a > b;}
		| ^(GTEQ a = additionExpression b = additionExpression*)		{result = a >= b;}
		;

additionExpression returns [int result]
		: ^(PLUS a = multiplicationExpression b = multiplicationExpression*)		{result = a + b;}
		| ^(MINUS a = multiplicationExpression b = multiplicationExpression*)	  {result = a - b;} 
    ;

multiplicationExpression returns [int result]
		: ^(MULT a = unaryExpression b = unaryExpression*)		{result = Integer.parseInt(a) * Integer.parseInt(b); }
		| ^(DIV a = unaryExpression b = unaryExpression*)		{result = Integer.parseInt(a) / Integer.parseInt(b);}
		| ^(MOD a = unaryExpression b = unaryExpression*)		{result = Integer.parseInt(a)\% Integer.parseInt(b);}
    ;


unaryExpression returns [String result]
	: ^(VARDEF NOT? op=primaryExpression)		 { 
																				Boolean boolResult = Boolean.parseBoolean(op);
																				if ($NOT.text != null)
																						boolResult = !boolResult;
																				result = String.valueOf(boolResult);
																		}

																		
  ;


memberAccessExpr returns [String result]
	: ^(DOT IDENT IDENT)		{} //to do
	;

//stringExpression returns [String result]

 
