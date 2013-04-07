// $ANTLR 3.5 /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g 2013-04-06 12:46:04

	package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloWorldLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int STRING=4;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HelloWorldLexer() {} 
	public HelloWorldLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HelloWorldLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g"; }

	// $ANTLR start "T__5"
	public final void mT__5() throws RecognitionException {
		try {
			int _type = T__5;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:11:6: ( '\"' )
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:11:8: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__5"

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:12:6: ( '(' )
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:12:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:6: ( ')' )
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:14:6: ( ';' )
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:14:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:15:6: ( 'print' )
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:15:8: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:16:8: ( ( 'a' .. 'z' )+ )
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:16:10: ( 'a' .. 'z' )+
			{
			// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:16:10: ( 'a' .. 'z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:8: ( T__5 | T__6 | T__7 | T__8 | T__9 | STRING )
		int alt2=6;
		switch ( input.LA(1) ) {
		case '\"':
			{
			alt2=1;
			}
			break;
		case '(':
			{
			alt2=2;
			}
			break;
		case ')':
			{
			alt2=3;
			}
			break;
		case ';':
			{
			alt2=4;
			}
			break;
		case 'p':
			{
			int LA2_5 = input.LA(2);
			if ( (LA2_5=='r') ) {
				int LA2_7 = input.LA(3);
				if ( (LA2_7=='i') ) {
					int LA2_8 = input.LA(4);
					if ( (LA2_8=='n') ) {
						int LA2_9 = input.LA(5);
						if ( (LA2_9=='t') ) {
							int LA2_10 = input.LA(6);
							if ( ((LA2_10 >= 'a' && LA2_10 <= 'z')) ) {
								alt2=6;
							}

							else {
								alt2=5;
							}

						}

						else {
							alt2=6;
						}

					}

					else {
						alt2=6;
					}

				}

				else {
					alt2=6;
				}

			}

			else {
				alt2=6;
			}

			}
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt2=6;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}
		switch (alt2) {
			case 1 :
				// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:10: T__5
				{
				mT__5(); 

				}
				break;
			case 2 :
				// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:15: T__6
				{
				mT__6(); 

				}
				break;
			case 3 :
				// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:20: T__7
				{
				mT__7(); 

				}
				break;
			case 4 :
				// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:25: T__8
				{
				mT__8(); 

				}
				break;
			case 5 :
				// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:30: T__9
				{
				mT__9(); 

				}
				break;
			case 6 :
				// /home/rashmi/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:35: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}



}
