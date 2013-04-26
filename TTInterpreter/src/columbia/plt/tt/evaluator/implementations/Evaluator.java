package columbia.plt.tt.evaluator.implementations;

public interface Evaluator {
	
	private Object value;
	private String type;
	
	public Object getValue(){
		return this.value;
		
	}
	public String getType(){
		return this.type; 
	}
	
}
