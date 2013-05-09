package columbia.plt.tt.interpreter;

public class Symbol {

    private String type;	
    private Object value;
    private String name;

    public Symbol(String type, Object value) {
        this.type = type;
        this.value = value;
    }

	public Symbol(String type, Object value, String name) {
		this(type,value);
		this.name = name;
	}

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Object getValue() {
      return this.value;
    }

	public void setValue(Object value) {
		this.value = value;
		
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
