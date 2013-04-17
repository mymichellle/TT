package columbia.plt.tt.evaluators;

public class LogicalOrEvaluator implements Evaluator {
	private final Evaluator op1;
	private final Evaluator op2;
	public LogicalOrEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	@Override public boolean evaluate() {
		return op1.evaluate() || op2.evaluate();
	}
	public String toTreeString(String indent) {
		return '\n' + indent + "OR" +
			op1.toTreeString(indent + "  ") +
			op2.toTreeString(indent + "  ");
	}
}
