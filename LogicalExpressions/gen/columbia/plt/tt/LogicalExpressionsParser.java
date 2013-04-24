// $ANTLR 3.5 /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g 2013-04-24 16:31:16

  package columbia.plt.tt;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LogicalExpressionsParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LogicalExpressionsParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LogicalExpressionsParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LogicalExpressionsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g"; }


	public static class evaluator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "evaluator"
	// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:21:1: evaluator : ( assignmentStmt )* expression EOF !;
	public final LogicalExpressionsParser.evaluator_return evaluator() throws RecognitionException {
		LogicalExpressionsParser.evaluator_return retval = new LogicalExpressionsParser.evaluator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope assignmentStmt1 =null;
		ParserRuleReturnScope expression2 =null;

		CommonTree EOF3_tree=null;

		try {
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:22:2: ( ( assignmentStmt )* expression EOF !)
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:22:4: ( assignmentStmt )* expression EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:22:4: ( assignmentStmt )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==IDENT) ) {
					int LA1_2 = input.LA(2);
					if ( (LA1_2==15) ) {
						alt1=1;
					}

				}

				switch (alt1) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:22:4: assignmentStmt
					{
					pushFollow(FOLLOW_assignmentStmt_in_evaluator63);
					assignmentStmt1=assignmentStmt();
					state._fsp--;

					adaptor.addChild(root_0, assignmentStmt1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_expression_in_evaluator66);
			expression2=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression2.getTree());

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_evaluator68); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "evaluator"


	public static class assignmentStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignmentStmt"
	// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:25:1: assignmentStmt : IDENT '=' ^ expression ';' !;
	public final LogicalExpressionsParser.assignmentStmt_return assignmentStmt() throws RecognitionException {
		LogicalExpressionsParser.assignmentStmt_return retval = new LogicalExpressionsParser.assignmentStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT4=null;
		Token char_literal5=null;
		Token char_literal7=null;
		ParserRuleReturnScope expression6 =null;

		CommonTree IDENT4_tree=null;
		CommonTree char_literal5_tree=null;
		CommonTree char_literal7_tree=null;

		try {
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:26:2: ( IDENT '=' ^ expression ';' !)
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:26:4: IDENT '=' ^ expression ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignmentStmt81); 
			IDENT4_tree = (CommonTree)adaptor.create(IDENT4);
			adaptor.addChild(root_0, IDENT4_tree);

			char_literal5=(Token)match(input,15,FOLLOW_15_in_assignmentStmt83); 
			char_literal5_tree = (CommonTree)adaptor.create(char_literal5);
			root_0 = (CommonTree)adaptor.becomeRoot(char_literal5_tree, root_0);

			pushFollow(FOLLOW_expression_in_assignmentStmt86);
			expression6=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression6.getTree());

			char_literal7=(Token)match(input,14,FOLLOW_14_in_assignmentStmt88); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentStmt"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:31:1: term : ( IDENT | '(' ! expression ')' !| BOOL );
	public final LogicalExpressionsParser.term_return term() throws RecognitionException {
		LogicalExpressionsParser.term_return retval = new LogicalExpressionsParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IDENT8=null;
		Token char_literal9=null;
		Token char_literal11=null;
		Token BOOL12=null;
		ParserRuleReturnScope expression10 =null;

		CommonTree IDENT8_tree=null;
		CommonTree char_literal9_tree=null;
		CommonTree char_literal11_tree=null;
		CommonTree BOOL12_tree=null;

		try {
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:32:2: ( IDENT | '(' ! expression ')' !| BOOL )
			int alt2=3;
			switch ( input.LA(1) ) {
			case IDENT:
				{
				alt2=1;
				}
				break;
			case 12:
				{
				alt2=2;
				}
				break;
			case BOOL:
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
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:32:4: IDENT
					{
					root_0 = (CommonTree)adaptor.nil();


					IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_term103); 
					IDENT8_tree = (CommonTree)adaptor.create(IDENT8);
					adaptor.addChild(root_0, IDENT8_tree);

					}
					break;
				case 2 :
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:33:4: '(' ! expression ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal9=(Token)match(input,12,FOLLOW_12_in_term108); 
					pushFollow(FOLLOW_expression_in_term111);
					expression10=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression10.getTree());

					char_literal11=(Token)match(input,13,FOLLOW_13_in_term113); 
					}
					break;
				case 3 :
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:34:4: BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL12=(Token)match(input,BOOL,FOLLOW_BOOL_in_term119); 
					BOOL12_tree = (CommonTree)adaptor.create(BOOL12);
					adaptor.addChild(root_0, BOOL12_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class unary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:37:1: unary : ( negation ^)* term ;
	public final LogicalExpressionsParser.unary_return unary() throws RecognitionException {
		LogicalExpressionsParser.unary_return retval = new LogicalExpressionsParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope negation13 =null;
		ParserRuleReturnScope term14 =null;


		try {
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:38:2: ( ( negation ^)* term )
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:38:4: ( negation ^)* term
			{
			root_0 = (CommonTree)adaptor.nil();


			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:38:4: ( negation ^)*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==10) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:38:5: negation ^
					{
					pushFollow(FOLLOW_negation_in_unary132);
					negation13=negation();
					state._fsp--;

					root_0 = (CommonTree)adaptor.becomeRoot(negation13.getTree(), root_0);
					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_term_in_unary137);
			term14=term();
			state._fsp--;

			adaptor.addChild(root_0, term14.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class negation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:41:1: negation : '!' -> NEGATION ;
	public final LogicalExpressionsParser.negation_return negation() throws RecognitionException {
		LogicalExpressionsParser.negation_return retval = new LogicalExpressionsParser.negation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal15=null;

		CommonTree char_literal15_tree=null;
		RewriteRuleTokenStream stream_10=new RewriteRuleTokenStream(adaptor,"token 10");

		try {
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:42:2: ( '!' -> NEGATION )
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:42:4: '!'
			{
			char_literal15=(Token)match(input,10,FOLLOW_10_in_negation148);  
			stream_10.add(char_literal15);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 42:8: -> NEGATION
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negation"


	public static class logicalAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalAnd"
	// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:45:1: logicalAnd : unary ( ( '&&' ) unary )* ;
	public final LogicalExpressionsParser.logicalAnd_return logicalAnd() throws RecognitionException {
		LogicalExpressionsParser.logicalAnd_return retval = new LogicalExpressionsParser.logicalAnd_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal17=null;
		ParserRuleReturnScope unary16 =null;
		ParserRuleReturnScope unary18 =null;

		CommonTree string_literal17_tree=null;

		try {
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:46:2: ( unary ( ( '&&' ) unary )* )
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:46:4: unary ( ( '&&' ) unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_logicalAnd163);
			unary16=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary16.getTree());

			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:46:10: ( ( '&&' ) unary )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==11) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:46:11: ( '&&' ) unary
					{
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:46:11: ( '&&' )
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:46:12: '&&'
					{
					string_literal17=(Token)match(input,11,FOLLOW_11_in_logicalAnd167); 
					string_literal17_tree = (CommonTree)adaptor.create(string_literal17);
					adaptor.addChild(root_0, string_literal17_tree);

					}

					pushFollow(FOLLOW_unary_in_logicalAnd170);
					unary18=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary18.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalAnd"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:49:1: expression : logicalAnd ( ( '||' ^) logicalAnd )* ;
	public final LogicalExpressionsParser.expression_return expression() throws RecognitionException {
		LogicalExpressionsParser.expression_return retval = new LogicalExpressionsParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal20=null;
		ParserRuleReturnScope logicalAnd19 =null;
		ParserRuleReturnScope logicalAnd21 =null;

		CommonTree string_literal20_tree=null;

		try {
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:50:2: ( logicalAnd ( ( '||' ^) logicalAnd )* )
			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:50:4: logicalAnd ( ( '||' ^) logicalAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalAnd_in_expression184);
			logicalAnd19=logicalAnd();
			state._fsp--;

			adaptor.addChild(root_0, logicalAnd19.getTree());

			// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:50:15: ( ( '||' ^) logicalAnd )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==16) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:50:16: ( '||' ^) logicalAnd
					{
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:50:16: ( '||' ^)
					// /home/athresh/Projects/PLT/TT/LogicalExpressions/src/columbia/plt/tt/LogicalExpressions.g:50:17: '||' ^
					{
					string_literal20=(Token)match(input,16,FOLLOW_16_in_expression188); 
					string_literal20_tree = (CommonTree)adaptor.create(string_literal20);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal20_tree, root_0);

					}

					pushFollow(FOLLOW_logicalAnd_in_expression192);
					logicalAnd21=logicalAnd();
					state._fsp--;

					adaptor.addChild(root_0, logicalAnd21.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_assignmentStmt_in_evaluator63 = new BitSet(new long[]{0x0000000000001450L});
	public static final BitSet FOLLOW_expression_in_evaluator66 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_evaluator68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_assignmentStmt81 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_assignmentStmt83 = new BitSet(new long[]{0x0000000000001450L});
	public static final BitSet FOLLOW_expression_in_assignmentStmt86 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assignmentStmt88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_term103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_term108 = new BitSet(new long[]{0x0000000000001450L});
	public static final BitSet FOLLOW_expression_in_term111 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_term113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_term119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negation_in_unary132 = new BitSet(new long[]{0x0000000000001450L});
	public static final BitSet FOLLOW_term_in_unary137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_negation148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_logicalAnd163 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_logicalAnd167 = new BitSet(new long[]{0x0000000000001450L});
	public static final BitSet FOLLOW_unary_in_logicalAnd170 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_logicalAnd_in_expression184 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_expression188 = new BitSet(new long[]{0x0000000000001450L});
	public static final BitSet FOLLOW_logicalAnd_in_expression192 = new BitSet(new long[]{0x0000000000010002L});
}
