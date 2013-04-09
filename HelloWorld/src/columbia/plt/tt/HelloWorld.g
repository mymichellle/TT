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

statement 	: print
		/*	| IfThenStatement
			| IfThenElseStatement
			| EveryFromToByStatement
			| EveryInStatement
			| EveryInFromToStatement
			| EveryInOnStatement
			| untilStatement
			| BreakStatement
			| ContinueStatement
			| ExitStatement
			| functionInvocationStatement*/
	;


print : 'print' '(' '"' STRING '"' ')' ';' 
				{System.out.println($STRING.text);} ; 

STRING : 'a'..'z' + ;




