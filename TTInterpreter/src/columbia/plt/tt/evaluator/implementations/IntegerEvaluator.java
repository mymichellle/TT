package columbia.plt.tt.evaluator.implementations;

import columbia.plt.tt.evaluator.interfaces.IntegerEvalInterface;

public class IntegerEvaluator implements IntegerEvalInterface {

	private Integer value;

	public IntegerEvaluator(Integer op) {
		value = op;
	}

	@Override
	public int evaluate() {
		return value;
	}

}
