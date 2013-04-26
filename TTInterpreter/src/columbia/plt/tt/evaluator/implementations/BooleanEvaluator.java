package columbia.plt.tt.evaluator.implementations;

import columbia.plt.tt.evaluator.interfaces.BooleanEvalInterface;

public class BooleanEvaluator implements BooleanEvalInterface {

	private boolean value;

	public BooleanEvaluator(boolean op) {
		value = op;

	}

	@Override
	public boolean evaluate() {
		return value;
	}

}
