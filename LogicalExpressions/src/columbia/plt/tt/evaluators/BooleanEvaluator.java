package columbia.plt.tt.evaluators;

public class BooleanEvaluator implements Evaluator {
	private final boolean value;

	@Override
	public boolean evaluate() {
		return value;
	}

	public BooleanEvaluator(boolean value) {
		this.value = value;
	}

	public String toTreeString(String indent) {
		return '\n' + indent + "Int: " + value;
	}
}
