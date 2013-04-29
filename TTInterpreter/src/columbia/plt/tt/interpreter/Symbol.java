package columbia.plt.tt.interpreter;

public class Symbol {

    private String type;	
    private Object value;

    public Symbol(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public Object getValue() {
      return this.value;
    }

	public void setValue(Object value) {
		this.value = value;
		
	}
    
}
