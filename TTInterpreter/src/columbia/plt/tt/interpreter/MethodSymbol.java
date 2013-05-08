package columbia.plt.tt.interpreter;

import java.util.ArrayList;
import org.antlr.runtime.tree.CommonTree;

public class MethodSymbol extends Symbol {

	private ArrayList<Symbol> argumentsList = null;
	public CommonTree methodBody = null;

	public ArrayList<Symbol> getArgumentList() {
		return argumentsList;
	}

	public MethodSymbol(String type, Object value) {
		super(type, value);
	}
	
	public MethodSymbol(String type, Object value, String name) {
		super(type, value, name);
	}

	public void addParameter(String name, Symbol argSymbol) {
		if (argumentsList == null)
			argumentsList = new ArrayList<Symbol>();
		argumentsList.add(argSymbol);
	}
}
