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

print : 'print' '(' '"' STRING '"' ')' ';' 
				{System.out.println($STRING.text);} ; 

STRING : 'a'..'z' + ;




