package columbia.plt.tt;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

import org.antlr.runtime.RecognitionException;

public class HelloWorldTest {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new ByteArrayInputStream ("print(\"helloworld\");".getBytes());
		CharStream stream =  new ANTLRInputStream(in);
		HelloWorldLexer lex = new HelloWorldLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
 
        HelloWorldParser parser = new HelloWorldParser(tokens);
 
        
            try {
				parser.print();
			} catch (RecognitionException e) {
				e.printStackTrace();
			}
        
		
	}
}
