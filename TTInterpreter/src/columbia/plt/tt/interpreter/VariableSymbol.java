package columbia.plt.tt.interpreter;

import org.antlr.runtime.tree.CommonTree;

public class VariableSymbol extends Symbol {

	public CommonTree assignmentExpression = null;
	public CommonTree declaration = null;

	public VariableSymbol(String type, Object value) {
		super(type, value);
	}

	public VariableSymbol(String type, Object value, String name) {
		super(type, value, name);
	}
}
