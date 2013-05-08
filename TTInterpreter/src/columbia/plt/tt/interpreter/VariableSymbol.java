package columbia.plt.tt.interpreter;

import org.antlr.runtime.tree.CommonTree;

public class VariableSymbol extends Symbol {

	public boolean needsEvaluation = true;
	public CommonTree assignmentExpression = null;

	public VariableSymbol(String type, Object value) {
		super(type, value);
	}
}
