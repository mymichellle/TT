package columbia.plt.tt.interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
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
    
}
