// $ANTLR 3.5 /home/akhila/Projects/PLT/src/columbia/plt/tt/HelloWorld.g 2013-04-06 11:13:29

	package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloWorldParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "'\"'", "'('", "')'", 
		"'print'"
	};
	public static final int EOF=-1;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
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
	@Override public String getGrammarFileName() { return "/home/akhila/Projects/PLT/src/columbia/plt/tt/HelloWorld.g"; }



	// $ANTLR start "print"
	// /home/akhila/Projects/PLT/src/columbia/plt/tt/HelloWorld.g:16:1: print : 'print' '(' '\"' STRING '\"' ')' ;
	public final void print() throws RecognitionException {
		Token STRING1=null;

		try {
			// /home/akhila/Projects/PLT/src/columbia/plt/tt/HelloWorld.g:16:7: ( 'print' '(' '\"' STRING '\"' ')' )
			// /home/akhila/Projects/PLT/src/columbia/plt/tt/HelloWorld.g:17:3: 'print' '(' '\"' STRING '\"' ')'
			{
			match(input,8,FOLLOW_8_in_print44); 
			match(input,6,FOLLOW_6_in_print46); 
			match(input,5,FOLLOW_5_in_print48); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_print50); 
			match(input,5,FOLLOW_5_in_print52); 
			match(input,7,FOLLOW_7_in_print54); 
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



	public static final BitSet FOLLOW_8_in_print44 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_print46 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_5_in_print48 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_STRING_in_print50 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_5_in_print52 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_print54 = new BitSet(new long[]{0x0000000000000002L});
}
