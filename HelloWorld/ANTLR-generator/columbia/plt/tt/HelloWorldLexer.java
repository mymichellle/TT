// $ANTLR 3.5 /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g 2013-04-10 01:34:02

	package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloWorldLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int AND=4;
	public static final int BOOL=5;
	public static final int DAY=6;
	public static final int DIGIT=7;
	public static final int DIV=8;
	public static final int EQUALS=9;
	public static final int GT=10;
	public static final int GTEQ=11;
	public static final int HOUR=12;
	public static final int IDENT=13;
	public static final int LETTER=14;
	public static final int LOWER=15;
	public static final int LT=16;
	public static final int LTEQ=17;
	public static final int MINUS=18;
	public static final int MINUTE=19;
	public static final int MOD=20;
	public static final int MONTH=21;
	public static final int MULT=22;
	public static final int NONCONTROL_CHAR=23;
	public static final int NOT=24;
	public static final int NOTEQUALS=25;
	public static final int NUMBER=26;
	public static final int OR=27;
	public static final int PLUS=28;
	public static final int SPACE=29;
	public static final int STRING=30;
	public static final int SYMBOL=31;
	public static final int TIMEENTITYDAY=32;
	public static final int TIMEENTITYMONTH=33;
	public static final int TIMEENTITYWEEK=34;
	public static final int UPPER=35;
	public static final int WS=36;
	public static final int YEAR=37;

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
	@Override public String getGrammarFileName() { return "/Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g"; }

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:11:7: ( ' ' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:11:9: ' '
			{
			match(' '); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:12:7: ( '(' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:12:9: '('
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:7: ( ')' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:9: ')'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:14:7: ( '.' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:14:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:15:7: ( ';' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:15:9: ';'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:16:7: ( 'day' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:16:9: 'day'
			{
			match("day"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:7: ( 'days' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:9: 'days'
			{
			match("days"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:18:7: ( 'hour' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:18:9: 'hour'
			{
			match("hour"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:19:7: ( 'hours' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:19:9: 'hours'
			{
			match("hours"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:20:7: ( 'minute' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:20:9: 'minute'
			{
			match("minute"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:21:7: ( 'minutes' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:21:9: 'minutes'
			{
			match("minutes"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:22:7: ( 'month' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:22:9: 'month'
			{
			match("month"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:23:7: ( 'months' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:23:9: 'months'
			{
			match("months"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:24:7: ( 'print' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:24:9: 'print'
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:25:7: ( 'year' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:25:9: 'year'
			{
			match("year"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:26:7: ( 'years' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:26:9: 'years'
			{
			match("years"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:83:10: ( '||' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:83:12: '||'
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
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:84:10: ( '&&' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:84:12: '&&'
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
	// $ANTLR end "AND"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:85:10: ( '==' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:85:12: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "NOTEQUALS"
	public final void mNOTEQUALS() throws RecognitionException {
		try {
			int _type = NOTEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:86:11: ( '!=' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:86:13: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUALS"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:87:10: ( '<' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:87:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:88:10: ( '<=' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:88:12: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:89:10: ( '>' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:89:12: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:90:10: ( '>=' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:90:12: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:91:10: ( '+' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:91:12: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:92:10: ( '-' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:92:12: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:93:10: ( '*' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:93:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:94:10: ( '/' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:94:12: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:95:10: ( 'mod' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:95:12: 'mod'
			{
			match("mod"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:96:10: ( 'not' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:96:12: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "YEAR"
	public final void mYEAR() throws RecognitionException {
		try {
			int _type = YEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:104:9: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:104:12: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YEAR"

	// $ANTLR start "MONTH"
	public final void mMONTH() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:18: ( ( '0' ( '0' .. '9' ) ) | ( '1' ( '0' .. '2' ) ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='0') ) {
				alt1=1;
			}
			else if ( (LA1_0=='1') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:21: ( '0' ( '0' .. '9' ) )
					{
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:21: ( '0' ( '0' .. '9' ) )
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:22: '0' ( '0' .. '9' )
					{
					match('0'); 
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
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:40: ( '1' ( '0' .. '2' ) )
					{
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:40: ( '1' ( '0' .. '2' ) )
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:41: '1' ( '0' .. '2' )
					{
					match('1'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '2') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MONTH"

	// $ANTLR start "DAY"
	public final void mDAY() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:18: ( ( '0' ( '1' .. '9' ) ) | ( ( '1' .. '2' ) ( '0' .. '9' ) ) | ( '3' ( '0' .. '1' ) ) )
			int alt2=3;
			switch ( input.LA(1) ) {
			case '0':
				{
				alt2=1;
				}
				break;
			case '1':
			case '2':
				{
				alt2=2;
				}
				break;
			case '3':
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:21: ( '0' ( '1' .. '9' ) )
					{
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:21: ( '0' ( '1' .. '9' ) )
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:22: '0' ( '1' .. '9' )
					{
					match('0'); 
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}

					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:40: ( ( '1' .. '2' ) ( '0' .. '9' ) )
					{
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:40: ( ( '1' .. '2' ) ( '0' .. '9' ) )
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:41: ( '1' .. '2' ) ( '0' .. '9' )
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '2') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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
					break;
				case 3 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:66: ( '3' ( '0' .. '1' ) )
					{
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:66: ( '3' ( '0' .. '1' ) )
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:106:67: '3' ( '0' .. '1' )
					{
					match('3'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DAY"

	// $ANTLR start "HOUR"
	public final void mHOUR() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:108:18: ( ( '0' .. '1' ) ( '0' .. '9' ) | '2' ( '0' .. '3' ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= '0' && LA3_0 <= '1')) ) {
				alt3=1;
			}
			else if ( (LA3_0=='2') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:108:21: ( '0' .. '1' ) ( '0' .. '9' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:108:46: '2' ( '0' .. '3' )
					{
					match('2'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOUR"

	// $ANTLR start "MINUTE"
	public final void mMINUTE() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:109:18: ( ( '0' .. '5' ) ( '0' .. '9' ) )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:109:21: ( '0' .. '5' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '5') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
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
	// $ANTLR end "MINUTE"

	// $ANTLR start "TIMEENTITYDAY"
	public final void mTIMEENTITYDAY() throws RecognitionException {
		try {
			int _type = TIMEENTITYDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:14: ( 'Monday' | 'Tuesday' | 'Wednesday' | 'Thursday' | 'Friday' | 'Saturday' | 'Sunday' )
			int alt4=7;
			switch ( input.LA(1) ) {
			case 'M':
				{
				alt4=1;
				}
				break;
			case 'T':
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2=='u') ) {
					alt4=2;
				}
				else if ( (LA4_2=='h') ) {
					alt4=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'W':
				{
				alt4=3;
				}
				break;
			case 'F':
				{
				alt4=5;
				}
				break;
			case 'S':
				{
				int LA4_5 = input.LA(2);
				if ( (LA4_5=='a') ) {
					alt4=6;
				}
				else if ( (LA4_5=='u') ) {
					alt4=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:17: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:26: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 3 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:36: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 4 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:48: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 5 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:59: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 6 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:68: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 7 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:79: 'Sunday'
					{
					match("Sunday"); 

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
	// $ANTLR end "TIMEENTITYDAY"

	// $ANTLR start "TIMEENTITYMONTH"
	public final void mTIMEENTITYMONTH() throws RecognitionException {
		try {
			int _type = TIMEENTITYMONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:16: ( 'January' | 'February' | 'March' | 'April' | 'May' | 'June' | 'July' | 'August' | 'September' | 'October' | 'November' | 'December' )
			int alt5=12;
			switch ( input.LA(1) ) {
			case 'J':
				{
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='a') ) {
					alt5=1;
				}
				else if ( (LA5_1=='u') ) {
					int LA5_10 = input.LA(3);
					if ( (LA5_10=='n') ) {
						alt5=6;
					}
					else if ( (LA5_10=='l') ) {
						alt5=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'F':
				{
				alt5=2;
				}
				break;
			case 'M':
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3=='a') ) {
					int LA5_11 = input.LA(3);
					if ( (LA5_11=='r') ) {
						alt5=3;
					}
					else if ( (LA5_11=='y') ) {
						alt5=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'A':
				{
				int LA5_4 = input.LA(2);
				if ( (LA5_4=='p') ) {
					alt5=4;
				}
				else if ( (LA5_4=='u') ) {
					alt5=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'S':
				{
				alt5=9;
				}
				break;
			case 'O':
				{
				alt5=10;
				}
				break;
			case 'N':
				{
				alt5=11;
				}
				break;
			case 'D':
				{
				alt5=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:18: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:28: 'February'
					{
					match("February"); 

					}
					break;
				case 3 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:39: 'March'
					{
					match("March"); 

					}
					break;
				case 4 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:47: 'April'
					{
					match("April"); 

					}
					break;
				case 5 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:55: 'May'
					{
					match("May"); 

					}
					break;
				case 6 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:61: 'June'
					{
					match("June"); 

					}
					break;
				case 7 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:68: 'July'
					{
					match("July"); 

					}
					break;
				case 8 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:112:75: 'August'
					{
					match("August"); 

					}
					break;
				case 9 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:113:16: 'September'
					{
					match("September"); 

					}
					break;
				case 10 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:113:28: 'October'
					{
					match("October"); 

					}
					break;
				case 11 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:113:38: 'November'
					{
					match("November"); 

					}
					break;
				case 12 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:113:49: 'December'
					{
					match("December"); 

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
	// $ANTLR end "TIMEENTITYMONTH"

	// $ANTLR start "TIMEENTITYWEEK"
	public final void mTIMEENTITYWEEK() throws RecognitionException {
		try {
			int _type = TIMEENTITYWEEK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:114:16: ( 'Weekend' | 'Weekday' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='W') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='e') ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2=='e') ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3=='k') ) {
							int LA6_4 = input.LA(5);
							if ( (LA6_4=='e') ) {
								alt6=1;
							}
							else if ( (LA6_4=='d') ) {
								alt6=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:114:18: 'Weekend'
					{
					match("Weekend"); 

					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:114:28: 'Weekday'
					{
					match("Weekday"); 

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
	// $ANTLR end "TIMEENTITYWEEK"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:116:9: ( 'true' | 'false' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='t') ) {
				alt7=1;
			}
			else if ( (LA7_0=='f') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:116:11: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:116:20: 'false'
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:118:7: ( '\"' ( NONCONTROL_CHAR )* '\"' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:118:9: '\"' ( NONCONTROL_CHAR )* '\"'
			{
			match('\"'); 
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:118:13: ( NONCONTROL_CHAR )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\t'||(LA8_0 >= ' ' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '~')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
					{
					if ( input.LA(1)=='\t'||(input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '~') ) {
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
					break loop8;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "NONCONTROL_CHAR"
	public final void mNONCONTROL_CHAR() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:119:25: ( LETTER | DIGIT | SYMBOL | SPACE )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
			{
			if ( input.LA(1)=='\t'||(input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '~') ) {
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
	// $ANTLR end "NONCONTROL_CHAR"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:120:16: ( LOWER | UPPER )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:121:15: ( 'a' .. 'z' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:122:15: ( 'A' .. 'Z' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
	// $ANTLR end "UPPER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:123:15: ( '0' .. '9' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:124:15: ( ' ' | '\\t' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
	// $ANTLR end "SPACE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:126:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
			{
			if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '@')||(input.LA(1) >= '[' && input.LA(1) <= '`')||(input.LA(1) >= '{' && input.LA(1) <= '~') ) {
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
	// $ANTLR end "SYMBOL"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:133:8: ( ( '0' .. '9' )+ )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:133:10: ( '0' .. '9' )+
			{
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:133:10: ( '0' .. '9' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:134:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:134:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:134:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
					break loop10;
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
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:136:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:136:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:136:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||(LA11_0 >= '\f' && LA11_0 <= '\r')||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
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
		// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | OR | AND | EQUALS | NOTEQUALS | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | NOT | YEAR | TIMEENTITYDAY | TIMEENTITYMONTH | TIMEENTITYWEEK | BOOL | STRING | NUMBER | IDENT | WS )
		int alt12=39;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:10: T__38
				{
				mT__38(); 

				}
				break;
			case 2 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:16: T__39
				{
				mT__39(); 

				}
				break;
			case 3 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:22: T__40
				{
				mT__40(); 

				}
				break;
			case 4 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:28: T__41
				{
				mT__41(); 

				}
				break;
			case 5 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:34: T__42
				{
				mT__42(); 

				}
				break;
			case 6 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:40: T__43
				{
				mT__43(); 

				}
				break;
			case 7 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:46: T__44
				{
				mT__44(); 

				}
				break;
			case 8 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:52: T__45
				{
				mT__45(); 

				}
				break;
			case 9 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:58: T__46
				{
				mT__46(); 

				}
				break;
			case 10 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:64: T__47
				{
				mT__47(); 

				}
				break;
			case 11 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:70: T__48
				{
				mT__48(); 

				}
				break;
			case 12 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:76: T__49
				{
				mT__49(); 

				}
				break;
			case 13 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:82: T__50
				{
				mT__50(); 

				}
				break;
			case 14 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:88: T__51
				{
				mT__51(); 

				}
				break;
			case 15 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:94: T__52
				{
				mT__52(); 

				}
				break;
			case 16 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:100: T__53
				{
				mT__53(); 

				}
				break;
			case 17 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:106: OR
				{
				mOR(); 

				}
				break;
			case 18 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:109: AND
				{
				mAND(); 

				}
				break;
			case 19 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:113: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 20 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:120: NOTEQUALS
				{
				mNOTEQUALS(); 

				}
				break;
			case 21 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:130: LT
				{
				mLT(); 

				}
				break;
			case 22 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:133: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 23 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:138: GT
				{
				mGT(); 

				}
				break;
			case 24 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:141: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 25 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:146: PLUS
				{
				mPLUS(); 

				}
				break;
			case 26 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:151: MINUS
				{
				mMINUS(); 

				}
				break;
			case 27 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:157: MULT
				{
				mMULT(); 

				}
				break;
			case 28 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:162: DIV
				{
				mDIV(); 

				}
				break;
			case 29 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:166: MOD
				{
				mMOD(); 

				}
				break;
			case 30 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:170: NOT
				{
				mNOT(); 

				}
				break;
			case 31 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:174: YEAR
				{
				mYEAR(); 

				}
				break;
			case 32 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:179: TIMEENTITYDAY
				{
				mTIMEENTITYDAY(); 

				}
				break;
			case 33 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:193: TIMEENTITYMONTH
				{
				mTIMEENTITYMONTH(); 

				}
				break;
			case 34 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:209: TIMEENTITYWEEK
				{
				mTIMEENTITYWEEK(); 

				}
				break;
			case 35 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:224: BOOL
				{
				mBOOL(); 

				}
				break;
			case 36 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:229: STRING
				{
				mSTRING(); 

				}
				break;
			case 37 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:236: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 38 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:243: IDENT
				{
				mIDENT(); 

				}
				break;
			case 39 :
				// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:249: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\1\uffff\1\46\4\uffff\5\44\4\uffff\1\56\1\60\4\uffff\1\44\1\63\14\44\4"+
		"\uffff\6\44\4\uffff\1\44\1\63\1\uffff\23\44\1\147\3\44\1\153\2\44\1\156"+
		"\1\63\2\44\1\162\23\44\1\u0086\1\uffff\1\u0088\2\44\1\uffff\1\44\1\u008d"+
		"\1\uffff\1\u008e\2\44\1\uffff\12\44\2\162\5\44\1\u00a1\1\44\1\uffff\1"+
		"\u00a3\1\uffff\1\44\1\u00a6\1\u00a7\1\u00a8\2\uffff\1\44\1\162\13\44\1"+
		"\162\4\44\1\uffff\1\u00a1\1\uffff\1\u00ba\1\u00bb\3\uffff\1\u00bc\5\44"+
		"\1\u00bc\2\44\1\u00bc\2\44\1\162\3\44\1\u00c9\3\uffff\1\u00bc\2\44\2\u00cc"+
		"\3\44\2\162\2\44\1\uffff\1\u00bc\1\44\1\uffff\1\162\1\u00bc\1\44\2\162"+
		"\1\u00bc\1\162";
	static final String DFA12_eofS =
		"\u00d4\uffff";
	static final String DFA12_minS =
		"\2\11\4\uffff\1\141\1\157\1\151\1\162\1\145\4\uffff\2\75\4\uffff\1\157"+
		"\1\60\1\141\1\150\2\145\2\141\1\160\1\143\1\157\1\145\1\162\1\141\4\uffff"+
		"\1\171\1\165\1\156\1\144\1\151\1\141\4\uffff\1\164\1\60\1\uffff\1\156"+
		"\1\162\1\145\1\165\1\144\1\151\1\142\1\164\1\156\1\160\1\156\1\154\1\162"+
		"\1\147\1\164\1\166\1\143\1\165\1\154\1\60\1\162\1\165\1\164\1\60\1\156"+
		"\1\162\2\60\1\144\1\143\1\60\1\163\1\162\1\156\1\153\1\144\1\162\1\165"+
		"\1\144\1\164\1\165\1\145\1\171\1\151\1\165\1\157\3\145\1\163\1\60\1\uffff"+
		"\1\60\1\164\1\150\1\uffff\1\164\1\60\1\uffff\1\60\1\141\1\150\1\uffff"+
		"\1\144\1\163\1\145\1\144\1\141\1\165\1\162\1\141\1\145\1\141\2\60\1\154"+
		"\1\163\1\142\2\155\1\60\1\145\1\uffff\1\60\1\uffff\1\145\3\60\2\uffff"+
		"\1\171\1\60\1\141\1\144\1\163\1\156\1\141\1\171\1\141\1\144\1\171\1\155"+
		"\1\162\1\60\1\164\1\145\2\142\1\uffff\1\60\1\uffff\2\60\3\uffff\1\60\1"+
		"\171\1\141\2\144\1\171\1\60\1\162\1\141\1\60\1\142\1\171\1\60\1\162\2"+
		"\145\1\60\3\uffff\1\60\1\171\1\141\2\60\2\171\1\145\2\60\2\162\1\uffff"+
		"\1\60\1\171\1\uffff\2\60\1\162\4\60";
	static final String DFA12_maxS =
		"\1\174\1\40\4\uffff\1\141\2\157\1\162\1\145\4\uffff\2\75\4\uffff\1\157"+
		"\1\71\1\157\1\165\1\145\1\162\3\165\1\143\1\157\1\145\1\162\1\141\4\uffff"+
		"\1\171\1\165\2\156\1\151\1\141\4\uffff\1\164\1\71\1\uffff\1\156\1\171"+
		"\1\145\1\165\1\145\1\151\1\142\1\164\1\156\1\160\2\156\1\162\1\147\1\164"+
		"\1\166\1\143\1\165\1\154\1\172\1\162\1\165\1\164\1\172\1\156\1\162\1\172"+
		"\1\71\1\144\1\143\1\172\1\163\1\162\1\156\1\153\1\144\1\162\1\165\1\144"+
		"\1\164\1\165\1\145\1\171\1\151\1\165\1\157\3\145\1\163\1\172\1\uffff\1"+
		"\172\1\164\1\150\1\uffff\1\164\1\172\1\uffff\1\71\1\141\1\150\1\uffff"+
		"\1\144\1\163\2\145\1\141\1\165\1\162\1\141\1\145\1\141\2\172\1\154\1\163"+
		"\1\142\2\155\1\172\1\145\1\uffff\1\172\1\uffff\1\145\3\172\2\uffff\1\171"+
		"\1\172\1\141\1\144\1\163\1\156\1\141\1\171\1\141\1\144\1\171\1\155\1\162"+
		"\1\172\1\164\1\145\2\142\1\uffff\1\172\1\uffff\2\172\3\uffff\1\172\1\171"+
		"\1\141\2\144\1\171\1\172\1\162\1\141\1\172\1\142\1\171\1\172\1\162\2\145"+
		"\1\172\3\uffff\1\172\1\171\1\141\2\172\2\171\1\145\2\172\2\162\1\uffff"+
		"\1\172\1\171\1\uffff\2\172\1\162\4\172";
	static final String DFA12_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\5\5\uffff\1\21\1\22\1\23\1\24\2\uffff\1\31\1\32"+
		"\1\33\1\34\16\uffff\1\44\1\46\1\47\1\1\6\uffff\1\26\1\25\1\30\1\27\2\uffff"+
		"\1\45\63\uffff\1\6\3\uffff\1\35\2\uffff\1\36\3\uffff\1\41\23\uffff\1\7"+
		"\1\uffff\1\10\4\uffff\1\17\1\37\22\uffff\1\43\1\uffff\1\11\2\uffff\1\14"+
		"\1\16\1\20\21\uffff\1\12\1\15\1\40\14\uffff\1\13\2\uffff\1\42\7\uffff";
	static final String DFA12_specialS =
		"\u00d4\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\45\1\uffff\2\45\22\uffff\1\1\1\16\1\43\3\uffff\1\14\1\uffff\1\2\1"+
			"\3\1\23\1\21\1\uffff\1\22\1\4\1\24\12\26\1\uffff\1\5\1\17\1\15\1\20\2"+
			"\uffff\1\35\2\44\1\40\1\44\1\32\3\44\1\34\2\44\1\27\1\37\1\36\3\44\1"+
			"\33\1\30\2\44\1\31\3\44\6\uffff\3\44\1\6\1\44\1\42\1\44\1\7\4\44\1\10"+
			"\1\25\1\44\1\11\3\44\1\41\4\44\1\12\1\44\1\uffff\1\13",
			"\2\45\1\uffff\2\45\22\uffff\1\45",
			"",
			"",
			"",
			"",
			"\1\47",
			"\1\50",
			"\1\51\5\uffff\1\52",
			"\1\53",
			"\1\54",
			"",
			"",
			"",
			"",
			"\1\55",
			"\1\57",
			"",
			"",
			"",
			"",
			"\1\61",
			"\12\62",
			"\1\65\15\uffff\1\64",
			"\1\67\14\uffff\1\66",
			"\1\70",
			"\1\72\14\uffff\1\71",
			"\1\73\3\uffff\1\75\17\uffff\1\74",
			"\1\76\23\uffff\1\77",
			"\1\100\4\uffff\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"",
			"",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\113\11\uffff\1\112",
			"\1\114",
			"\1\115",
			"",
			"",
			"",
			"",
			"\1\116",
			"\12\117",
			"",
			"\1\120",
			"\1\121\6\uffff\1\122",
			"\1\123",
			"\1\124",
			"\1\125\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\136\1\uffff\1\135",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\12\44\7\uffff\32\44\6\uffff\22\44\1\146\7\44",
			"\1\150",
			"\1\151",
			"\1\152",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\154",
			"\1\155",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\157",
			"\1\160",
			"\1\161",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"",
			"\12\44\7\uffff\32\44\6\uffff\22\44\1\u0087\7\44",
			"\1\u0089",
			"\1\u008a",
			"",
			"\1\u008b",
			"\12\44\7\uffff\32\44\6\uffff\22\44\1\u008c\7\44",
			"",
			"\12\63",
			"\1\u008f",
			"\1\u0090",
			"",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0095\1\u0094",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00a2",
			"",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"",
			"\1\u00a4",
			"\12\44\7\uffff\32\44\6\uffff\22\44\1\u00a5\7\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"",
			"",
			"\1\u00a9",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"",
			"\12\44\7\uffff\32\44\6\uffff\22\44\1\u00b9\7\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"",
			"",
			"",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00c2",
			"\1\u00c3",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00c4",
			"\1\u00c5",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"",
			"",
			"",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00ca",
			"\1\u00cb",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00d0",
			"\1\u00d1",
			"",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00d2",
			"",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\1\u00d3",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44",
			"\12\44\7\uffff\32\44\6\uffff\32\44"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | OR | AND | EQUALS | NOTEQUALS | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | NOT | YEAR | TIMEENTITYDAY | TIMEENTITYMONTH | TIMEENTITYWEEK | BOOL | STRING | NUMBER | IDENT | WS );";
		}
	}

}
