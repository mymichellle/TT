package columbia.plt.tt.evaluators;

public class NegationEvaluator implements Evaluator {
	private final Evaluator op1;

	public NegationEvaluator(Evaluator op1) {
		this.op1 = op1;
	}

	@Override
	public boolean evaluate() {
		return !(op1.evaluate());
	}

	public String toTreeString(String indent) {
		return '\n' + indent + "Negation" + op1.toTreeString(indent + "  ");
	}
}
