// $ANTLR 3.5 /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g 2013-04-20 20:59:52

  package columbia.plt.tt;
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class EvaluatorWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "DIGIT", "IDENT", "LETTER", 
		"NEGATION", "WS", "'!'", "'&&'", "'('", "')'", "';'", "'='", "'||'"
	};
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public EvaluatorWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public EvaluatorWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return EvaluatorWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g"; }


	  private Map<String, Boolean> symbolTable = new HashMap<String, Boolean>();



	// $ANTLR start "evaluator"
	// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:19:1: evaluator returns [boolean result] : ( assignment )* e= expression EOF ;
	public final boolean evaluator() throws RecognitionException {
		boolean result = false;


		boolean e =false;

		try {
			// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:20:2: ( ( assignment )* e= expression EOF )
			// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:20:4: ( assignment )* e= expression EOF
			{
			// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:20:4: ( assignment )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==15) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:20:4: assignment
					{
					pushFollow(FOLLOW_assignment_in_evaluator61);
					assignment();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_expression_in_evaluator66);
			e=expression();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_evaluator68); 
			 result = e; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "evaluator"



	// $ANTLR start "assignment"
	// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:23:1: assignment : ^( '=' IDENT e= expression ) ;
	public final void assignment() throws RecognitionException {
		CommonTree IDENT1=null;
		boolean e =false;

		try {
			// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:24:2: ( ^( '=' IDENT e= expression ) )
			// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:24:4: ^( '=' IDENT e= expression )
			{
			match(input,15,FOLLOW_15_in_assignment82); 
			match(input, Token.DOWN, null); 
			IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment84); 
			pushFollow(FOLLOW_expression_in_assignment88);
			e=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			 symbolTable.put((IDENT1!=null?IDENT1.getText():null), e); 
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
	// $ANTLR end "assignment"



	// $ANTLR start "expression"
	// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:28:1: expression returns [boolean result] : ( ^( '&&' op1= expression op2= expression ) | ^( '||' op1= expression op2= expression ) | ^( NEGATION e= expression ) | IDENT | BOOL );
	public final boolean expression() throws RecognitionException {
		boolean result = false;


		CommonTree IDENT2=null;
		CommonTree BOOL3=null;
		boolean op1 =false;
		boolean op2 =false;
		boolean e =false;

		try {
			// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:29:2: ( ^( '&&' op1= expression op2= expression ) | ^( '||' op1= expression op2= expression ) | ^( NEGATION e= expression ) | IDENT | BOOL )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 11:
				{
				alt2=1;
				}
				break;
			case 16:
				{
				alt2=2;
				}
				break;
			case NEGATION:
				{
				alt2=3;
				}
				break;
			case IDENT:
				{
				alt2=4;
				}
				break;
			case BOOL:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:29:4: ^( '&&' op1= expression op2= expression )
					{
					match(input,11,FOLLOW_11_in_expression111); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression115);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression119);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = op1 && op2; 
					}
					break;
				case 2 :
					// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:30:4: ^( '||' op1= expression op2= expression )
					{
					match(input,16,FOLLOW_16_in_expression128); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression132);
					op1=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression136);
					op2=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = op1 || op2; 
					}
					break;
				case 3 :
					// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:31:4: ^( NEGATION e= expression )
					{
					match(input,NEGATION,FOLLOW_NEGATION_in_expression145); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression149);
					e=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					 result = !e; 
					}
					break;
				case 4 :
					// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:32:4: IDENT
					{
					IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expression158); 
					 result = symbolTable.get((IDENT2!=null?IDENT2.getText():null)); 
					}
					break;
				case 5 :
					// /Users/caozheng/PLT/TT/LogicalExpressions/src/columbia/plt/tt/EvaluatorWalker.g:33:4: BOOL
					{
					BOOL3=(CommonTree)match(input,BOOL,FOLLOW_BOOL_in_expression165); 
					 result = Boolean.parseBoolean((BOOL3!=null?BOOL3.getText():null)); 
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
		return result;
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_assignment_in_evaluator61 = new BitSet(new long[]{0x0000000000018950L});
	public static final BitSet FOLLOW_expression_in_evaluator66 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_evaluator68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_assignment82 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENT_in_assignment84 = new BitSet(new long[]{0x0000000000010950L});
	public static final BitSet FOLLOW_expression_in_assignment88 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_11_in_expression111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression115 = new BitSet(new long[]{0x0000000000010950L});
	public static final BitSet FOLLOW_expression_in_expression119 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_16_in_expression128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression132 = new BitSet(new long[]{0x0000000000010950L});
	public static final BitSet FOLLOW_expression_in_expression136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATION_in_expression145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENT_in_expression158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_expression165 = new BitSet(new long[]{0x0000000000000002L});
}
