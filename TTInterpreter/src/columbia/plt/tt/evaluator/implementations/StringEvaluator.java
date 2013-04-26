package columbia.plt.tt.evaluator.implementations;

import columbia.plt.tt.evaluator.interfaces.StringEvalInterface;

public class StringEvaluator implements StringEvalInterface {

	private String value;

	public StringEvaluator(String op) {

		value = op;
	}

	@Override
	public String evaluate() {
		return value;
	}

}
