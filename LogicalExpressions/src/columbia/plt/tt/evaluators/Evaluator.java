package columbia.plt.tt.evaluators;

public interface Evaluator {
	boolean evaluate();
	String toTreeString(String indent);
}
