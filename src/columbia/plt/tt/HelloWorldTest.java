package plt.tt;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import columbia.plt.tt.HelloWorldLexer;
import columbia.plt.tt.HelloWorldParser;

public class HelloWorldTest {

	public static void main(String[] args) throws RecognitionException{
		
		CharStream stream = new ANTLRStringStream("print(\"helloworld\")");
		HelloWorldLexer lexer = new HelloWorldLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		HelloWorldParser parser =  new HelloWorldParser (tokenStream);
		parser.print();	
		
		
	}
}
