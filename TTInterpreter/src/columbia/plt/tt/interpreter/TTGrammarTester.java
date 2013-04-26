package columbia.plt.tt.interpreter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import columbia.plt.tt.TTGrammarEvaluator;
import columbia.plt.tt.TTGrammarLexer;
import columbia.plt.tt.TTGrammarParser;
import columbia.plt.tt.TTGrammarParser.declarationStatement_return;
import columbia.plt.tt.TTGrammarParser.everyFromToByStatement_return;
import columbia.plt.tt.TTGrammarParser.translationUnit_return;

public class TTGrammarTester {

	public static final String pathSeparator = "/";
	public static final String programsRoot = "src/columbia/plt/tt/"; //"E:/peter/github/TT/TTInterpreter/src/columbia/plt/tt/programs/"
	
	/*
	 * Returns CharStream from the specified .tt file. 
	 * @fileName - the name of the file in our directory.
	 */
	public static CharStream getInputStremFromFile(String fileName) throws FileNotFoundException, IOException {
		if (fileName == null || fileName.isEmpty()) fileName = "Program1.tt";
		String filePath = programsRoot.replace("/",pathSeparator) + fileName;
		return new ANTLRInputStream(new FileInputStream(filePath));
	}
	
	public static void printTranslationUnitTree(TTGrammarParser parser) {
		try {
			translationUnit_return tu;
			tu = parser.translationUnit();
			System.out.println(tu.getTree().toStringTree());
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		CharStream stream;
//		try {
//			stream = getInputStremFromFile("methods.tt");
//			TTGrammarLexer lexer = new TTGrammarLexer(stream);
//			TokenStream tokenStream = new CommonTokenStream(lexer);
//			TTGrammarParser parser = new TTGrammarParser(tokenStream);
//			printTranslationUnitTree(parser);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
  public static void main(String[] args) throws RecognitionException {
    try {
      CharStream stream = new ANTLRInputStream(new FileInputStream("Program1.tt"));
      //CharStream stream = new ANTLRStringStream(	"Calendar x;");
      //CharStream stream = new ANTLRStringStream( "Calendar x; every Date d from 2013.01.01 to 2013.01.03 by tf { }");
      TTGrammarLexer lexer = new TTGrammarLexer(stream);
      TokenStream tokenStream = new CommonTokenStream(lexer);
      TTGrammarParser parser = new TTGrammarParser(tokenStream);
  	
      declarationStatement_return declaration = parser.declarationStatement();
      System.out.println(declaration.getTree().toStringTree());
  	
      everyFromToByStatement_return every = parser.everyFromToByStatement();
      System.out.println(every.getTree().toStringTree());
  	
      TTGrammarEvaluator evaluator = new TTGrammarEvaluator(new CommonTreeNodeStream(every.getTree()));//declaration.tree));
  	//evaluator.declarationStatement();
      evaluator.everyFromToByStatement();
      
      for (int i = 0; i < lexer.getErrors().size(); i ++) {
        System.out.println(lexer.getErrors().get(i));
      }
        		
      for (int i = 0; i < parser.getErrors().size(); i ++) {
      	System.out.println(lexer.getErrors().get(i));
      }
                    		
      for (int i = 0; i < evaluator.getErrors().size(); i ++) {
        System.out.println(evaluator.getErrors().get(i));
      }
    } 
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}

