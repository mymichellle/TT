package columbia.plt.tt.interpreter;

import java.util.HashMap;
import java.lang.String; 

public class Scope extends HashMap<String, Symbol> {
  
    private final int id;
    private final boolean isChild;
    
    public Scope(final int id) {
        this.id = id;
        this.isChild = false;
    }
    
    public Scope(final int id, boolean isChild)
    {
        this.id = id;
        this.isChild = isChild;
    }
            
    public int getID() {
      return this.id;
    }
    
    public boolean getIsChild() {
      return this.isChild;
    }
        
    public void addSymbol(String name, String type, Object value) {
      this.put(name, new Symbol(type, value));
    }
    
    public Object getValue(String name)
    {
    	return this.get(name).getValue();
    }
    
    public Object getType(String name)
    {
    	return this.get(name).getType();
    }
    
}
