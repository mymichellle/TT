package columbia.plt.tt.interpreter;

import java.util.Stack;

public class SymbolTable extends Stack<Scope> {

  private int nextScopeID;

    public SymbolTable() {
      this.push(new Scope(0));  // add a global scope
      nextScopeID = 1;
    }

    public Scope getCurrentScope()
    {
       if (this.size() > 0) 
             return this.peek();
         else
           return null;            	 
    }

    public Scope getScope(int scopeID) {
        for (Scope scope : this) {
            if (scope.getID() == scopeID)
              return scope;
        }
        
        return null;
    }

    public int addScope() {
      this.push(new Scope(nextScopeID));
      nextScopeID++;
      return nextScopeID - 1;
    }   

    public void removeScope() {
        this.pop();
        nextScopeID--;
    }

    public void addSymbol(String name, String type, Object value) {
            getCurrentScope().put(name, new Symbol(type, value));    	
    }
        
    public Symbol getSymbol(String name) {
      return getCurrentScope().get(name);
    }
                
    public String getType(String name) {
      return getCurrentScope().get(name).getType();
    }
                        
    public Object getValue(String name) {
      return getCurrentScope().get(name).getValue();
    }
                                
    public void setValue(String name, Object value) {
      getCurrentScope().get(name).setValue(value);
    }
}
