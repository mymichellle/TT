// $ANTLR 3.5 /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g 2013-04-10 01:34:02

	package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HelloWorldParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BOOL", "DAY", "DIGIT", 
		"DIV", "EQUALS", "GT", "GTEQ", "HOUR", "IDENT", "LETTER", "LOWER", "LT", 
		"LTEQ", "MINUS", "MINUTE", "MOD", "MONTH", "MULT", "NONCONTROL_CHAR", 
		"NOT", "NOTEQUALS", "NUMBER", "OR", "PLUS", "SPACE", "STRING", "SYMBOL", 
		"TIMEENTITYDAY", "TIMEENTITYMONTH", "TIMEENTITYWEEK", "UPPER", "WS", "YEAR", 
		"' '", "'('", "')'", "'.'", "';'", "'day'", "'days'", "'hour'", "'hours'", 
		"'minute'", "'minutes'", "'month'", "'months'", "'print'", "'year'", "'years'"
	};
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
	@Override public String getGrammarFileName() { return "/Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g"; }



	// $ANTLR start "print"
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:1: print : 'print' '(' STRING ')' ';' ;
	public final void print() throws RecognitionException {
		Token STRING1=null;

		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:7: ( 'print' '(' STRING ')' ';' )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:13:9: 'print' '(' STRING ')' ';'
			{
			match(input,51,FOLLOW_51_in_print39); 
			match(input,39,FOLLOW_39_in_print41); 
			STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_print44); 
			match(input,40,FOLLOW_40_in_print47); 
			match(input,42,FOLLOW_42_in_print49); 
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



	// $ANTLR start "da"
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:21:1: da : ( YEAR MONTH || DAY );
	public final void da() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:21:4: ( YEAR MONTH || DAY )
			int alt1=3;
			switch ( input.LA(1) ) {
			case YEAR:
				{
				alt1=1;
				}
				break;
			case EOF:
				{
				alt1=2;
				}
				break;
			case DAY:
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:22:2: YEAR MONTH
					{
					match(input,YEAR,FOLLOW_YEAR_in_da72); 
					match(input,MONTH,FOLLOW_MONTH_in_da75); 
					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:22:17: 
					{
					}
					break;
				case 3 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:22:18: DAY
					{
					match(input,DAY,FOLLOW_DAY_in_da79); 
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
	// $ANTLR end "da"



	// $ANTLR start "dateConstant"
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:25:1: dateConstant : ( YEAR | YEAR '.' MONTH | YEAR '.' MONTH '.' DAY | YEAR '.' MONTH '.' DAY '.' HOUR | YEAR '.' MONTH '.' DAY '.' HOUR '.' MINUTE );
	public final void dateConstant() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:26:3: ( YEAR | YEAR '.' MONTH | YEAR '.' MONTH '.' DAY | YEAR '.' MONTH '.' DAY '.' HOUR | YEAR '.' MONTH '.' DAY '.' HOUR '.' MINUTE )
			int alt2=5;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==YEAR) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==41) ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2==MONTH) ) {
						int LA2_4 = input.LA(4);
						if ( (LA2_4==41) ) {
							int LA2_5 = input.LA(5);
							if ( (LA2_5==DAY) ) {
								int LA2_7 = input.LA(6);
								if ( (LA2_7==41) ) {
									int LA2_8 = input.LA(7);
									if ( (LA2_8==HOUR) ) {
										int LA2_10 = input.LA(8);
										if ( (LA2_10==41) ) {
											alt2=5;
										}
										else if ( (LA2_10==EOF) ) {
											alt2=4;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 2, 10, input);
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
												new NoViableAltException("", 2, 8, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA2_7==EOF) ) {
									alt2=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 7, input);
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
										new NoViableAltException("", 2, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA2_4==EOF) ) {
							alt2=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 4, input);
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
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA2_1==EOF) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:26:5: YEAR
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant92); 
					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:26:12: YEAR '.' MONTH
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant96); 
					match(input,41,FOLLOW_41_in_dateConstant98); 
					match(input,MONTH,FOLLOW_MONTH_in_dateConstant100); 
					}
					break;
				case 3 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:26:29: YEAR '.' MONTH '.' DAY
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant104); 
					match(input,41,FOLLOW_41_in_dateConstant106); 
					match(input,MONTH,FOLLOW_MONTH_in_dateConstant108); 
					match(input,41,FOLLOW_41_in_dateConstant110); 
					match(input,DAY,FOLLOW_DAY_in_dateConstant112); 
					}
					break;
				case 4 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:27:6: YEAR '.' MONTH '.' DAY '.' HOUR
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant120); 
					match(input,41,FOLLOW_41_in_dateConstant122); 
					match(input,MONTH,FOLLOW_MONTH_in_dateConstant124); 
					match(input,41,FOLLOW_41_in_dateConstant126); 
					match(input,DAY,FOLLOW_DAY_in_dateConstant128); 
					match(input,41,FOLLOW_41_in_dateConstant130); 
					match(input,HOUR,FOLLOW_HOUR_in_dateConstant132); 
					}
					break;
				case 5 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:28:6: YEAR '.' MONTH '.' DAY '.' HOUR '.' MINUTE
					{
					match(input,YEAR,FOLLOW_YEAR_in_dateConstant139); 
					match(input,41,FOLLOW_41_in_dateConstant141); 
					match(input,MONTH,FOLLOW_MONTH_in_dateConstant143); 
					match(input,41,FOLLOW_41_in_dateConstant145); 
					match(input,DAY,FOLLOW_DAY_in_dateConstant147); 
					match(input,41,FOLLOW_41_in_dateConstant149); 
					match(input,HOUR,FOLLOW_HOUR_in_dateConstant151); 
					match(input,41,FOLLOW_41_in_dateConstant153); 
					match(input,MINUTE,FOLLOW_MINUTE_in_dateConstant155); 
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:31:1: timeFrame : primaryExpression ( ( ' ' )* ) ( 'year' | 'years' | 'month' | 'months' | 'day' | 'days' | 'hour' | 'hours' | 'minute' | 'minutes' ) ;
	public final void timeFrame() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:2: ( primaryExpression ( ( ' ' )* ) ( 'year' | 'years' | 'month' | 'months' | 'day' | 'days' | 'hour' | 'hours' | 'minute' | 'minutes' ) )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:4: primaryExpression ( ( ' ' )* ) ( 'year' | 'years' | 'month' | 'months' | 'day' | 'days' | 'hour' | 'hours' | 'minute' | 'minutes' )
			{
			pushFollow(FOLLOW_primaryExpression_in_timeFrame173);
			primaryExpression();
			state._fsp--;

			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:22: ( ( ' ' )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:23: ( ' ' )*
			{
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:23: ( ' ' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==38) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:32:24: ' '
					{
					match(input,38,FOLLOW_38_in_timeFrame177); 
					}
					break;

				default :
					break loop3;
				}
			}

			}

			if ( (input.LA(1) >= 43 && input.LA(1) <= 50)||(input.LA(1) >= 52 && input.LA(1) <= 53) ) {
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:36:1: timeFrameConstant : timeFrame ( '+' timeFrame )* ;
	public final void timeFrameConstant() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:37:2: ( timeFrame ( '+' timeFrame )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:37:4: timeFrame ( '+' timeFrame )*
			{
			pushFollow(FOLLOW_timeFrame_in_timeFrameConstant220);
			timeFrame();
			state._fsp--;

			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:37:14: ( '+' timeFrame )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==PLUS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:37:15: '+' timeFrame
					{
					match(input,PLUS,FOLLOW_PLUS_in_timeFrameConstant223); 
					pushFollow(FOLLOW_timeFrame_in_timeFrameConstant225);
					timeFrame();
					state._fsp--;

					}
					break;

				default :
					break loop4;
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:40:1: timeEntityConstant : ( TIMEENTITYDAY | TIMEENTITYWEEK | TIMEENTITYMONTH );
	public final void timeEntityConstant() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:41:2: ( TIMEENTITYDAY | TIMEENTITYWEEK | TIMEENTITYMONTH )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:49:1: logicalExpression : booleanAndExpression ( OR booleanAndExpression )* ;
	public final void logicalExpression() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:50:5: ( booleanAndExpression ( OR booleanAndExpression )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:50:7: booleanAndExpression ( OR booleanAndExpression )*
			{
			pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression267);
			booleanAndExpression();
			state._fsp--;

			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:50:28: ( OR booleanAndExpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==OR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:50:29: OR booleanAndExpression
					{
					match(input,OR,FOLLOW_OR_in_logicalExpression270); 
					pushFollow(FOLLOW_booleanAndExpression_in_logicalExpression272);
					booleanAndExpression();
					state._fsp--;

					}
					break;

				default :
					break loop5;
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:53:1: booleanAndExpression : equalityExpression ( AND equalityExpression )* ;
	public final void booleanAndExpression() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:54:5: ( equalityExpression ( AND equalityExpression )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:54:7: equalityExpression ( AND equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression291);
			equalityExpression();
			state._fsp--;

			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:54:26: ( AND equalityExpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:54:27: AND equalityExpression
					{
					match(input,AND,FOLLOW_AND_in_booleanAndExpression294); 
					pushFollow(FOLLOW_equalityExpression_in_booleanAndExpression296);
					equalityExpression();
					state._fsp--;

					}
					break;

				default :
					break loop6;
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:57:1: equalityExpression : relationalExpression ( ( EQUALS | NOTEQUALS ) relationalExpression )* ;
	public final void equalityExpression() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:5: ( relationalExpression ( ( EQUALS | NOTEQUALS ) relationalExpression )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:7: relationalExpression ( ( EQUALS | NOTEQUALS ) relationalExpression )*
			{
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression315);
			relationalExpression();
			state._fsp--;

			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:28: ( ( EQUALS | NOTEQUALS ) relationalExpression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==EQUALS||LA7_0==NOTEQUALS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:58:29: ( EQUALS | NOTEQUALS ) relationalExpression
					{
					if ( input.LA(1)==EQUALS||input.LA(1)==NOTEQUALS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression326);
					relationalExpression();
					state._fsp--;

					}
					break;

				default :
					break loop7;
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:61:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )* ;
	public final void relationalExpression() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:62:5: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:62:7: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression345);
			additiveExpression();
			state._fsp--;

			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:62:26: ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= GT && LA8_0 <= GTEQ)||(LA8_0 >= LT && LA8_0 <= LTEQ)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:62:27: ( LT | LTEQ | GT | GTEQ ) additiveExpression
					{
					if ( (input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression364);
					additiveExpression();
					state._fsp--;

					}
					break;

				default :
					break loop8;
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:65:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* ;
	public final void additiveExpression() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:66:5: ( multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:66:7: multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression383);
			multiplicativeExpression();
			state._fsp--;

			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:66:32: ( ( PLUS | MINUS ) multiplicativeExpression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==MINUS||LA9_0==PLUS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:66:33: ( PLUS | MINUS ) multiplicativeExpression
					{
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression394);
					multiplicativeExpression();
					state._fsp--;

					}
					break;

				default :
					break loop9;
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:69:1: multiplicativeExpression : unaryExpression ( ( MULT | DIV | MOD ) unaryExpression )* ;
	public final void multiplicativeExpression() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:70:5: ( unaryExpression ( ( MULT | DIV | MOD ) unaryExpression )* )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:70:7: unaryExpression ( ( MULT | DIV | MOD ) unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression413);
			unaryExpression();
			state._fsp--;

			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:70:23: ( ( MULT | DIV | MOD ) unaryExpression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==DIV||LA10_0==MOD||LA10_0==MULT) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:70:24: ( MULT | DIV | MOD ) unaryExpression
					{
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==MULT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression428);
					unaryExpression();
					state._fsp--;

					}
					break;

				default :
					break loop10;
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:73:1: unaryExpression : NOT primaryExpression ;
	public final void unaryExpression() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:74:5: ( NOT primaryExpression )
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:74:7: NOT primaryExpression
			{
			match(input,NOT,FOLLOW_NOT_in_unaryExpression448); 
			pushFollow(FOLLOW_primaryExpression_in_unaryExpression450);
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
	// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:77:1: primaryExpression : ( '(' logicalExpression ')' | NUMBER | STRING );
	public final void primaryExpression() throws RecognitionException {
		try {
			// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:78:5: ( '(' logicalExpression ')' | NUMBER | STRING )
			int alt11=3;
			switch ( input.LA(1) ) {
			case 39:
				{
				alt11=1;
				}
				break;
			case NUMBER:
				{
				alt11=2;
				}
				break;
			case STRING:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:78:7: '(' logicalExpression ')'
					{
					match(input,39,FOLLOW_39_in_primaryExpression468); 
					pushFollow(FOLLOW_logicalExpression_in_primaryExpression470);
					logicalExpression();
					state._fsp--;

					match(input,40,FOLLOW_40_in_primaryExpression472); 
					}
					break;
				case 2 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:79:7: NUMBER
					{
					match(input,NUMBER,FOLLOW_NUMBER_in_primaryExpression480); 
					}
					break;
				case 3 :
					// /Users/caozheng/TT/TT/HelloWorld/src/columbia/plt/tt/HelloWorld.g:80:7: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_primaryExpression488); 
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

	// Delegated rules



	public static final BitSet FOLLOW_51_in_print39 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_print41 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_STRING_in_print44 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_print47 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_print49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_da72 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MONTH_in_da75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DAY_in_da79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant96 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant98 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MONTH_in_dateConstant100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant104 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant106 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MONTH_in_dateConstant108 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant110 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DAY_in_dateConstant112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant120 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant122 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MONTH_in_dateConstant124 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant126 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DAY_in_dateConstant128 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant130 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_HOUR_in_dateConstant132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_YEAR_in_dateConstant139 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant141 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_MONTH_in_dateConstant143 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant145 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DAY_in_dateConstant147 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant149 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_HOUR_in_dateConstant151 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_dateConstant153 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_MINUTE_in_dateConstant155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_timeFrame173 = new BitSet(new long[]{0x0037F84000000000L});
	public static final BitSet FOLLOW_38_in_timeFrame177 = new BitSet(new long[]{0x0037F84000000000L});
	public static final BitSet FOLLOW_set_in_timeFrame185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeFrame_in_timeFrameConstant220 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_PLUS_in_timeFrameConstant223 = new BitSet(new long[]{0x0000008044000000L});
	public static final BitSet FOLLOW_timeFrame_in_timeFrameConstant225 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression267 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_OR_in_logicalExpression270 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_booleanAndExpression_in_logicalExpression272 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression291 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_booleanAndExpression294 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_equalityExpression_in_booleanAndExpression296 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression315 = new BitSet(new long[]{0x0000000002000202L});
	public static final BitSet FOLLOW_set_in_equalityExpression318 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression326 = new BitSet(new long[]{0x0000000002000202L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression345 = new BitSet(new long[]{0x0000000000030C02L});
	public static final BitSet FOLLOW_set_in_relationalExpression348 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression364 = new BitSet(new long[]{0x0000000000030C02L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression383 = new BitSet(new long[]{0x0000000010040002L});
	public static final BitSet FOLLOW_set_in_additiveExpression386 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression394 = new BitSet(new long[]{0x0000000010040002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression413 = new BitSet(new long[]{0x0000000000500102L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression416 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression428 = new BitSet(new long[]{0x0000000000500102L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression448 = new BitSet(new long[]{0x0000008044000000L});
	public static final BitSet FOLLOW_primaryExpression_in_unaryExpression450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_primaryExpression468 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_logicalExpression_in_primaryExpression470 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_primaryExpression472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_primaryExpression480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_primaryExpression488 = new BitSet(new long[]{0x0000000000000002L});
}
