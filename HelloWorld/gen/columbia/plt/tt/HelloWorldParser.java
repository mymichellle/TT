// $ANTLR 3.5 /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g 2013-04-15 00:06:12

	package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloWorldParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BOOL", "COMMENT", 
		"DAY", "DIGIT", "DIV", "EQUALS", "GT", "GTEQ", "HOUR", "IDENT", "LETTER", 
		"LOWER", "LT", "LTEQ", "MINUS", "MINUTE", "MOD", "MONTH", "MULT", "NONCONTROL_CHAR", 
		"NOT", "NOTEQUALS", "NUMBER", "OR", "PLUS", "QUOTE", "SPACE", "STRING", 
		"STRING_CONSTANT", "SYMBOL", "TIMEENTITYDAY", "TIMEENTITYMONTH", "TIMEENTITYWEEK", 
		"UPPER", "WS", "YEAR", "'('", "')'", "'.'", "';'", "'Calendar'", "'Date'", 
		"'Number'", "'Read'", "'String'", "'Task'", "'TimeFrame'", "'Timeframe'", 
		"'break'", "'by'", "'continue'", "'day'", "'days'", "'description'", "'else'", 
		"'end'", "'every'", "'exit'", "'from'", "'hour'", "'hours'", "'if'", "'in'", 
		"'location'", "'minute'", "'minutes'", "'month'", "'months'", "'name'", 
		"'on'", "'print'", "'start'", "'to'", "'until'", "'year'", "'years'", 
		"'{'", "'}'"
	};
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
	@Override public String getGrammarFileName() { return "/home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g"; }



	// $ANTLR start "declarationStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:16:1: declarationStatement : type ( WS )* IDENT ( WS )* ';' ;
	public final void declarationStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:2: ( type ( WS )* IDENT ( WS )* ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:4: type ( WS )* IDENT ( WS )* ';'
			{
			pushFollow(FOLLOW_type_in_declarationStatement43);
			type();
			state._fsp--;

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:9: ( WS )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==WS) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:9: WS
					{
					match(input,WS,FOLLOW_WS_in_declarationStatement45); 
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,IDENT,FOLLOW_IDENT_in_declarationStatement48); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:19: ( WS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:17:19: WS
					{
					match(input,WS,FOLLOW_WS_in_declarationStatement50); 
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,45,FOLLOW_45_in_declarationStatement53); 
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
	// $ANTLR end "declarationStatement"



	// $ANTLR start "type"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:20:1: type : ( 'String' | 'Number' | 'Date' | 'Task' | 'TimeFrame' | 'Calendar' );
	public final void type() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:21:2: ( 'String' | 'Number' | 'Date' | 'Task' | 'TimeFrame' | 'Calendar' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
			{
			if ( (input.LA(1) >= 46 && input.LA(1) <= 48)||(input.LA(1) >= 50 && input.LA(1) <= 52) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
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
	// $ANTLR end "type"



	// $ANTLR start "definitionStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:29:1: definitionStatement : ( dateDefnStmt | calendarDefnStmt | timeFrameDefnStmt | taskDefnStmt | stringDefnStmt | numberDefnStmt | fieldDefnStmt );
	public final void definitionStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:30:2: ( dateDefnStmt | calendarDefnStmt | timeFrameDefnStmt | taskDefnStmt | stringDefnStmt | numberDefnStmt | fieldDefnStmt )
			int alt3=7;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:30:4: dateDefnStmt
					{
					pushFollow(FOLLOW_dateDefnStmt_in_definitionStatement101);
					dateDefnStmt();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:31:4: calendarDefnStmt
					{
					pushFollow(FOLLOW_calendarDefnStmt_in_definitionStatement106);
					calendarDefnStmt();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:4: timeFrameDefnStmt
					{
					pushFollow(FOLLOW_timeFrameDefnStmt_in_definitionStatement111);
					timeFrameDefnStmt();
					state._fsp--;

					}
					break;
				case 4 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:33:4: taskDefnStmt
					{
					pushFollow(FOLLOW_taskDefnStmt_in_definitionStatement116);
					taskDefnStmt();
					state._fsp--;

					}
					break;
				case 5 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:34:4: stringDefnStmt
					{
					pushFollow(FOLLOW_stringDefnStmt_in_definitionStatement121);
					stringDefnStmt();
					state._fsp--;

					}
					break;
				case 6 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:35:4: numberDefnStmt
					{
					pushFollow(FOLLOW_numberDefnStmt_in_definitionStatement126);
					numberDefnStmt();
					state._fsp--;

					}
					break;
				case 7 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:36:4: fieldDefnStmt
					{
					pushFollow(FOLLOW_fieldDefnStmt_in_definitionStatement131);
					fieldDefnStmt();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "definitionStatement"



	// $ANTLR start "dateDefnStmt"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:40:1: dateDefnStmt : ( 'Date' ( WS )* IDENT ( WS )* ASSIGN ( WS )* dateConstant ( WS )* ';' | IDENT ASSIGN ( WS )* dateConstant ( WS )* ';' );
	public final void dateDefnStmt() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:2: ( 'Date' ( WS )* IDENT ( WS )* ASSIGN ( WS )* dateConstant ( WS )* ';' | IDENT ASSIGN ( WS )* dateConstant ( WS )* ';' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==47) ) {
				alt10=1;
			}
			else if ( (LA10_0==IDENT) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:4: 'Date' ( WS )* IDENT ( WS )* ASSIGN ( WS )* dateConstant ( WS )* ';'
					{
					match(input,47,FOLLOW_47_in_dateDefnStmt144); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:11: ( WS )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==WS) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:11: WS
							{
							match(input,WS,FOLLOW_WS_in_dateDefnStmt146); 
							}
							break;

						default :
							break loop4;
						}
					}

					match(input,IDENT,FOLLOW_IDENT_in_dateDefnStmt149); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:21: ( WS )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==WS) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:21: WS
							{
							match(input,WS,FOLLOW_WS_in_dateDefnStmt151); 
							}
							break;

						default :
							break loop5;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_dateDefnStmt154); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:32: ( WS )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==WS) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:32: WS
							{
							match(input,WS,FOLLOW_WS_in_dateDefnStmt156); 
							}
							break;

						default :
							break loop6;
						}
					}

					pushFollow(FOLLOW_dateConstant_in_dateDefnStmt159);
					dateConstant();
					state._fsp--;

					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:49: ( WS )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==WS) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:49: WS
							{
							match(input,WS,FOLLOW_WS_in_dateDefnStmt161); 
							}
							break;

						default :
							break loop7;
						}
					}

					match(input,45,FOLLOW_45_in_dateDefnStmt164); 
					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:42:4: IDENT ASSIGN ( WS )* dateConstant ( WS )* ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_dateDefnStmt169); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_dateDefnStmt171); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:42:17: ( WS )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==WS) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:42:17: WS
							{
							match(input,WS,FOLLOW_WS_in_dateDefnStmt173); 
							}
							break;

						default :
							break loop8;
						}
					}

					pushFollow(FOLLOW_dateConstant_in_dateDefnStmt176);
					dateConstant();
					state._fsp--;

					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:42:34: ( WS )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==WS) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:42:34: WS
							{
							match(input,WS,FOLLOW_WS_in_dateDefnStmt178); 
							}
							break;

						default :
							break loop9;
						}
					}

					match(input,45,FOLLOW_45_in_dateDefnStmt181); 
					}
					break;

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
	// $ANTLR end "dateDefnStmt"



	// $ANTLR start "timeFrameDefnStmt"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:45:1: timeFrameDefnStmt : ( 'Timeframe' ( WS )* IDENT ( WS )* ASSIGN ( WS )* timeFrameConstant ( WS )* ';' | IDENT ( WS )* ASSIGN ( WS )* timeFrameConstant ( WS )* ';' );
	public final void timeFrameDefnStmt() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:2: ( 'Timeframe' ( WS )* IDENT ( WS )* ASSIGN ( WS )* timeFrameConstant ( WS )* ';' | IDENT ( WS )* ASSIGN ( WS )* timeFrameConstant ( WS )* ';' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==53) ) {
				alt18=1;
			}
			else if ( (LA18_0==IDENT) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:4: 'Timeframe' ( WS )* IDENT ( WS )* ASSIGN ( WS )* timeFrameConstant ( WS )* ';'
					{
					match(input,53,FOLLOW_53_in_timeFrameDefnStmt193); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:16: ( WS )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==WS) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:16: WS
							{
							match(input,WS,FOLLOW_WS_in_timeFrameDefnStmt195); 
							}
							break;

						default :
							break loop11;
						}
					}

					match(input,IDENT,FOLLOW_IDENT_in_timeFrameDefnStmt198); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:26: ( WS )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==WS) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:26: WS
							{
							match(input,WS,FOLLOW_WS_in_timeFrameDefnStmt200); 
							}
							break;

						default :
							break loop12;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_timeFrameDefnStmt203); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:37: ( WS )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==WS) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:37: WS
							{
							match(input,WS,FOLLOW_WS_in_timeFrameDefnStmt205); 
							}
							break;

						default :
							break loop13;
						}
					}

					pushFollow(FOLLOW_timeFrameConstant_in_timeFrameDefnStmt208);
					timeFrameConstant();
					state._fsp--;

					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:59: ( WS )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==WS) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:46:59: WS
							{
							match(input,WS,FOLLOW_WS_in_timeFrameDefnStmt210); 
							}
							break;

						default :
							break loop14;
						}
					}

					match(input,45,FOLLOW_45_in_timeFrameDefnStmt213); 
					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:4: IDENT ( WS )* ASSIGN ( WS )* timeFrameConstant ( WS )* ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_timeFrameDefnStmt218); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:10: ( WS )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==WS) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:10: WS
							{
							match(input,WS,FOLLOW_WS_in_timeFrameDefnStmt220); 
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_timeFrameDefnStmt223); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:22: ( WS )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==WS) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:22: WS
							{
							match(input,WS,FOLLOW_WS_in_timeFrameDefnStmt226); 
							}
							break;

						default :
							break loop16;
						}
					}

					pushFollow(FOLLOW_timeFrameConstant_in_timeFrameDefnStmt229);
					timeFrameConstant();
					state._fsp--;

					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:44: ( WS )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==WS) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:47:44: WS
							{
							match(input,WS,FOLLOW_WS_in_timeFrameDefnStmt231); 
							}
							break;

						default :
							break loop17;
						}
					}

					match(input,45,FOLLOW_45_in_timeFrameDefnStmt234); 
					}
					break;

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
	// $ANTLR end "timeFrameDefnStmt"



	// $ANTLR start "taskDefnStmt"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:50:1: taskDefnStmt : 'Task' ( WS )* IDENT ASSIGN ( WS )* STRING ( WS )* ';' ;
	public final void taskDefnStmt() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:2: ( 'Task' ( WS )* IDENT ASSIGN ( WS )* STRING ( WS )* ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:4: 'Task' ( WS )* IDENT ASSIGN ( WS )* STRING ( WS )* ';'
			{
			match(input,51,FOLLOW_51_in_taskDefnStmt245); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:11: ( WS )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:11: WS
					{
					match(input,WS,FOLLOW_WS_in_taskDefnStmt247); 
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,IDENT,FOLLOW_IDENT_in_taskDefnStmt250); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_taskDefnStmt252); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:28: ( WS )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==WS) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:28: WS
					{
					match(input,WS,FOLLOW_WS_in_taskDefnStmt254); 
					}
					break;

				default :
					break loop20;
				}
			}

			match(input,STRING,FOLLOW_STRING_in_taskDefnStmt257); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:39: ( WS )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:51:39: WS
					{
					match(input,WS,FOLLOW_WS_in_taskDefnStmt259); 
					}
					break;

				default :
					break loop21;
				}
			}

			match(input,45,FOLLOW_45_in_taskDefnStmt262); 
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
	// $ANTLR end "taskDefnStmt"



	// $ANTLR start "fieldDefnStmt"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:54:1: fieldDefnStmt : ( IDENT '.' 'name' ( WS )* ASSIGN STRING ( WS )* ';' | IDENT '.' 'start' ( WS )* ASSIGN dateConstant ( WS )* ';' | IDENT '.' 'end' ( WS )* ASSIGN dateConstant ( WS )* ';' | IDENT '.' 'location' ( WS )* ASSIGN STRING ( WS )* ';' | IDENT '.' 'description' ( WS )* ASSIGN STRING ( WS )* ';' );
	public final void fieldDefnStmt() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:55:2: ( IDENT '.' 'name' ( WS )* ASSIGN STRING ( WS )* ';' | IDENT '.' 'start' ( WS )* ASSIGN dateConstant ( WS )* ';' | IDENT '.' 'end' ( WS )* ASSIGN dateConstant ( WS )* ';' | IDENT '.' 'location' ( WS )* ASSIGN STRING ( WS )* ';' | IDENT '.' 'description' ( WS )* ASSIGN STRING ( WS )* ';' )
			int alt32=5;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==IDENT) ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1==44) ) {
					switch ( input.LA(3) ) {
					case 74:
						{
						alt32=1;
						}
						break;
					case 77:
						{
						alt32=2;
						}
						break;
					case 61:
						{
						alt32=3;
						}
						break;
					case 69:
						{
						alt32=4;
						}
						break;
					case 59:
						{
						alt32=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 2, input);
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
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:55:4: IDENT '.' 'name' ( WS )* ASSIGN STRING ( WS )* ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_fieldDefnStmt273); 
					match(input,44,FOLLOW_44_in_fieldDefnStmt275); 
					match(input,74,FOLLOW_74_in_fieldDefnStmt276); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:55:20: ( WS )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==WS) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:55:20: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt278); 
							}
							break;

						default :
							break loop22;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefnStmt281); 
					match(input,STRING,FOLLOW_STRING_in_fieldDefnStmt283); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:55:38: ( WS )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==WS) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:55:38: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt285); 
							}
							break;

						default :
							break loop23;
						}
					}

					match(input,45,FOLLOW_45_in_fieldDefnStmt288); 
					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:56:4: IDENT '.' 'start' ( WS )* ASSIGN dateConstant ( WS )* ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_fieldDefnStmt293); 
					match(input,44,FOLLOW_44_in_fieldDefnStmt295); 
					match(input,77,FOLLOW_77_in_fieldDefnStmt297); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:56:22: ( WS )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==WS) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:56:22: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt299); 
							}
							break;

						default :
							break loop24;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefnStmt302); 
					pushFollow(FOLLOW_dateConstant_in_fieldDefnStmt304);
					dateConstant();
					state._fsp--;

					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:56:46: ( WS )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==WS) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:56:46: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt306); 
							}
							break;

						default :
							break loop25;
						}
					}

					match(input,45,FOLLOW_45_in_fieldDefnStmt309); 
					}
					break;
				case 3 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:57:4: IDENT '.' 'end' ( WS )* ASSIGN dateConstant ( WS )* ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_fieldDefnStmt314); 
					match(input,44,FOLLOW_44_in_fieldDefnStmt316); 
					match(input,61,FOLLOW_61_in_fieldDefnStmt318); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:57:20: ( WS )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==WS) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:57:20: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt320); 
							}
							break;

						default :
							break loop26;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefnStmt323); 
					pushFollow(FOLLOW_dateConstant_in_fieldDefnStmt325);
					dateConstant();
					state._fsp--;

					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:57:44: ( WS )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==WS) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:57:44: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt327); 
							}
							break;

						default :
							break loop27;
						}
					}

					match(input,45,FOLLOW_45_in_fieldDefnStmt330); 
					}
					break;
				case 4 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:4: IDENT '.' 'location' ( WS )* ASSIGN STRING ( WS )* ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_fieldDefnStmt335); 
					match(input,44,FOLLOW_44_in_fieldDefnStmt337); 
					match(input,69,FOLLOW_69_in_fieldDefnStmt339); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:25: ( WS )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==WS) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:25: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt341); 
							}
							break;

						default :
							break loop28;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefnStmt344); 
					match(input,STRING,FOLLOW_STRING_in_fieldDefnStmt346); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:43: ( WS )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==WS) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:43: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt348); 
							}
							break;

						default :
							break loop29;
						}
					}

					match(input,45,FOLLOW_45_in_fieldDefnStmt351); 
					}
					break;
				case 5 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:59:4: IDENT '.' 'description' ( WS )* ASSIGN STRING ( WS )* ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_fieldDefnStmt356); 
					match(input,44,FOLLOW_44_in_fieldDefnStmt358); 
					match(input,59,FOLLOW_59_in_fieldDefnStmt360); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:59:28: ( WS )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==WS) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:59:28: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt362); 
							}
							break;

						default :
							break loop30;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefnStmt365); 
					match(input,STRING,FOLLOW_STRING_in_fieldDefnStmt367); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:59:46: ( WS )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==WS) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:59:46: WS
							{
							match(input,WS,FOLLOW_WS_in_fieldDefnStmt369); 
							}
							break;

						default :
							break loop31;
						}
					}

					match(input,45,FOLLOW_45_in_fieldDefnStmt372); 
					}
					break;

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
	// $ANTLR end "fieldDefnStmt"



	// $ANTLR start "stringDefnStmt"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:62:1: stringDefnStmt : ( 'String' ( WS )* IDENT ( WS )* ASSIGN ( WS )* STRING ( WS )* ';' | IDENT ( WS )* ASSIGN ( WS )* STRING ';' );
	public final void stringDefnStmt() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:2: ( 'String' ( WS )* IDENT ( WS )* ASSIGN ( WS )* STRING ( WS )* ';' | IDENT ( WS )* ASSIGN ( WS )* STRING ';' )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==50) ) {
				alt39=1;
			}
			else if ( (LA39_0==IDENT) ) {
				alt39=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:4: 'String' ( WS )* IDENT ( WS )* ASSIGN ( WS )* STRING ( WS )* ';'
					{
					match(input,50,FOLLOW_50_in_stringDefnStmt384); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:13: ( WS )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==WS) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:13: WS
							{
							match(input,WS,FOLLOW_WS_in_stringDefnStmt386); 
							}
							break;

						default :
							break loop33;
						}
					}

					match(input,IDENT,FOLLOW_IDENT_in_stringDefnStmt389); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:23: ( WS )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==WS) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:23: WS
							{
							match(input,WS,FOLLOW_WS_in_stringDefnStmt391); 
							}
							break;

						default :
							break loop34;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_stringDefnStmt394); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:34: ( WS )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==WS) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:34: WS
							{
							match(input,WS,FOLLOW_WS_in_stringDefnStmt396); 
							}
							break;

						default :
							break loop35;
						}
					}

					match(input,STRING,FOLLOW_STRING_in_stringDefnStmt399); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:45: ( WS )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==WS) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:63:45: WS
							{
							match(input,WS,FOLLOW_WS_in_stringDefnStmt401); 
							}
							break;

						default :
							break loop36;
						}
					}

					match(input,45,FOLLOW_45_in_stringDefnStmt404); 
					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:64:4: IDENT ( WS )* ASSIGN ( WS )* STRING ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_stringDefnStmt409); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:64:10: ( WS )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==WS) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:64:10: WS
							{
							match(input,WS,FOLLOW_WS_in_stringDefnStmt411); 
							}
							break;

						default :
							break loop37;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_stringDefnStmt414); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:64:21: ( WS )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==WS) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:64:21: WS
							{
							match(input,WS,FOLLOW_WS_in_stringDefnStmt416); 
							}
							break;

						default :
							break loop38;
						}
					}

					match(input,STRING,FOLLOW_STRING_in_stringDefnStmt419); 
					match(input,45,FOLLOW_45_in_stringDefnStmt421); 
					}
					break;

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
	// $ANTLR end "stringDefnStmt"



	// $ANTLR start "numberDefnStmt"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:67:1: numberDefnStmt : ( 'Number' ( WS )* IDENT ( WS )* ASSIGN ( WS )* NUMBER ( WS )* ';' | IDENT ( WS )* ASSIGN ( WS )* NUMBER ';' );
	public final void numberDefnStmt() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:2: ( 'Number' ( WS )* IDENT ( WS )* ASSIGN ( WS )* NUMBER ( WS )* ';' | IDENT ( WS )* ASSIGN ( WS )* NUMBER ';' )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==48) ) {
				alt46=1;
			}
			else if ( (LA46_0==IDENT) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:4: 'Number' ( WS )* IDENT ( WS )* ASSIGN ( WS )* NUMBER ( WS )* ';'
					{
					match(input,48,FOLLOW_48_in_numberDefnStmt432); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:13: ( WS )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==WS) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:13: WS
							{
							match(input,WS,FOLLOW_WS_in_numberDefnStmt434); 
							}
							break;

						default :
							break loop40;
						}
					}

					match(input,IDENT,FOLLOW_IDENT_in_numberDefnStmt437); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:23: ( WS )*
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==WS) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:23: WS
							{
							match(input,WS,FOLLOW_WS_in_numberDefnStmt439); 
							}
							break;

						default :
							break loop41;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_numberDefnStmt442); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:34: ( WS )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==WS) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:34: WS
							{
							match(input,WS,FOLLOW_WS_in_numberDefnStmt444); 
							}
							break;

						default :
							break loop42;
						}
					}

					match(input,NUMBER,FOLLOW_NUMBER_in_numberDefnStmt447); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:45: ( WS )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==WS) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:68:45: WS
							{
							match(input,WS,FOLLOW_WS_in_numberDefnStmt449); 
							}
							break;

						default :
							break loop43;
						}
					}

					match(input,45,FOLLOW_45_in_numberDefnStmt452); 
					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:69:4: IDENT ( WS )* ASSIGN ( WS )* NUMBER ';'
					{
					match(input,IDENT,FOLLOW_IDENT_in_numberDefnStmt457); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:69:10: ( WS )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==WS) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:69:10: WS
							{
							match(input,WS,FOLLOW_WS_in_numberDefnStmt459); 
							}
							break;

						default :
							break loop44;
						}
					}

					match(input,ASSIGN,FOLLOW_ASSIGN_in_numberDefnStmt462); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:69:21: ( WS )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==WS) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:69:21: WS
							{
							match(input,WS,FOLLOW_WS_in_numberDefnStmt464); 
							}
							break;

						default :
							break loop45;
						}
					}

					match(input,NUMBER,FOLLOW_NUMBER_in_numberDefnStmt467); 
					match(input,45,FOLLOW_45_in_numberDefnStmt469); 
					}
					break;

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
	// $ANTLR end "numberDefnStmt"



	// $ANTLR start "calendarDefnStmt"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:72:1: calendarDefnStmt : 'Calendar' ( WS )* IDENT ( WS )* ASSIGN ( WS )* STRING ( WS )* ';' ;
	public final void calendarDefnStmt() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:2: ( 'Calendar' ( WS )* IDENT ( WS )* ASSIGN ( WS )* STRING ( WS )* ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:4: 'Calendar' ( WS )* IDENT ( WS )* ASSIGN ( WS )* STRING ( WS )* ';'
			{
			match(input,46,FOLLOW_46_in_calendarDefnStmt480); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:15: ( WS )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==WS) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:15: WS
					{
					match(input,WS,FOLLOW_WS_in_calendarDefnStmt482); 
					}
					break;

				default :
					break loop47;
				}
			}

			match(input,IDENT,FOLLOW_IDENT_in_calendarDefnStmt485); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:25: ( WS )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:25: WS
					{
					match(input,WS,FOLLOW_WS_in_calendarDefnStmt487); 
					}
					break;

				default :
					break loop48;
				}
			}

			match(input,ASSIGN,FOLLOW_ASSIGN_in_calendarDefnStmt490); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:36: ( WS )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==WS) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:36: WS
					{
					match(input,WS,FOLLOW_WS_in_calendarDefnStmt492); 
					}
					break;

				default :
					break loop49;
				}
			}

			match(input,STRING,FOLLOW_STRING_in_calendarDefnStmt495); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:47: ( WS )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:47: WS
					{
					match(input,WS,FOLLOW_WS_in_calendarDefnStmt497); 
					}
					break;

				default :
					break loop50;
				}
			}

			match(input,45,FOLLOW_45_in_calendarDefnStmt500); 
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
	// $ANTLR end "calendarDefnStmt"



	// $ANTLR start "statement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:79:1: statement : ( statement_type )+ ;
	public final void statement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:80:2: ( ( statement_type )+ )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:80:4: ( statement_type )+
			{
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:80:4: ( statement_type )+
			int cnt51=0;
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==IDENT||(LA51_0 >= 46 && LA51_0 <= 54)||LA51_0==56||(LA51_0 >= 62 && LA51_0 <= 63)||LA51_0==67||LA51_0==76||LA51_0==79) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:80:4: statement_type
					{
					pushFollow(FOLLOW_statement_type_in_statement516);
					statement_type();
					state._fsp--;

					}
					break;

				default :
					if ( cnt51 >= 1 ) break loop51;
					EarlyExitException eee = new EarlyExitException(51, input);
					throw eee;
				}
				cnt51++;
			}

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
	// $ANTLR end "statement"



	// $ANTLR start "statement_type"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:83:1: statement_type : ( print | declarationStatement | definitionStatement | ifThenStatement | everyFromToByStatement | everyInStatement | untilStatement | breakStatement | continueStatement | exitStatement | readStatement );
	public final void statement_type() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:84:2: ( print | declarationStatement | definitionStatement | ifThenStatement | everyFromToByStatement | everyInStatement | untilStatement | breakStatement | continueStatement | exitStatement | readStatement )
			int alt52=11;
			alt52 = dfa52.predict(input);
			switch (alt52) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:84:4: print
					{
					pushFollow(FOLLOW_print_in_statement_type529);
					print();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:85:4: declarationStatement
					{
					pushFollow(FOLLOW_declarationStatement_in_statement_type534);
					declarationStatement();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:86:4: definitionStatement
					{
					pushFollow(FOLLOW_definitionStatement_in_statement_type539);
					definitionStatement();
					state._fsp--;

					}
					break;
				case 4 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:87:4: ifThenStatement
					{
					pushFollow(FOLLOW_ifThenStatement_in_statement_type544);
					ifThenStatement();
					state._fsp--;

					}
					break;
				case 5 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:88:4: everyFromToByStatement
					{
					pushFollow(FOLLOW_everyFromToByStatement_in_statement_type549);
					everyFromToByStatement();
					state._fsp--;

					}
					break;
				case 6 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:89:4: everyInStatement
					{
					pushFollow(FOLLOW_everyInStatement_in_statement_type554);
					everyInStatement();
					state._fsp--;

					}
					break;
				case 7 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:92:4: untilStatement
					{
					pushFollow(FOLLOW_untilStatement_in_statement_type561);
					untilStatement();
					state._fsp--;

					}
					break;
				case 8 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:93:4: breakStatement
					{
					pushFollow(FOLLOW_breakStatement_in_statement_type566);
					breakStatement();
					state._fsp--;

					}
					break;
				case 9 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:94:4: continueStatement
					{
					pushFollow(FOLLOW_continueStatement_in_statement_type571);
					continueStatement();
					state._fsp--;

					}
					break;
				case 10 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:95:4: exitStatement
					{
					pushFollow(FOLLOW_exitStatement_in_statement_type576);
					exitStatement();
					state._fsp--;

					}
					break;
				case 11 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:96:4: readStatement
					{
					pushFollow(FOLLOW_readStatement_in_statement_type581);
					readStatement();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "statement_type"



	// $ANTLR start "expression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:100:1: expression : logicalExpression ;
	public final void expression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:101:2: ( logicalExpression )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:101:4: logicalExpression
			{
			pushFollow(FOLLOW_logicalExpression_in_expression593);
			logicalExpression();
			state._fsp--;

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
	// $ANTLR end "expression"



	// $ANTLR start "ifThenStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:104:1: ifThenStatement : 'if' '(' expression ')' '{' ( statement_type )* '}' elseStatement ;
	public final void ifThenStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:2: ( 'if' '(' expression ')' '{' ( statement_type )* '}' elseStatement )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:4: 'if' '(' expression ')' '{' ( statement_type )* '}' elseStatement
			{
			match(input,67,FOLLOW_67_in_ifThenStatement604); 
			match(input,42,FOLLOW_42_in_ifThenStatement606); 
			pushFollow(FOLLOW_expression_in_ifThenStatement608);
			expression();
			state._fsp--;

			match(input,43,FOLLOW_43_in_ifThenStatement610); 
			match(input,82,FOLLOW_82_in_ifThenStatement612); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:32: ( statement_type )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==IDENT||(LA53_0 >= 46 && LA53_0 <= 54)||LA53_0==56||(LA53_0 >= 62 && LA53_0 <= 63)||LA53_0==67||LA53_0==76||LA53_0==79) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:105:32: statement_type
					{
					pushFollow(FOLLOW_statement_type_in_ifThenStatement614);
					statement_type();
					state._fsp--;

					}
					break;

				default :
					break loop53;
				}
			}

			match(input,83,FOLLOW_83_in_ifThenStatement617); 
			pushFollow(FOLLOW_elseStatement_in_ifThenStatement619);
			elseStatement();
			state._fsp--;

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
	// $ANTLR end "ifThenStatement"



	// $ANTLR start "elseStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:108:1: elseStatement : ( 'else' '{' ( statement_type )* '}' |);
	public final void elseStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:109:2: ( 'else' '{' ( statement_type )* '}' |)
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==60) ) {
				alt55=1;
			}
			else if ( (LA55_0==EOF||LA55_0==IDENT||(LA55_0 >= 46 && LA55_0 <= 54)||LA55_0==56||(LA55_0 >= 62 && LA55_0 <= 63)||LA55_0==67||LA55_0==76||LA55_0==79||LA55_0==83) ) {
				alt55=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:109:4: 'else' '{' ( statement_type )* '}'
					{
					match(input,60,FOLLOW_60_in_elseStatement630); 
					match(input,82,FOLLOW_82_in_elseStatement632); 
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:109:15: ( statement_type )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==IDENT||(LA54_0 >= 46 && LA54_0 <= 54)||LA54_0==56||(LA54_0 >= 62 && LA54_0 <= 63)||LA54_0==67||LA54_0==76||LA54_0==79) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:109:15: statement_type
							{
							pushFollow(FOLLOW_statement_type_in_elseStatement634);
							statement_type();
							state._fsp--;

							}
							break;

						default :
							break loop54;
						}
					}

					match(input,83,FOLLOW_83_in_elseStatement637); 
					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:111:2: 
					{
					}
					break;

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
	// $ANTLR end "elseStatement"



	// $ANTLR start "everyFromToByStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:113:1: everyFromToByStatement : 'every' 'Date' IDENT 'from' dateOrIdent 'to' dateOrIdent 'by' timeframeOrIdent '{' ( statement_type )* '}' ;
	public final void everyFromToByStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:114:2: ( 'every' 'Date' IDENT 'from' dateOrIdent 'to' dateOrIdent 'by' timeframeOrIdent '{' ( statement_type )* '}' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:114:4: 'every' 'Date' IDENT 'from' dateOrIdent 'to' dateOrIdent 'by' timeframeOrIdent '{' ( statement_type )* '}'
			{
			match(input,62,FOLLOW_62_in_everyFromToByStatement651); 
			match(input,47,FOLLOW_47_in_everyFromToByStatement653); 
			match(input,IDENT,FOLLOW_IDENT_in_everyFromToByStatement655); 
			match(input,64,FOLLOW_64_in_everyFromToByStatement657); 
			pushFollow(FOLLOW_dateOrIdent_in_everyFromToByStatement659);
			dateOrIdent();
			state._fsp--;

			match(input,78,FOLLOW_78_in_everyFromToByStatement661); 
			pushFollow(FOLLOW_dateOrIdent_in_everyFromToByStatement663);
			dateOrIdent();
			state._fsp--;

			match(input,55,FOLLOW_55_in_everyFromToByStatement665); 
			pushFollow(FOLLOW_timeframeOrIdent_in_everyFromToByStatement667);
			timeframeOrIdent();
			state._fsp--;

			match(input,82,FOLLOW_82_in_everyFromToByStatement669); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:114:87: ( statement_type )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==IDENT||(LA56_0 >= 46 && LA56_0 <= 54)||LA56_0==56||(LA56_0 >= 62 && LA56_0 <= 63)||LA56_0==67||LA56_0==76||LA56_0==79) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:114:87: statement_type
					{
					pushFollow(FOLLOW_statement_type_in_everyFromToByStatement671);
					statement_type();
					state._fsp--;

					}
					break;

				default :
					break loop56;
				}
			}

			match(input,83,FOLLOW_83_in_everyFromToByStatement674); 
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
	// $ANTLR end "everyFromToByStatement"



	// $ANTLR start "everyInStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:117:1: everyInStatement : 'every' 'Task' IDENT 'in' IDENT 'from' dateOrIdent 'to' dateOrIdent loopOptions '{' ( statement_type )* '}' ;
	public final void everyInStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:118:2: ( 'every' 'Task' IDENT 'in' IDENT 'from' dateOrIdent 'to' dateOrIdent loopOptions '{' ( statement_type )* '}' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:118:4: 'every' 'Task' IDENT 'in' IDENT 'from' dateOrIdent 'to' dateOrIdent loopOptions '{' ( statement_type )* '}'
			{
			match(input,62,FOLLOW_62_in_everyInStatement686); 
			match(input,51,FOLLOW_51_in_everyInStatement688); 
			match(input,IDENT,FOLLOW_IDENT_in_everyInStatement690); 
			match(input,68,FOLLOW_68_in_everyInStatement692); 
			match(input,IDENT,FOLLOW_IDENT_in_everyInStatement694); 
			match(input,64,FOLLOW_64_in_everyInStatement696); 
			pushFollow(FOLLOW_dateOrIdent_in_everyInStatement698);
			dateOrIdent();
			state._fsp--;

			match(input,78,FOLLOW_78_in_everyInStatement700); 
			pushFollow(FOLLOW_dateOrIdent_in_everyInStatement702);
			dateOrIdent();
			state._fsp--;

			pushFollow(FOLLOW_loopOptions_in_everyInStatement704);
			loopOptions();
			state._fsp--;

			match(input,82,FOLLOW_82_in_everyInStatement706); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:118:88: ( statement_type )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==IDENT||(LA57_0 >= 46 && LA57_0 <= 54)||LA57_0==56||(LA57_0 >= 62 && LA57_0 <= 63)||LA57_0==67||LA57_0==76||LA57_0==79) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:118:88: statement_type
					{
					pushFollow(FOLLOW_statement_type_in_everyInStatement708);
					statement_type();
					state._fsp--;

					}
					break;

				default :
					break loop57;
				}
			}

			match(input,83,FOLLOW_83_in_everyInStatement711); 
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
	// $ANTLR end "everyInStatement"



	// $ANTLR start "loopOptions"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:121:1: loopOptions : ( 'on' expression |);
	public final void loopOptions() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:122:2: ( 'on' expression |)
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==75) ) {
				alt58=1;
			}
			else if ( (LA58_0==82) ) {
				alt58=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:122:4: 'on' expression
					{
					match(input,75,FOLLOW_75_in_loopOptions723); 
					pushFollow(FOLLOW_expression_in_loopOptions725);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:124:2: 
					{
					}
					break;

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
	// $ANTLR end "loopOptions"



	// $ANTLR start "dateOrIdent"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:126:1: dateOrIdent : IDENT ;
	public final void dateOrIdent() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:127:2: ( IDENT )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:127:4: IDENT
			{
			match(input,IDENT,FOLLOW_IDENT_in_dateOrIdent740); 
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
	// $ANTLR end "dateOrIdent"



	// $ANTLR start "timeframeOrIdent"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:131:1: timeframeOrIdent : IDENT ;
	public final void timeframeOrIdent() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:132:2: ( IDENT )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:132:4: IDENT
			{
			match(input,IDENT,FOLLOW_IDENT_in_timeframeOrIdent754); 
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
	// $ANTLR end "timeframeOrIdent"



	// $ANTLR start "untilStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:136:1: untilStatement : 'until' dateOrIdent ';' ;
	public final void untilStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:137:2: ( 'until' dateOrIdent ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:137:4: 'until' dateOrIdent ';'
			{
			match(input,79,FOLLOW_79_in_untilStatement767); 
			pushFollow(FOLLOW_dateOrIdent_in_untilStatement769);
			dateOrIdent();
			state._fsp--;

			match(input,45,FOLLOW_45_in_untilStatement771); 
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
	// $ANTLR end "untilStatement"



	// $ANTLR start "breakStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:140:1: breakStatement : 'break' ';' ;
	public final void breakStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:141:2: ( 'break' ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:141:4: 'break' ';'
			{
			match(input,54,FOLLOW_54_in_breakStatement783); 
			match(input,45,FOLLOW_45_in_breakStatement785); 
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
	// $ANTLR end "breakStatement"



	// $ANTLR start "continueStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:144:1: continueStatement : 'continue' ';' ;
	public final void continueStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:145:2: ( 'continue' ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:145:4: 'continue' ';'
			{
			match(input,56,FOLLOW_56_in_continueStatement797); 
			match(input,45,FOLLOW_45_in_continueStatement799); 
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
	// $ANTLR end "continueStatement"



	// $ANTLR start "exitStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:148:1: exitStatement : 'exit' ';' ;
	public final void exitStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:149:2: ( 'exit' ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:149:4: 'exit' ';'
			{
			match(input,63,FOLLOW_63_in_exitStatement811); 
			match(input,45,FOLLOW_45_in_exitStatement813); 
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
	// $ANTLR end "exitStatement"



	// $ANTLR start "readStatement"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:152:1: readStatement : 'Read' '(' STRING ')' ';' ;
	public final void readStatement() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:153:2: ( 'Read' '(' STRING ')' ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:153:4: 'Read' '(' STRING ')' ';'
			{
			match(input,49,FOLLOW_49_in_readStatement825); 
			match(input,42,FOLLOW_42_in_readStatement827); 
			match(input,STRING,FOLLOW_STRING_in_readStatement829); 
			match(input,43,FOLLOW_43_in_readStatement831); 
			match(input,45,FOLLOW_45_in_readStatement833); 
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
	// $ANTLR end "readStatement"



	// $ANTLR start "print"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:157:1: print : 'print' '(' STRING ')' ';' ;
	public final void print() throws RecognitionException {
		Token STRING1=null;

		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:157:7: ( 'print' '(' STRING ')' ';' )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:157:9: 'print' '(' STRING ')' ';'
			{
			match(input,76,FOLLOW_76_in_print845); 
			match(input,42,FOLLOW_42_in_print847); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_print849); 
			match(input,43,FOLLOW_43_in_print852); 
			match(input,45,FOLLOW_45_in_print854); 
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



	// $ANTLR start "dateConstant"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:164:1: dateConstant : ( YEAR | YEAR '.' MONTH | YEAR '.' MONTH '.' DAY | YEAR '.' MONTH '.' DAY '.' HOUR | YEAR '.' MONTH '.' DAY '.' HOUR '.' MINUTE );
	public final void dateConstant() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:165:3: ( YEAR | YEAR '.' MONTH | YEAR '.' MONTH '.' DAY | YEAR '.' MONTH '.' DAY '.' HOUR | YEAR '.' MONTH '.' DAY '.' HOUR '.' MINUTE )
			int alt59=5;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==YEAR) ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1==44) ) {
					int LA59_2 = input.LA(3);
					if ( (LA59_2==MONTH) ) {
						int LA59_4 = input.LA(4);
						if ( (LA59_4==44) ) {
							int LA59_5 = input.LA(5);
							if ( (LA59_5==DAY) ) {
								int LA59_7 = input.LA(6);
								if ( (LA59_7==44) ) {
									int LA59_8 = input.LA(7);
									if ( (LA59_8==HOUR) ) {
										int LA59_10 = input.LA(8);
										if ( (LA59_10==44) ) {
											alt59=5;
										}
										else if ( (LA59_10==WS||LA59_10==45) ) {
											alt59=4;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 59, 10, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 59, 8, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA59_7==WS||LA59_7==45) ) {
									alt59=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 59, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 59, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA59_4==WS||LA59_4==45) ) {
							alt59=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 59, 4, input);
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
								new NoViableAltException("", 59, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA59_1==WS||LA59_1==45) ) {
					alt59=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:165:5: YEAR
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant876); 
					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:166:5: YEAR '.' MONTH
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant883); 
					match(input,44,FOLLOW_44_in_dateConstant885); 
					match(input,MONTH,FOLLOW_MONTH_in_dateConstant887); 
					}
					break;
				case 3 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:167:5: YEAR '.' MONTH '.' DAY
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant894); 
					match(input,44,FOLLOW_44_in_dateConstant896); 
					match(input,MONTH,FOLLOW_MONTH_in_dateConstant898); 
					match(input,44,FOLLOW_44_in_dateConstant900); 
					match(input,DAY,FOLLOW_DAY_in_dateConstant902); 
					}
					break;
				case 4 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:168:5: YEAR '.' MONTH '.' DAY '.' HOUR
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant909); 
					match(input,44,FOLLOW_44_in_dateConstant911); 
					match(input,MONTH,FOLLOW_MONTH_in_dateConstant913); 
					match(input,44,FOLLOW_44_in_dateConstant915); 
					match(input,DAY,FOLLOW_DAY_in_dateConstant917); 
					match(input,44,FOLLOW_44_in_dateConstant919); 
					match(input,HOUR,FOLLOW_HOUR_in_dateConstant921); 
					}
					break;
				case 5 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:169:5: YEAR '.' MONTH '.' DAY '.' HOUR '.' MINUTE
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant927); 
					match(input,44,FOLLOW_44_in_dateConstant929); 
					match(input,MONTH,FOLLOW_MONTH_in_dateConstant931); 
					match(input,44,FOLLOW_44_in_dateConstant933); 
					match(input,DAY,FOLLOW_DAY_in_dateConstant935); 
					match(input,44,FOLLOW_44_in_dateConstant937); 
					match(input,HOUR,FOLLOW_HOUR_in_dateConstant939); 
					match(input,44,FOLLOW_44_in_dateConstant941); 
					match(input,MINUTE,FOLLOW_MINUTE_in_dateConstant943); 
					}
					break;

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
	// $ANTLR end "dateConstant"



	// $ANTLR start "timeFrame"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:172:1: timeFrame : primaryExpression WS ( 'year' | 'years' | 'month' | 'months' | 'day' | 'days' | 'hour' | 'hours' | 'minute' | 'minutes' ) ;
	public final void timeFrame() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:173:2: ( primaryExpression WS ( 'year' | 'years' | 'month' | 'months' | 'day' | 'days' | 'hour' | 'hours' | 'minute' | 'minutes' ) )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:173:4: primaryExpression WS ( 'year' | 'years' | 'month' | 'months' | 'day' | 'days' | 'hour' | 'hours' | 'minute' | 'minutes' )
			{
			pushFollow(FOLLOW_primaryExpression_in_timeFrame960);
			primaryExpression();
			state._fsp--;

			match(input,WS,FOLLOW_WS_in_timeFrame962); 
			if ( (input.LA(1) >= 57 && input.LA(1) <= 58)||(input.LA(1) >= 65 && input.LA(1) <= 66)||(input.LA(1) >= 70 && input.LA(1) <= 73)||(input.LA(1) >= 80 && input.LA(1) <= 81) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
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
	// $ANTLR end "timeFrame"



	// $ANTLR start "timeFrameConstant"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:177:1: timeFrameConstant : timeFrame ( '+' timeFrame )* ;
	public final void timeFrameConstant() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:178:2: ( timeFrame ( '+' timeFrame )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:178:4: timeFrame ( '+' timeFrame )*
			{
			pushFollow(FOLLOW_timeFrame_in_timeFrameConstant1002);
			timeFrame();
			state._fsp--;

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:178:14: ( '+' timeFrame )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==PLUS) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:178:15: '+' timeFrame
					{
					match(input,PLUS,FOLLOW_PLUS_in_timeFrameConstant1005); 
					pushFollow(FOLLOW_timeFrame_in_timeFrameConstant1007);
					timeFrame();
					state._fsp--;

					}
					break;

				default :
					break loop60;
				}
			}

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
	// $ANTLR end "timeFrameConstant"



	// $ANTLR start "timeEntityConstant"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:181:1: timeEntityConstant : ( TIMEENTITYDAY | TIMEENTITYWEEK | TIMEENTITYMONTH );
	public final void timeEntityConstant() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:182:2: ( TIMEENTITYDAY | TIMEENTITYWEEK | TIMEENTITYMONTH )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
			{
			if ( (input.LA(1) >= TIMEENTITYDAY && input.LA(1) <= TIMEENTITYWEEK) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
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
	// $ANTLR end "timeEntityConstant"



	// $ANTLR start "logicalExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:195:1: logicalExpression : booleanAndExpression ( OR booleanAndExpression )* ;
	public final void logicalExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:196:2: ( booleanAndExpression ( OR booleanAndExpression )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:196:4: booleanAndExpression ( OR booleanAndExpression )*
			{
			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression1059);
			booleanAndExpression();
			state._fsp--;

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:196:25: ( OR booleanAndExpression )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==OR) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:196:26: OR booleanAndExpression
					{
					match(input,OR,FOLLOW_OR_in_logicalExpression1062); 
					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression1064);
					booleanAndExpression();
					state._fsp--;

					}
					break;

				default :
					break loop61;
				}
			}

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
	// $ANTLR end "logicalExpression"



	// $ANTLR start "booleanAndExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:199:1: booleanAndExpression : equalityExpression ( AND equalityExpression )* ;
	public final void booleanAndExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:200:5: ( equalityExpression ( AND equalityExpression )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:200:7: equalityExpression ( AND equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression1083);
			equalityExpression();
			state._fsp--;

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:200:26: ( AND equalityExpression )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==AND) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:200:27: AND equalityExpression
					{
					match(input,AND,FOLLOW_AND_in_booleanAndExpression1086); 
					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression1088);
					equalityExpression();
					state._fsp--;

					}
					break;

				default :
					break loop62;
				}
			}

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
	// $ANTLR end "booleanAndExpression"



	// $ANTLR start "equalityExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:203:1: equalityExpression : relationalExpression ( ( EQUALS | NOTEQUALS ) relationalExpression )* ;
	public final void equalityExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:204:5: ( relationalExpression ( ( EQUALS | NOTEQUALS ) relationalExpression )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:204:7: relationalExpression ( ( EQUALS | NOTEQUALS ) relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression1107);
			relationalExpression();
			state._fsp--;

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:204:28: ( ( EQUALS | NOTEQUALS ) relationalExpression )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==EQUALS||LA63_0==NOTEQUALS) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:204:29: ( EQUALS | NOTEQUALS ) relationalExpression
					{
					if ( input.LA(1)==EQUALS||input.LA(1)==NOTEQUALS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression1118);
					relationalExpression();
					state._fsp--;

					}
					break;

				default :
					break loop63;
				}
			}

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
	// $ANTLR end "equalityExpression"



	// $ANTLR start "relationalExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:207:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )* ;
	public final void relationalExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:208:5: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:208:7: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression1137);
			additiveExpression();
			state._fsp--;

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:208:26: ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( ((LA64_0 >= GT && LA64_0 <= GTEQ)||(LA64_0 >= LT && LA64_0 <= LTEQ)) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:208:27: ( LT | LTEQ | GT | GTEQ ) additiveExpression
					{
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression1156);
					additiveExpression();
					state._fsp--;

					}
					break;

				default :
					break loop64;
				}
			}

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
	// $ANTLR end "relationalExpression"



	// $ANTLR start "additiveExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:211:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* ;
	public final void additiveExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:212:5: ( multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:212:7: multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1175);
			multiplicativeExpression();
			state._fsp--;

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:212:32: ( ( PLUS | MINUS ) multiplicativeExpression )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==MINUS||LA65_0==PLUS) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:212:33: ( PLUS | MINUS ) multiplicativeExpression
					{
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1186);
					multiplicativeExpression();
					state._fsp--;

					}
					break;

				default :
					break loop65;
				}
			}

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
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:215:1: multiplicativeExpression : unaryExpression ( ( MULT | DIV | MOD ) unaryExpression )* ;
	public final void multiplicativeExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:216:5: ( unaryExpression ( ( MULT | DIV | MOD ) unaryExpression )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:216:7: unaryExpression ( ( MULT | DIV | MOD ) unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1205);
			unaryExpression();
			state._fsp--;

			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:216:23: ( ( MULT | DIV | MOD ) unaryExpression )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==DIV||LA66_0==MOD||LA66_0==MULT) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:216:24: ( MULT | DIV | MOD ) unaryExpression
					{
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==MULT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1220);
					unaryExpression();
					state._fsp--;

					}
					break;

				default :
					break loop66;
				}
			}

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
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:219:1: unaryExpression : ( NOT )? primaryExpression ;
	public final void unaryExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:220:2: ( ( NOT )? primaryExpression )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:220:4: ( NOT )? primaryExpression
			{
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:220:4: ( NOT )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==NOT) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:220:4: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_unaryExpression1237); 
					}
					break;

			}

			pushFollow(FOLLOW_primaryExpression_in_unaryExpression1240);
			primaryExpression();
			state._fsp--;

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
	// $ANTLR end "unaryExpression"



	// $ANTLR start "primaryExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:223:1: primaryExpression : ( '(' logicalExpression ')' | NUMBER );
	public final void primaryExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:224:2: ( '(' logicalExpression ')' | NUMBER )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==42) ) {
				alt68=1;
			}
			else if ( (LA68_0==NUMBER) ) {
				alt68=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:224:4: '(' logicalExpression ')'
					{
					match(input,42,FOLLOW_42_in_primaryExpression1255); 
					pushFollow(FOLLOW_logicalExpression_in_primaryExpression1257);
					logicalExpression();
					state._fsp--;

					match(input,43,FOLLOW_43_in_primaryExpression1259); 
					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:225:4: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_primaryExpression1264); 
					}
					break;

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
	// $ANTLR end "primaryExpression"



	// $ANTLR start "stringExpression"
	// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:228:1: stringExpression : STRING ( ( PLUS ) STRING )* ;
	public final void stringExpression() throws RecognitionException {
		try {
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:229:2: ( STRING ( ( PLUS ) STRING )* )
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:229:4: STRING ( ( PLUS ) STRING )*
			{
			match(input,STRING,FOLLOW_STRING_in_stringExpression1278); 
			// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:229:11: ( ( PLUS ) STRING )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==PLUS) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:229:12: ( PLUS ) STRING
					{
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:229:12: ( PLUS )
					// /home/athresh/Projects/PLT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:229:13: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_stringExpression1282); 
					}

					match(input,STRING,FOLLOW_STRING_in_stringExpression1285); 
					}
					break;

				default :
					break loop69;
				}
			}

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
	// $ANTLR end "stringExpression"

	// Delegated rules


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA52 dfa52 = new DFA52(this);
	static final String DFA3_eotS =
		"\17\uffff";
	static final String DFA3_eofS =
		"\17\uffff";
	static final String DFA3_minS =
		"\1\17\1\uffff\1\5\5\uffff\1\34\1\uffff\1\5\1\34\1\50\2\34";
	static final String DFA3_maxS =
		"\1\65\1\uffff\1\54\5\uffff\1\52\1\uffff\1\50\1\52\1\55\2\52";
	static final String DFA3_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\5\uffff";
	static final String DFA3_specialS =
		"\17\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\36\uffff\1\3\1\1\1\7\1\uffff\1\6\1\5\1\uffff\1\4",
			"",
			"\1\10\42\uffff\1\12\3\uffff\1\11",
			"",
			"",
			"",
			"",
			"",
			"\1\14\4\uffff\1\6\6\uffff\1\13\1\1\1\4",
			"",
			"\1\15\42\uffff\1\12",
			"\1\14\4\uffff\1\6\6\uffff\1\13\1\1\1\4",
			"\1\4\4\uffff\1\7",
			"\1\14\4\uffff\1\6\6\uffff\1\16\1\uffff\1\4",
			"\1\14\4\uffff\1\6\6\uffff\1\16\1\uffff\1\4"
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "29:1: definitionStatement : ( dateDefnStmt | calendarDefnStmt | timeFrameDefnStmt | taskDefnStmt | stringDefnStmt | numberDefnStmt | fieldDefnStmt );";
		}
	}

	static final String DFA52_eotS =
		"\40\uffff";
	static final String DFA52_eofS =
		"\40\uffff";
	static final String DFA52_minS =
		"\1\17\1\uffff\2\17\1\uffff\3\17\2\uffff\1\57\5\uffff\1\17\1\5\1\17\1\5"+
		"\1\17\1\5\1\17\1\5\1\17\1\5\2\uffff\4\5";
	static final String DFA52_maxS =
		"\1\117\1\uffff\2\50\1\uffff\3\50\2\uffff\1\63\5\uffff\1\50\1\55\1\50\1"+
		"\55\1\50\1\55\1\50\1\55\1\50\1\55\2\uffff\4\55";
	static final String DFA52_acceptS =
		"\1\uffff\1\1\2\uffff\1\3\3\uffff\1\2\1\4\1\uffff\1\7\1\10\1\11\1\12\1"+
		"\13\12\uffff\1\5\1\6\4\uffff";
	static final String DFA52_specialS =
		"\40\uffff}>";
	static final String[] DFA52_transitionS = {
			"\1\4\36\uffff\1\3\1\2\1\7\1\17\1\6\1\5\1\10\1\4\1\14\1\uffff\1\15\5\uffff"+
			"\1\12\1\16\3\uffff\1\11\10\uffff\1\1\2\uffff\1\13",
			"",
			"\1\21\30\uffff\1\20",
			"\1\23\30\uffff\1\22",
			"",
			"\1\25\30\uffff\1\24",
			"\1\27\30\uffff\1\26",
			"\1\31\30\uffff\1\30",
			"",
			"",
			"\1\32\3\uffff\1\33",
			"",
			"",
			"",
			"",
			"",
			"\1\21\30\uffff\1\20",
			"\1\4\42\uffff\1\34\4\uffff\1\10",
			"\1\23\30\uffff\1\22",
			"\1\4\42\uffff\1\35\4\uffff\1\10",
			"\1\25\30\uffff\1\24",
			"\1\4\42\uffff\1\10\4\uffff\1\10",
			"\1\27\30\uffff\1\26",
			"\1\4\42\uffff\1\36\4\uffff\1\10",
			"\1\31\30\uffff\1\30",
			"\1\4\42\uffff\1\37\4\uffff\1\10",
			"",
			"",
			"\1\4\42\uffff\1\34\4\uffff\1\10",
			"\1\4\42\uffff\1\35\4\uffff\1\10",
			"\1\4\42\uffff\1\36\4\uffff\1\10",
			"\1\4\42\uffff\1\37\4\uffff\1\10"
	};

	static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
	static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
	static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
	static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
	static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
	static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
	static final short[][] DFA52_transition;

	static {
		int numStates = DFA52_transitionS.length;
		DFA52_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
		}
	}

	protected class DFA52 extends DFA {

		public DFA52(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 52;
			this.eot = DFA52_eot;
			this.eof = DFA52_eof;
			this.min = DFA52_min;
			this.max = DFA52_max;
			this.accept = DFA52_accept;
			this.special = DFA52_special;
			this.transition = DFA52_transition;
		}
		@Override
		public String getDescription() {
			return "83:1: statement_type : ( print | declarationStatement | definitionStatement | ifThenStatement | everyFromToByStatement | everyInStatement | untilStatement | breakStatement | continueStatement | exitStatement | readStatement );";
		}
	}

	public static final BitSet FOLLOW_type_in_declarationStatement43 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_WS_in_declarationStatement45 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_IDENT_in_declarationStatement48 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_declarationStatement50 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_declarationStatement53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dateDefnStmt_in_definitionStatement101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_calendarDefnStmt_in_definitionStatement106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeFrameDefnStmt_in_definitionStatement111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_taskDefnStmt_in_definitionStatement116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringDefnStmt_in_definitionStatement121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberDefnStmt_in_definitionStatement126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldDefnStmt_in_definitionStatement131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_dateDefnStmt144 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_WS_in_dateDefnStmt146 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_IDENT_in_dateDefnStmt149 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_dateDefnStmt151 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_dateDefnStmt154 = new BitSet(new long[]{0x0000030000000000L});
	public static final BitSet FOLLOW_WS_in_dateDefnStmt156 = new BitSet(new long[]{0x0000030000000000L});
	public static final BitSet FOLLOW_dateConstant_in_dateDefnStmt159 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_dateDefnStmt161 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_dateDefnStmt164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_dateDefnStmt169 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_dateDefnStmt171 = new BitSet(new long[]{0x0000030000000000L});
	public static final BitSet FOLLOW_WS_in_dateDefnStmt173 = new BitSet(new long[]{0x0000030000000000L});
	public static final BitSet FOLLOW_dateConstant_in_dateDefnStmt176 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_dateDefnStmt178 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_dateDefnStmt181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_timeFrameDefnStmt193 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_WS_in_timeFrameDefnStmt195 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_IDENT_in_timeFrameDefnStmt198 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_timeFrameDefnStmt200 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_timeFrameDefnStmt203 = new BitSet(new long[]{0x0000050010000000L});
	public static final BitSet FOLLOW_WS_in_timeFrameDefnStmt205 = new BitSet(new long[]{0x0000050010000000L});
	public static final BitSet FOLLOW_timeFrameConstant_in_timeFrameDefnStmt208 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_timeFrameDefnStmt210 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_timeFrameDefnStmt213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_timeFrameDefnStmt218 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_timeFrameDefnStmt220 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_timeFrameDefnStmt223 = new BitSet(new long[]{0x0000050010000000L});
	public static final BitSet FOLLOW_WS_in_timeFrameDefnStmt226 = new BitSet(new long[]{0x0000050010000000L});
	public static final BitSet FOLLOW_timeFrameConstant_in_timeFrameDefnStmt229 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_timeFrameDefnStmt231 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_timeFrameDefnStmt234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_taskDefnStmt245 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_WS_in_taskDefnStmt247 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_IDENT_in_taskDefnStmt250 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_taskDefnStmt252 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_WS_in_taskDefnStmt254 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_STRING_in_taskDefnStmt257 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_taskDefnStmt259 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_taskDefnStmt262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fieldDefnStmt273 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_fieldDefnStmt275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_fieldDefnStmt276 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt278 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_fieldDefnStmt281 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_fieldDefnStmt283 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt285 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_fieldDefnStmt288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fieldDefnStmt293 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_fieldDefnStmt295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_fieldDefnStmt297 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt299 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_fieldDefnStmt302 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_dateConstant_in_fieldDefnStmt304 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt306 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_fieldDefnStmt309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fieldDefnStmt314 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_fieldDefnStmt316 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_fieldDefnStmt318 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt320 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_fieldDefnStmt323 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_dateConstant_in_fieldDefnStmt325 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt327 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_fieldDefnStmt330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fieldDefnStmt335 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_fieldDefnStmt337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_fieldDefnStmt339 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt341 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_fieldDefnStmt344 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_fieldDefnStmt346 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt348 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_fieldDefnStmt351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_fieldDefnStmt356 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_fieldDefnStmt358 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_fieldDefnStmt360 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt362 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_fieldDefnStmt365 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_fieldDefnStmt367 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_fieldDefnStmt369 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_fieldDefnStmt372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_stringDefnStmt384 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_WS_in_stringDefnStmt386 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_IDENT_in_stringDefnStmt389 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_stringDefnStmt391 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_stringDefnStmt394 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_WS_in_stringDefnStmt396 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_STRING_in_stringDefnStmt399 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_stringDefnStmt401 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_stringDefnStmt404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_stringDefnStmt409 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_stringDefnStmt411 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_stringDefnStmt414 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_WS_in_stringDefnStmt416 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_STRING_in_stringDefnStmt419 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_stringDefnStmt421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_numberDefnStmt432 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_WS_in_numberDefnStmt434 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_IDENT_in_numberDefnStmt437 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_numberDefnStmt439 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_numberDefnStmt442 = new BitSet(new long[]{0x0000010010000000L});
	public static final BitSet FOLLOW_WS_in_numberDefnStmt444 = new BitSet(new long[]{0x0000010010000000L});
	public static final BitSet FOLLOW_NUMBER_in_numberDefnStmt447 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_numberDefnStmt449 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_numberDefnStmt452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_numberDefnStmt457 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_numberDefnStmt459 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_numberDefnStmt462 = new BitSet(new long[]{0x0000010010000000L});
	public static final BitSet FOLLOW_WS_in_numberDefnStmt464 = new BitSet(new long[]{0x0000010010000000L});
	public static final BitSet FOLLOW_NUMBER_in_numberDefnStmt467 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_numberDefnStmt469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_calendarDefnStmt480 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_WS_in_calendarDefnStmt482 = new BitSet(new long[]{0x0000010000008000L});
	public static final BitSet FOLLOW_IDENT_in_calendarDefnStmt485 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_WS_in_calendarDefnStmt487 = new BitSet(new long[]{0x0000010000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_calendarDefnStmt490 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_WS_in_calendarDefnStmt492 = new BitSet(new long[]{0x0000010200000000L});
	public static final BitSet FOLLOW_STRING_in_calendarDefnStmt495 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_WS_in_calendarDefnStmt497 = new BitSet(new long[]{0x0000210000000000L});
	public static final BitSet FOLLOW_45_in_calendarDefnStmt500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_type_in_statement516 = new BitSet(new long[]{0xC17FC00000008002L,0x0000000000009008L});
	public static final BitSet FOLLOW_print_in_statement_type529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declarationStatement_in_statement_type534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definitionStatement_in_statement_type539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifThenStatement_in_statement_type544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_everyFromToByStatement_in_statement_type549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_everyInStatement_in_statement_type554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_untilStatement_in_statement_type561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breakStatement_in_statement_type566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continueStatement_in_statement_type571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitStatement_in_statement_type576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_readStatement_in_statement_type581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalExpression_in_expression593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_ifThenStatement604 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ifThenStatement606 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_expression_in_ifThenStatement608 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_ifThenStatement610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_ifThenStatement612 = new BitSet(new long[]{0xC17FC00000008000L,0x0000000000089008L});
	public static final BitSet FOLLOW_statement_type_in_ifThenStatement614 = new BitSet(new long[]{0xC17FC00000008000L,0x0000000000089008L});
	public static final BitSet FOLLOW_83_in_ifThenStatement617 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_elseStatement_in_ifThenStatement619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_elseStatement630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_elseStatement632 = new BitSet(new long[]{0xC17FC00000008000L,0x0000000000089008L});
	public static final BitSet FOLLOW_statement_type_in_elseStatement634 = new BitSet(new long[]{0xC17FC00000008000L,0x0000000000089008L});
	public static final BitSet FOLLOW_83_in_elseStatement637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_everyFromToByStatement651 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_everyFromToByStatement653 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_everyFromToByStatement655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_everyFromToByStatement657 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_dateOrIdent_in_everyFromToByStatement659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_everyFromToByStatement661 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_dateOrIdent_in_everyFromToByStatement663 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_everyFromToByStatement665 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_timeframeOrIdent_in_everyFromToByStatement667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_everyFromToByStatement669 = new BitSet(new long[]{0xC17FC00000008000L,0x0000000000089008L});
	public static final BitSet FOLLOW_statement_type_in_everyFromToByStatement671 = new BitSet(new long[]{0xC17FC00000008000L,0x0000000000089008L});
	public static final BitSet FOLLOW_83_in_everyFromToByStatement674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_everyInStatement686 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_everyInStatement688 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_everyInStatement690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_everyInStatement692 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENT_in_everyInStatement694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_everyInStatement696 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_dateOrIdent_in_everyInStatement698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_everyInStatement700 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_dateOrIdent_in_everyInStatement702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040800L});
	public static final BitSet FOLLOW_loopOptions_in_everyInStatement704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_everyInStatement706 = new BitSet(new long[]{0xC17FC00000008000L,0x0000000000089008L});
	public static final BitSet FOLLOW_statement_type_in_everyInStatement708 = new BitSet(new long[]{0xC17FC00000008000L,0x0000000000089008L});
	public static final BitSet FOLLOW_83_in_everyInStatement711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_loopOptions723 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_expression_in_loopOptions725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_dateOrIdent740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_timeframeOrIdent754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_untilStatement767 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_dateOrIdent_in_untilStatement769 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_untilStatement771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_breakStatement783 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_breakStatement785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_continueStatement797 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_continueStatement799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_exitStatement811 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_exitStatement813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_readStatement825 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_readStatement827 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_readStatement829 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_readStatement831 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_readStatement833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_print845 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_print847 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_print849 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_print852 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_print854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant883 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant885 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_MONTH_in_dateConstant887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant894 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant896 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_MONTH_in_dateConstant898 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant900 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DAY_in_dateConstant902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant909 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant911 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_MONTH_in_dateConstant913 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant915 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DAY_in_dateConstant917 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant919 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_HOUR_in_dateConstant921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant927 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant929 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_MONTH_in_dateConstant931 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant933 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DAY_in_dateConstant935 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant937 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_HOUR_in_dateConstant939 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_dateConstant941 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MINUTE_in_dateConstant943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_timeFrame960 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_WS_in_timeFrame962 = new BitSet(new long[]{0x0600000000000000L,0x00000000000303C6L});
	public static final BitSet FOLLOW_set_in_timeFrame967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeFrame_in_timeFrameConstant1002 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_PLUS_in_timeFrameConstant1005 = new BitSet(new long[]{0x0000040010000000L});
	public static final BitSet FOLLOW_timeFrame_in_timeFrameConstant1007 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression1059 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression1062 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression1064 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression1083 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression1086 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression1088 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1107 = new BitSet(new long[]{0x0000000008000802L});
	public static final BitSet FOLLOW_set_in_equalityExpression1110 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1118 = new BitSet(new long[]{0x0000000008000802L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1137 = new BitSet(new long[]{0x00000000000C3002L});
	public static final BitSet FOLLOW_set_in_relationalExpression1140 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1156 = new BitSet(new long[]{0x00000000000C3002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1175 = new BitSet(new long[]{0x0000000040100002L});
	public static final BitSet FOLLOW_set_in_additiveExpression1178 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1186 = new BitSet(new long[]{0x0000000040100002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1205 = new BitSet(new long[]{0x0000000001400402L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression1208 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1220 = new BitSet(new long[]{0x0000000001400402L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression1237 = new BitSet(new long[]{0x0000040010000000L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_primaryExpression1255 = new BitSet(new long[]{0x0000040014000000L});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression1257 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_primaryExpression1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_primaryExpression1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_stringExpression1278 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_PLUS_in_stringExpression1282 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_stringExpression1285 = new BitSet(new long[]{0x0000000040000002L});
}
