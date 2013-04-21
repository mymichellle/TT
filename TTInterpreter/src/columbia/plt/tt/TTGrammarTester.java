package columbia.plt.tt;

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

public class TTGrammarTester {

  public static void main(String[] args) throws RecognitionException {		
  	//CharStream stream = new ANTLRStringStream(	"Calendar x;");
	  CharStream stream = new ANTLRStringStream( "Calendar x; every Date d from 2013.01.01 to 2013.01.03 by tf { }");
  	TTGrammarLexer lexer = new TTGrammarLexer(stream);
  	TokenStream tokenStream = new CommonTokenStream(lexer);
  	TTGrammarParser parser = new TTGrammarParser(tokenStream);
  	
  	declarationStatement_return declaration = parser.declarationStatement();
  	System.out.println(declaration.tree.toStringTree());
  	
  	everyFromToByStatement_return every = parser.everyFromToByStatement();
  	System.out.println(every.tree.toStringTree());
  	
  	TTGrammarEvaluator evaluator = new TTGrammarEvaluator(new CommonTreeNodeStream(every.tree));//declaration.tree));
  	//evaluator.declarationStatement();
  	evaluator.everyFromToByStatement();
  }

}
