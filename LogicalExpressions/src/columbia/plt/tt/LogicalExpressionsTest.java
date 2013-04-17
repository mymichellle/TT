/*******************************************************************************
 * Copyright (c) 2009 Scott Stanchfield
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package columbia.plt.tt;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import columbia.plt.tt.EvaluatorWalker;
import columbia.plt.tt.LogicalExpressionsLexer;
import columbia.plt.tt.LogicalExpressionsParser;
import columbia.plt.tt.LogicalExpressionsParser.evaluator_return;



public class LogicalExpressionsTest {
	public static void main(String[] args) throws RecognitionException {
		
		CharStream stream = new ANTLRStringStream(
				"x = false; y = true ; true  && (x || y) &&  false");
		LogicalExpressionsLexer lexer = new LogicalExpressionsLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		LogicalExpressionsParser parser = new LogicalExpressionsParser(tokenStream);
		
		evaluator_return evaluator = parser.evaluator();
		System.out.println(evaluator.tree.toStringTree());
		
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(
				evaluator.tree);
		EvaluatorWalker walker = new EvaluatorWalker(nodeStream);
		boolean result = walker.evaluator();
		System.out.println("result = " + result);
	}
}
