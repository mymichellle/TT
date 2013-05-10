package columbia.plt.tt.interpreter;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.TokenStream;

import columbia.plt.tt.TTLexer;
import columbia.plt.tt.TTParser;
import columbia.plt.tt.datatype.Date;

import junit.framework.TestCase;

public class InterpreterTest extends TestCase {

	private TTLexer lexer;
	private TokenStream tokenStream;
	private TTParser parser;
	private Interpreter interpreter;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	protected void setUp() throws Exception {
		super.setUp();
		interpreter = new Interpreter();
	  //  System.setOut(new PrintStream(outContent));
	  //  System.setErr(new PrintStream(errContent));
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		interpreter = null;
	    System.setOut(null);
	    System.setErr(null);
	}
	
	private void setParser(CharStream stream)
	{
		lexer = new TTLexer(stream);
		tokenStream = new CommonTokenStream(lexer);
		parser = new TTParser(tokenStream);
	}
	
	private void testEveryDate(CharStream stream)
	{
		
		CommonTree tree = null;
		setParser(stream);
		
		try {
			TTParser.translationUnit_return r = parser.translationUnit();
			tree = r.getTree();
			System.out.println(tree);
		}				
		catch (RecognitionException e) {
			e.printStackTrace();
		}
		
		assertNotNull(tree);
		interpreter.tunit(tree);
	}

	
	public void testIf(CharStream stream)
	{
		
		CommonTree tree = null;
		setParser(stream);
		
		try {
			TTParser.ifThenStatement_return r = parser.ifThenStatement();
			tree = r.getTree();
			System.out.println(tree);
		}				
		catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		assertNotNull(tree);
		interpreter.tunit(tree);
	}
	
	
	public void testEveryCases()
	{
		CharStream stream = new ANTLRStringStream( "main(){Number n = 10;}");
		testEveryDate(stream);
	    //assertEquals("hello", outContent.toString());
		
		stream = new ANTLRStringStream( "main(){every Task t from 2013.01 to 2013.02 by 2 days{}}");
		testEveryDate(stream);
		
	}

	
	public void testIfElseCases()
	{
		CharStream stream = new ANTLRStringStream( "main(){if(3 == 5){print(\"hi\");}else{}}");
		testIf(stream);
	}
	
	
	public void testPrograms()
	{
		try {

			FileInputStream fileStream = null;
			fileStream = new FileInputStream("src/columbia/plt/tt/programs/Loops.tt");
			interpreter.interp(fileStream);
			

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/ifelse.tt");
			interpreter.interp(fileStream);
			

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/declareanddefine.tt");
			interpreter.interp(fileStream);
			

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/methods.tt");
			interpreter.interp(fileStream);
			

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/operator.tt");
			interpreter.interp(fileStream);

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/Program1.tt");
			interpreter.interp(fileStream);
			

			fileStream = new FileInputStream("src/columbia/plt/tt/programs/tutorial_MeetingTime.tt");
			interpreter.interp(fileStream);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (antlr.RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
