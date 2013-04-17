// $ANTLR 3.5 /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g 2013-04-15 14:17:47

	package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloWorldLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BOOL=6;
	public static final int COMMENT=7;
	public static final int DAY=8;
	public static final int DIGIT=9;
	public static final int DIV=10;
	public static final int EQUALS=11;
	public static final int GT=12;
	public static final int GTEQ=13;
	public static final int HOUR=14;
	public static final int IDENT=15;
	public static final int LETTER=16;
	public static final int LOWER=17;
	public static final int LT=18;
	public static final int LTEQ=19;
	public static final int MINUS=20;
	public static final int MINUTE=21;
	public static final int MOD=22;
	public static final int MONTH=23;
	public static final int MULT=24;
	public static final int NONCONTROL_CHAR=25;
	public static final int NOT=26;
	public static final int NOTEQUALS=27;
	public static final int NUMBER=28;
	public static final int OR=29;
	public static final int PLUS=30;
	public static final int QUOTE=31;
	public static final int SPACE=32;
	public static final int STRING=33;
	public static final int STRING_CONSTANT=34;
	public static final int SYMBOL=35;
	public static final int TIMEENTITYDAY=36;
	public static final int TIMEENTITYMONTH=37;
	public static final int TIMEENTITYWEEK=38;
	public static final int UPPER=39;
	public static final int WS=40;
	public static final int YEAR=41;

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
	@Override public String getGrammarFileName() { return "/home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g"; }

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:11:7: ( '(' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:11:9: '('
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:12:7: ( ')' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:12:9: ')'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:7: ( '.' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:9: '.'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:14:7: ( ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:14:9: ';'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:15:7: ( 'Calendar' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:15:9: 'Calendar'
			{
			match("Calendar"); 

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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:16:7: ( 'Date' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:16:9: 'Date'
			{
			match("Date"); 

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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:7: ( 'Number' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:9: 'Number'
			{
			match("Number"); 

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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:18:7: ( 'Read' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:18:9: 'Read'
			{
			match("Read"); 

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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:19:7: ( 'String' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:19:9: 'String'
			{
			match("String"); 

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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:20:7: ( 'Task' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:20:9: 'Task'
			{
			match("Task"); 

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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:21:7: ( 'TimeFrame' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:21:9: 'TimeFrame'
			{
			match("TimeFrame"); 

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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:22:7: ( 'Timeframe' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:22:9: 'Timeframe'
			{
			match("Timeframe"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:23:7: ( 'break' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:23:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:24:7: ( 'by' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:24:9: 'by'
			{
			match("by"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:25:7: ( 'continue' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:25:9: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:26:7: ( 'day' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:26:9: 'day'
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:27:7: ( 'days' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:27:9: 'days'
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
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:28:7: ( 'description' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:28:9: 'description'
			{
			match("description"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:29:7: ( 'else' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:29:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:30:7: ( 'end' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:30:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:31:7: ( 'every' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:31:9: 'every'
			{
			match("every"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:7: ( 'exit' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:9: 'exit'
			{
			match("exit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:33:7: ( 'from' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:33:9: 'from'
			{
			match("from"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:34:7: ( 'hour' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:34:9: 'hour'
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
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:35:7: ( 'hours' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:35:9: 'hours'
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
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:36:7: ( 'if' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:36:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:37:7: ( 'in' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:37:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:38:7: ( 'location' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:38:9: 'location'
			{
			match("location"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:39:7: ( 'minute' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:39:9: 'minute'
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
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:40:7: ( 'minutes' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:40:9: 'minutes'
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
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:7: ( 'month' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:9: 'month'
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
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:42:7: ( 'months' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:42:9: 'months'
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
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:43:7: ( 'name' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:43:9: 'name'
			{
			match("name"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:44:7: ( 'on' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:44:9: 'on'
			{
			match("on"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:45:7: ( 'print' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:45:9: 'print'
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
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:7: ( 'start' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:9: 'start'
			{
			match("start"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:7: ( 'to' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:48:7: ( 'until' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:48:9: 'until'
			{
			match("until"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:49:7: ( 'year' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:49:9: 'year'
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
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:50:7: ( 'years' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:50:9: 'years'
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
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:7: ( '{' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:52:7: ( '}' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:52:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:235:10: ( '=' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:235:12: '='
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
	// $ANTLR end "ASSIGN"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:236:9: ( '||' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:236:11: '||'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:237:9: ( '&&' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:237:11: '&&'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:238:9: ( '==' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:238:11: '=='
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:239:11: ( '!=' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:239:13: '!='
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:240:9: ( '<' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:240:11: '<'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:241:9: ( '<=' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:241:11: '<='
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:242:9: ( '>' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:242:11: '>'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:243:9: ( '>=' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:243:11: '>='
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:244:9: ( '+' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:244:11: '+'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:245:9: ( '-' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:245:11: '-'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:246:9: ( '*' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:246:11: '*'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:247:9: ( '/' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:247:11: '/'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:248:9: ( 'mod' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:248:11: 'mod'
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:249:9: ( 'not' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:249:11: 'not'
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

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:253:9: ( ( DIGIT )+ )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:253:12: ( DIGIT )+
			{
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:253:12: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
	// $ANTLR end "NUMBER"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:254:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:254:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:254:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:255:9: ( QUOTE ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )+ QUOTE )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:255:12: QUOTE ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )+ QUOTE
			{
			mQUOTE(); 

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:255:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==' '||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
					{
					if ( input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			mQUOTE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:256:8: ( '\\\"' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:256:11: '\\\"'
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
	// $ANTLR end "QUOTE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:257:7: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:257:10: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:257:10: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:258:9: ( '//' (~ ( '\\n' | '\\r' ) )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:258:12: '//' (~ ( '\\n' | '\\r' ) )*
			{
			match("//"); 

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:258:17: (~ ( '\\n' | '\\r' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
					break loop5;
				}
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
	// $ANTLR end "COMMENT"

	// $ANTLR start "YEAR"
	public final void mYEAR() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:261:18: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:261:21: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YEAR"

	// $ANTLR start "MONTH"
	public final void mMONTH() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:262:18: ( ( '0' ( '0' .. '9' ) ) | ( '1' ( '0' .. '2' ) ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				alt6=1;
			}
			else if ( (LA6_0=='1') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:262:21: ( '0' ( '0' .. '9' ) )
					{
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:262:21: ( '0' ( '0' .. '9' ) )
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:262:22: '0' ( '0' .. '9' )
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
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:262:40: ( '1' ( '0' .. '2' ) )
					{
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:262:40: ( '1' ( '0' .. '2' ) )
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:262:41: '1' ( '0' .. '2' )
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:18: ( ( '0' ( '1' .. '9' ) ) | ( ( '1' .. '2' ) ( '0' .. '9' ) ) | ( '3' ( '0' .. '1' ) ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case '0':
				{
				alt7=1;
				}
				break;
			case '1':
			case '2':
				{
				alt7=2;
				}
				break;
			case '3':
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:21: ( '0' ( '1' .. '9' ) )
					{
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:21: ( '0' ( '1' .. '9' ) )
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:22: '0' ( '1' .. '9' )
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
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:40: ( ( '1' .. '2' ) ( '0' .. '9' ) )
					{
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:40: ( ( '1' .. '2' ) ( '0' .. '9' ) )
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:41: ( '1' .. '2' ) ( '0' .. '9' )
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
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:66: ( '3' ( '0' .. '1' ) )
					{
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:66: ( '3' ( '0' .. '1' ) )
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:263:67: '3' ( '0' .. '1' )
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:265:18: ( ( '0' .. '1' ) ( '0' .. '9' ) | '2' ( '0' .. '3' ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= '0' && LA8_0 <= '1')) ) {
				alt8=1;
			}
			else if ( (LA8_0=='2') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:265:21: ( '0' .. '1' ) ( '0' .. '9' )
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
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:265:46: '2' ( '0' .. '3' )
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:266:18: ( ( '0' .. '5' ) ( '0' .. '9' ) )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:266:21: ( '0' .. '5' ) ( '0' .. '9' )
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:268:23: ( 'Monday' | 'Tuesday' | 'Wednesday' | 'Thursday' | 'Friday' | 'Saturday' | 'Sunday' )
			int alt9=7;
			switch ( input.LA(1) ) {
			case 'M':
				{
				alt9=1;
				}
				break;
			case 'T':
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2=='u') ) {
					alt9=2;
				}
				else if ( (LA9_2=='h') ) {
					alt9=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'W':
				{
				alt9=3;
				}
				break;
			case 'F':
				{
				alt9=5;
				}
				break;
			case 'S':
				{
				int LA9_5 = input.LA(2);
				if ( (LA9_5=='a') ) {
					alt9=6;
				}
				else if ( (LA9_5=='u') ) {
					alt9=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:268:26: 'Monday'
					{
					match("Monday"); 

					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:268:35: 'Tuesday'
					{
					match("Tuesday"); 

					}
					break;
				case 3 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:268:45: 'Wednesday'
					{
					match("Wednesday"); 

					}
					break;
				case 4 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:268:57: 'Thursday'
					{
					match("Thursday"); 

					}
					break;
				case 5 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:268:68: 'Friday'
					{
					match("Friday"); 

					}
					break;
				case 6 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:268:77: 'Saturday'
					{
					match("Saturday"); 

					}
					break;
				case 7 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:268:88: 'Sunday'
					{
					match("Sunday"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMEENTITYDAY"

	// $ANTLR start "TIMEENTITYMONTH"
	public final void mTIMEENTITYMONTH() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:25: ( 'January' | 'February' | 'March' | 'April' | 'May' | 'June' | 'July' | 'August' | 'September' | 'October' | 'November' | 'December' )
			int alt10=12;
			switch ( input.LA(1) ) {
			case 'J':
				{
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='a') ) {
					alt10=1;
				}
				else if ( (LA10_1=='u') ) {
					int LA10_10 = input.LA(3);
					if ( (LA10_10=='n') ) {
						alt10=6;
					}
					else if ( (LA10_10=='l') ) {
						alt10=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 10, input);
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
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'F':
				{
				alt10=2;
				}
				break;
			case 'M':
				{
				int LA10_3 = input.LA(2);
				if ( (LA10_3=='a') ) {
					int LA10_11 = input.LA(3);
					if ( (LA10_11=='r') ) {
						alt10=3;
					}
					else if ( (LA10_11=='y') ) {
						alt10=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 11, input);
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
							new NoViableAltException("", 10, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'A':
				{
				int LA10_4 = input.LA(2);
				if ( (LA10_4=='p') ) {
					alt10=4;
				}
				else if ( (LA10_4=='u') ) {
					alt10=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'S':
				{
				alt10=9;
				}
				break;
			case 'O':
				{
				alt10=10;
				}
				break;
			case 'N':
				{
				alt10=11;
				}
				break;
			case 'D':
				{
				alt10=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:27: 'January'
					{
					match("January"); 

					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:37: 'February'
					{
					match("February"); 

					}
					break;
				case 3 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:48: 'March'
					{
					match("March"); 

					}
					break;
				case 4 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:56: 'April'
					{
					match("April"); 

					}
					break;
				case 5 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:64: 'May'
					{
					match("May"); 

					}
					break;
				case 6 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:70: 'June'
					{
					match("June"); 

					}
					break;
				case 7 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:77: 'July'
					{
					match("July"); 

					}
					break;
				case 8 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:269:84: 'August'
					{
					match("August"); 

					}
					break;
				case 9 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:270:16: 'September'
					{
					match("September"); 

					}
					break;
				case 10 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:270:28: 'October'
					{
					match("October"); 

					}
					break;
				case 11 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:270:38: 'November'
					{
					match("November"); 

					}
					break;
				case 12 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:270:49: 'December'
					{
					match("December"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMEENTITYMONTH"

	// $ANTLR start "TIMEENTITYWEEK"
	public final void mTIMEENTITYWEEK() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:271:25: ( 'Weekend' | 'Weekday' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='W') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='e') ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2=='e') ) {
						int LA11_3 = input.LA(4);
						if ( (LA11_3=='k') ) {
							int LA11_4 = input.LA(5);
							if ( (LA11_4=='e') ) {
								alt11=1;
							}
							else if ( (LA11_4=='d') ) {
								alt11=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 4, input);
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
									new NoViableAltException("", 11, 3, input);
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
								new NoViableAltException("", 11, 2, input);
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
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:271:27: 'Weekend'
					{
					match("Weekend"); 

					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:271:37: 'Weekday'
					{
					match("Weekday"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMEENTITYWEEK"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:273:18: ( 'true' | 'false' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='t') ) {
				alt12=1;
			}
			else if ( (LA12_0=='f') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:273:20: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:273:29: 'false'
					{
					match("false"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "STRING_CONSTANT"
	public final void mSTRING_CONSTANT() throws RecognitionException {
		try {
			int _type = STRING_CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:275:16: ( '\"' ( NONCONTROL_CHAR )* '\"' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:275:18: '\"' ( NONCONTROL_CHAR )* '\"'
			{
			match('\"'); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:275:22: ( NONCONTROL_CHAR )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\t'||(LA13_0 >= ' ' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '~')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
					break loop13;
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
	// $ANTLR end "STRING_CONSTANT"

	// $ANTLR start "NONCONTROL_CHAR"
	public final void mNONCONTROL_CHAR() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:276:25: ( LETTER | DIGIT | SYMBOL | SPACE )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:277:16: ( LOWER | UPPER )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:278:15: ( 'a' .. 'z' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:279:15: ( 'A' .. 'Z' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:280:15: ( '0' .. '9' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:281:15: ( ' ' | '\\t' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:283:16: ( '!' | '#' .. '/' | ':' .. '@' | '[' .. '`' | '{' .. '~' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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

	@Override
	public void mTokens() throws RecognitionException {
		// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:8: ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | ASSIGN | OR | AND | EQUALS | NOTEQUALS | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | NOT | NUMBER | IDENT | STRING | QUOTE | WS | COMMENT | STRING_CONSTANT )
		int alt14=64;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:10: T__42
				{
				mT__42(); 

				}
				break;
			case 2 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:16: T__43
				{
				mT__43(); 

				}
				break;
			case 3 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:22: T__44
				{
				mT__44(); 

				}
				break;
			case 4 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:28: T__45
				{
				mT__45(); 

				}
				break;
			case 5 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:34: T__46
				{
				mT__46(); 

				}
				break;
			case 6 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:40: T__47
				{
				mT__47(); 

				}
				break;
			case 7 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:46: T__48
				{
				mT__48(); 

				}
				break;
			case 8 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:52: T__49
				{
				mT__49(); 

				}
				break;
			case 9 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:58: T__50
				{
				mT__50(); 

				}
				break;
			case 10 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:64: T__51
				{
				mT__51(); 

				}
				break;
			case 11 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:70: T__52
				{
				mT__52(); 

				}
				break;
			case 12 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:76: T__53
				{
				mT__53(); 

				}
				break;
			case 13 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:82: T__54
				{
				mT__54(); 

				}
				break;
			case 14 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:88: T__55
				{
				mT__55(); 

				}
				break;
			case 15 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:94: T__56
				{
				mT__56(); 

				}
				break;
			case 16 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:100: T__57
				{
				mT__57(); 

				}
				break;
			case 17 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:106: T__58
				{
				mT__58(); 

				}
				break;
			case 18 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:112: T__59
				{
				mT__59(); 

				}
				break;
			case 19 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:118: T__60
				{
				mT__60(); 

				}
				break;
			case 20 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:124: T__61
				{
				mT__61(); 

				}
				break;
			case 21 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:130: T__62
				{
				mT__62(); 

				}
				break;
			case 22 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:136: T__63
				{
				mT__63(); 

				}
				break;
			case 23 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:142: T__64
				{
				mT__64(); 

				}
				break;
			case 24 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:148: T__65
				{
				mT__65(); 

				}
				break;
			case 25 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:154: T__66
				{
				mT__66(); 

				}
				break;
			case 26 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:160: T__67
				{
				mT__67(); 

				}
				break;
			case 27 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:166: T__68
				{
				mT__68(); 

				}
				break;
			case 28 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:172: T__69
				{
				mT__69(); 

				}
				break;
			case 29 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:178: T__70
				{
				mT__70(); 

				}
				break;
			case 30 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:184: T__71
				{
				mT__71(); 

				}
				break;
			case 31 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:190: T__72
				{
				mT__72(); 

				}
				break;
			case 32 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:196: T__73
				{
				mT__73(); 

				}
				break;
			case 33 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:202: T__74
				{
				mT__74(); 

				}
				break;
			case 34 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:208: T__75
				{
				mT__75(); 

				}
				break;
			case 35 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:214: T__76
				{
				mT__76(); 

				}
				break;
			case 36 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:220: T__77
				{
				mT__77(); 

				}
				break;
			case 37 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:226: T__78
				{
				mT__78(); 

				}
				break;
			case 38 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:232: T__79
				{
				mT__79(); 

				}
				break;
			case 39 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:238: T__80
				{
				mT__80(); 

				}
				break;
			case 40 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:244: T__81
				{
				mT__81(); 

				}
				break;
			case 41 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:250: T__82
				{
				mT__82(); 

				}
				break;
			case 42 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:256: T__83
				{
				mT__83(); 

				}
				break;
			case 43 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:262: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 44 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:269: OR
				{
				mOR(); 

				}
				break;
			case 45 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:272: AND
				{
				mAND(); 

				}
				break;
			case 46 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:276: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 47 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:283: NOTEQUALS
				{
				mNOTEQUALS(); 

				}
				break;
			case 48 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:293: LT
				{
				mLT(); 

				}
				break;
			case 49 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:296: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 50 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:301: GT
				{
				mGT(); 

				}
				break;
			case 51 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:304: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 52 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:309: PLUS
				{
				mPLUS(); 

				}
				break;
			case 53 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:314: MINUS
				{
				mMINUS(); 

				}
				break;
			case 54 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:320: MULT
				{
				mMULT(); 

				}
				break;
			case 55 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:325: DIV
				{
				mDIV(); 

				}
				break;
			case 56 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:329: MOD
				{
				mMOD(); 

				}
				break;
			case 57 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:333: NOT
				{
				mNOT(); 

				}
				break;
			case 58 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:337: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 59 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:344: IDENT
				{
				mIDENT(); 

				}
				break;
			case 60 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:350: STRING
				{
				mSTRING(); 

				}
				break;
			case 61 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:357: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 62 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:363: WS
				{
				mWS(); 

				}
				break;
			case 63 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:366: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 64 :
				// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:1:374: STRING_CONSTANT
				{
				mSTRING_CONSTANT(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\5\uffff\26\50\2\uffff\1\113\3\uffff\1\115\1\117\3\uffff\1\121\2\uffff"+
		"\1\122\1\uffff\10\50\1\135\11\50\1\147\1\150\5\50\1\157\2\50\1\162\2\50"+
		"\13\uffff\10\50\1\uffff\1\50\1\u0080\2\50\1\u0083\4\50\2\uffff\3\50\1"+
		"\u008b\1\50\1\u008d\1\uffff\2\50\1\uffff\2\50\1\uffff\1\50\1\u0094\1\50"+
		"\1\u0096\1\50\1\u0098\3\50\1\u009d\1\uffff\1\50\1\u009f\1\uffff\1\50\1"+
		"\u00a1\1\u00a2\1\u00a4\3\50\1\uffff\1\u00a8\1\uffff\3\50\1\u00ad\1\uffff"+
		"\1\50\1\uffff\1\50\1\uffff\1\50\1\uffff\2\50\1\u00b3\1\50\1\uffff\1\50"+
		"\1\uffff\1\u00b6\2\uffff\1\u00b7\1\uffff\2\50\1\u00bb\1\uffff\1\u00bc"+
		"\1\u00bd\1\u00be\1\u00bf\1\uffff\1\50\1\u00c1\1\u00c2\2\50\1\uffff\2\50"+
		"\2\uffff\1\50\1\u00c9\1\u00ca\5\uffff\1\50\2\uffff\5\50\1\u00d1\2\uffff"+
		"\1\u00d2\2\50\1\u00d5\1\50\1\u00d7\2\uffff\1\u00d8\1\u00d9\1\uffff\1\50"+
		"\3\uffff\1\50\1\u00dc\1\uffff";
	static final String DFA14_eofS =
		"\u00dd\uffff";
	static final String DFA14_minS =
		"\1\11\4\uffff\2\141\1\165\1\145\1\164\1\141\1\162\1\157\1\141\1\154\1"+
		"\162\1\157\1\146\1\157\1\151\1\141\1\156\1\162\1\164\1\157\1\156\1\145"+
		"\2\uffff\1\75\3\uffff\2\75\3\uffff\1\57\2\uffff\1\11\1\uffff\1\154\1\164"+
		"\1\155\1\141\1\162\1\163\1\155\1\145\1\60\1\156\1\171\2\163\1\144\1\145"+
		"\1\151\1\157\1\165\2\60\1\143\1\156\1\144\1\155\1\164\1\60\1\151\1\141"+
		"\1\60\1\164\1\141\11\uffff\1\11\1\uffff\2\145\1\142\1\144\1\151\1\153"+
		"\1\145\1\141\1\uffff\1\164\1\60\1\143\1\145\1\60\1\162\1\164\1\155\1\162"+
		"\2\uffff\1\141\1\165\1\164\1\60\1\145\1\60\1\uffff\1\156\1\162\1\uffff"+
		"\1\151\1\162\1\uffff\1\156\1\60\1\145\1\60\1\156\1\60\1\106\1\153\1\151"+
		"\1\60\1\uffff\1\162\1\60\1\uffff\1\171\3\60\2\164\1\150\1\uffff\1\60\1"+
		"\uffff\2\164\1\154\1\60\1\uffff\1\144\1\uffff\1\162\1\uffff\1\147\1\uffff"+
		"\2\162\1\60\1\156\1\uffff\1\151\1\uffff\1\60\2\uffff\1\60\1\uffff\1\151"+
		"\1\145\1\60\1\uffff\4\60\1\uffff\1\141\2\60\2\141\1\uffff\1\165\1\160"+
		"\2\uffff\1\157\2\60\5\uffff\1\162\2\uffff\2\155\1\145\1\164\1\156\1\60"+
		"\2\uffff\1\60\2\145\1\60\1\151\1\60\2\uffff\2\60\1\uffff\1\157\3\uffff"+
		"\1\156\1\60\1\uffff";
	static final String DFA14_maxS =
		"\1\175\4\uffff\2\141\1\165\1\145\1\164\1\151\1\171\1\157\1\145\1\170\1"+
		"\162\1\157\1\156\3\157\1\156\1\162\1\164\1\157\1\156\1\145\2\uffff\1\75"+
		"\3\uffff\2\75\3\uffff\1\57\2\uffff\1\176\1\uffff\1\154\1\164\1\155\1\141"+
		"\1\162\1\163\1\155\1\145\1\172\1\156\1\171\2\163\1\144\1\145\1\151\1\157"+
		"\1\165\2\172\1\143\2\156\1\155\1\164\1\172\1\151\1\141\1\172\1\164\1\141"+
		"\11\uffff\1\176\1\uffff\2\145\1\142\1\144\1\151\1\153\1\145\1\141\1\uffff"+
		"\1\164\1\172\1\143\1\145\1\172\1\162\1\164\1\155\1\162\2\uffff\1\141\1"+
		"\165\1\164\1\172\1\145\1\172\1\uffff\1\156\1\162\1\uffff\1\151\1\162\1"+
		"\uffff\1\156\1\172\1\145\1\172\1\156\1\172\1\146\1\153\1\151\1\172\1\uffff"+
		"\1\162\1\172\1\uffff\1\171\3\172\2\164\1\150\1\uffff\1\172\1\uffff\2\164"+
		"\1\154\1\172\1\uffff\1\144\1\uffff\1\162\1\uffff\1\147\1\uffff\2\162\1"+
		"\172\1\156\1\uffff\1\151\1\uffff\1\172\2\uffff\1\172\1\uffff\1\151\1\145"+
		"\1\172\1\uffff\4\172\1\uffff\1\141\2\172\2\141\1\uffff\1\165\1\160\2\uffff"+
		"\1\157\2\172\5\uffff\1\162\2\uffff\2\155\1\145\1\164\1\156\1\172\2\uffff"+
		"\1\172\2\145\1\172\1\151\1\172\2\uffff\2\172\1\uffff\1\157\3\uffff\1\156"+
		"\1\172\1\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\26\uffff\1\51\1\52\1\uffff\1\54\1\55\1\57\2\uffff"+
		"\1\64\1\65\1\66\1\uffff\1\72\1\73\1\uffff\1\76\37\uffff\1\56\1\53\1\61"+
		"\1\60\1\63\1\62\1\77\1\67\1\75\1\uffff\1\100\10\uffff\1\16\11\uffff\1"+
		"\32\1\33\6\uffff\1\42\2\uffff\1\45\2\uffff\1\74\12\uffff\1\20\2\uffff"+
		"\1\24\7\uffff\1\70\1\uffff\1\71\4\uffff\1\74\1\uffff\1\6\1\uffff\1\10"+
		"\1\uffff\1\12\4\uffff\1\21\1\uffff\1\23\1\uffff\1\26\1\27\1\uffff\1\30"+
		"\3\uffff\1\41\4\uffff\1\47\5\uffff\1\15\2\uffff\1\25\1\31\3\uffff\1\37"+
		"\1\43\1\44\1\46\1\50\1\uffff\1\7\1\11\6\uffff\1\35\1\40\6\uffff\1\36\1"+
		"\5\2\uffff\1\17\1\uffff\1\34\1\13\1\14\2\uffff\1\22";
	static final String DFA14_specialS =
		"\u00dd\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\52\1\uffff\2\52\22\uffff\1\52\1\40\1\51\3\uffff\1\37\1\uffff\1\1\1"+
			"\2\1\45\1\43\1\uffff\1\44\1\3\1\46\12\47\1\uffff\1\4\1\41\1\35\1\42\2"+
			"\uffff\2\50\1\5\1\6\11\50\1\7\3\50\1\10\1\11\1\12\6\50\6\uffff\1\50\1"+
			"\13\1\14\1\15\1\16\1\17\1\50\1\20\1\21\2\50\1\22\1\23\1\24\1\25\1\26"+
			"\2\50\1\27\1\30\1\31\3\50\1\32\1\50\1\33\1\36\1\34",
			"",
			"",
			"",
			"",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60\7\uffff\1\61",
			"\1\62\6\uffff\1\63",
			"\1\64",
			"\1\65\3\uffff\1\66",
			"\1\67\1\uffff\1\70\7\uffff\1\71\1\uffff\1\72",
			"\1\73",
			"\1\74",
			"\1\75\7\uffff\1\76",
			"\1\77",
			"\1\100\5\uffff\1\101",
			"\1\102\15\uffff\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"",
			"",
			"\1\112",
			"",
			"",
			"",
			"\1\114",
			"\1\116",
			"",
			"",
			"",
			"\1\120",
			"",
			"",
			"\1\124\26\uffff\1\123\17\124\12\123\7\124\32\123\6\124\32\123\4\124",
			"",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\151",
			"\1\152",
			"\1\154\11\uffff\1\153",
			"\1\155",
			"\1\156",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\160",
			"\1\161",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\163",
			"\1\164",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\124\26\uffff\1\123\1\124\1\165\15\124\12\123\7\124\32\123\6\124\32"+
			"\123\4\124",
			"",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"",
			"\1\176",
			"\12\50\7\uffff\32\50\6\uffff\22\50\1\177\7\50",
			"\1\u0081",
			"\1\u0082",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"",
			"",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u008c",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\1\u008e",
			"\1\u008f",
			"",
			"\1\u0090",
			"\1\u0091",
			"",
			"\1\u0093",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u0095",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u0097",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u0099\37\uffff\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\1\u009e",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\1\u00a0",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\22\50\1\u00a3\7\50",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\12\50\7\uffff\32\50\6\uffff\22\50\1\u00ac\7\50",
			"",
			"\1\u00ae",
			"",
			"\1\u00af",
			"",
			"\1\u00b0",
			"",
			"\1\u00b1",
			"\1\u00b2",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u00b4",
			"",
			"\1\u00b5",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\1\u00b8",
			"\1\u00b9",
			"\12\50\7\uffff\32\50\6\uffff\22\50\1\u00ba\7\50",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\1\u00c0",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u00c3",
			"\1\u00c4",
			"",
			"\1\u00c5",
			"\1\u00c6",
			"",
			"",
			"\1\u00c7",
			"\12\50\7\uffff\32\50\6\uffff\22\50\1\u00c8\7\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"",
			"",
			"",
			"",
			"\1\u00cb",
			"",
			"",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u00d3",
			"\1\u00d4",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\1\u00d6",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			"",
			"\1\u00da",
			"",
			"",
			"",
			"\1\u00db",
			"\12\50\7\uffff\32\50\6\uffff\32\50",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | ASSIGN | OR | AND | EQUALS | NOTEQUALS | LT | LTEQ | GT | GTEQ | PLUS | MINUS | MULT | DIV | MOD | NOT | NUMBER | IDENT | STRING | QUOTE | WS | COMMENT | STRING_CONSTANT );";
		}
	}

}
