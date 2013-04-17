package columbia.plt.tt.evaluators;

public class LogicalAndEvaluator implements Evaluator {
	
	private final Evaluator op1;
	private final Evaluator op2;
	
	public LogicalAndEvaluator(Evaluator op1, Evaluator op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	@Override public boolean evaluate() {
		return op1.evaluate() && op2.evaluate();
	}
	public String toTreeString(String indent) {
		return '\n' + indent + "And" +
			op1.toTreeString(indent + "  ") +
			op2.toTreeString(indent + "  ");
	}
}
