// $ANTLR 3.5 E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g 2013-04-17 18:58:33

  package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LogicalExpressionsLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int BOOL=4;
	public static final int DIGIT=5;
	public static final int IDENT=6;
	public static final int LETTER=7;
	public static final int NEGATION=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LogicalExpressionsLexer() {} 
	public LogicalExpressionsLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LogicalExpressionsLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:11:7: ( '!' )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:11:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:12:7: ( '&&' )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:12:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:13:7: ( '(' )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:13:9: '('
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:14:7: ( ')' )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:14:9: ')'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:15:7: ( ';' )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:15:9: ';'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:16:7: ( '=' )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:16:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:17:7: ( '||' )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:17:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:54:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:55:16: ( '0' .. '9' )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:56:6: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:56:8: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:56:17: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:57:7: ( LETTER ( LETTER | DIGIT )* )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:57:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:57:16: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:58:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:58:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:58:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | BOOL | IDENT | WS )
		int alt4=10;
		switch ( input.LA(1) ) {
		case '!':
			{
			alt4=1;
			}
			break;
		case '&':
			{
			alt4=2;
			}
			break;
		case '(':
			{
			alt4=3;
			}
			break;
		case ')':
			{
			alt4=4;
			}
			break;
		case ';':
			{
			alt4=5;
			}
			break;
		case '=':
			{
			alt4=6;
			}
			break;
		case '|':
			{
			alt4=7;
			}
			break;
		case 't':
			{
			int LA4_8 = input.LA(2);
			if ( (LA4_8=='r') ) {
				int LA4_12 = input.LA(3);
				if ( (LA4_12=='u') ) {
					int LA4_14 = input.LA(4);
					if ( (LA4_14=='e') ) {
						int LA4_16 = input.LA(5);
						if ( ((LA4_16 >= '0' && LA4_16 <= '9')||(LA4_16 >= 'A' && LA4_16 <= 'Z')||(LA4_16 >= 'a' && LA4_16 <= 'z')) ) {
							alt4=9;
						}

						else {
							alt4=8;
						}

					}

					else {
						alt4=9;
					}

				}

				else {
					alt4=9;
				}

			}

			else {
				alt4=9;
			}

			}
			break;
		case 'f':
			{
			int LA4_9 = input.LA(2);
			if ( (LA4_9=='a') ) {
				int LA4_13 = input.LA(3);
				if ( (LA4_13=='l') ) {
					int LA4_15 = input.LA(4);
					if ( (LA4_15=='s') ) {
						int LA4_17 = input.LA(5);
						if ( (LA4_17=='e') ) {
							int LA4_19 = input.LA(6);
							if ( ((LA4_19 >= '0' && LA4_19 <= '9')||(LA4_19 >= 'A' && LA4_19 <= 'Z')||(LA4_19 >= 'a' && LA4_19 <= 'z')) ) {
								alt4=9;
							}

							else {
								alt4=8;
							}

						}

						else {
							alt4=9;
						}

					}

					else {
						alt4=9;
					}

				}

				else {
					alt4=9;
				}

			}

			else {
				alt4=9;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=9;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt4=10;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:52: BOOL
				{
				mBOOL(); 

				}
				break;
			case 9 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:57: IDENT
				{
				mIDENT(); 

				}
				break;
			case 10 :
				// E:\\peter\\github\\TT\\LogicalExpressions\\src\\columbia\\plt\\tt\\LogicalExpressions.g:1:63: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
