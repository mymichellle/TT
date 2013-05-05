package columbia.plt.tt.interpreter;

import java.io.IOException;
import java.io.InputStream;

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
	
	
	protected void setUp() throws Exception {
		super.setUp();
		interpreter = new Interpreter();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		interpreter = null;
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
			TTParser.everyFromToByStatement_return r = parser.everyFromToByStatement();
			tree = r.getTree();
		}				
		catch (RecognitionException e) {
			e.printStackTrace();
		}
		
		assertNotNull(tree);
		interpreter.everyDate(tree);
	}

	/*
	public void testIf()//CharStream stream)
	{
		CharStream stream = new ANTLRStringStream( "if(a){print(\"hi\";}else{}");
		
		CommonTree tree = null;
		
		lexer = new TTLexer(stream);
		tokenStream = new CommonTokenStream(lexer);
		parser = new TTParser(tokenStream);
		
		try {
			TTParser.ifThenStatement_return r = parser.ifThenStatement();
			tree = r.getTree();
			System.out.println("HERE");
		}				
		catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		assertNotNull(tree);
		interpreter.ifStatement(tree);
	}
	*/
	
	
	public void testEveryCases()
	{
		CharStream stream = new ANTLRStringStream( "every Task t from 2013.01.20 to 2013.01.21 by tf {}");
		testEveryDate(stream);
		
	}
	
	
	/*public void testIfElseCases()
	{
		CharStream stream = new ANTLRStringStream( "if(3 == 5){print(\"hi\";}else{}");
		testIf(stream);
	}*/

}
