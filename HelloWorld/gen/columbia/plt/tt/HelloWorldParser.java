// $ANTLR 3.5 /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g 2013-04-06 12:46:03

	package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloWorldParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "'\"'", "'('", "')'", 
		"';'", "'print'"
	};
	public static final int EOF=-1;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int STRING=4;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HelloWorldParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HelloWorldParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return HelloWorldParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g"; }



	// $ANTLR start "print"
	// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:1: print : 'print' '(' '\"' STRING '\"' ')' ';' ;
	public final void print() throws RecognitionException {
		Token STRING1=null;

		try {
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:7: ( 'print' '(' '\"' STRING '\"' ')' ';' )
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:9: 'print' '(' '\"' STRING '\"' ')' ';'
			{
			match(input,9,FOLLOW_9_in_print39); 
			match(input,6,FOLLOW_6_in_print41); 
			match(input,5,FOLLOW_5_in_print43); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_print45); 
			match(input,5,FOLLOW_5_in_print47); 
			match(input,7,FOLLOW_7_in_print49); 
			match(input,8,FOLLOW_8_in_print51); 
			System.out.println((STRING1!=null?STRING1.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"

	// Delegated rules



	public static final BitSet FOLLOW_9_in_print39 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_print41 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_5_in_print43 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_print45 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_5_in_print47 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_print49 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_print51 = new BitSet(new long[]{0x0000000000000002L});
}
