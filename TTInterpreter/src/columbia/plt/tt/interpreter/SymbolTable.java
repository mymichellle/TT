package columbia.plt.tt.interpreter;

import java.util.Stack;

public class SymbolTable extends Stack<Scope> {
	
	private static final long serialVersionUID = 1L;
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
	                  
	public Scope getParentScope(int scopeID) {
		Scope scope = getScope(scopeID);    
	  
	  if (scope != null && scopeID > 1 && scope.getIsChild()) {
	  	return getScope(scopeID -1);
	  }    	    	
	  else
	  	return null;    		
	}
	                          
	public int addScope() {
		this.push(new Scope(nextScopeID));
	  nextScopeID++;
	  return nextScopeID - 1;
	}
	                                  
	public int addScope(boolean isChild)
	{
		this.push(new Scope(nextScopeID, isChild));
	  nextScopeID++;
	  return nextScopeID - 1;
	}
	                                              
	public void removeScope() {
		this.pop();
	  nextScopeID--;
	}
	                                                      
	public void addSymbol(String name, String type, Object value) {
		getCurrentScope().put(name, new Symbol(type, value, name));
		//we should throw exception when adding duplicate symbols
	}
	
	public void addSymbol(String name, Symbol symbol) {
		getCurrentScope().put(name, symbol);
		//we should throw exception when adding duplicate symbols
	}
	                                                              
	public Symbol getSymbol(String name) {
		Scope scope = getCurrentScope();
	  
	  do {
	  	if (scope.containsKey(name))
	    	return scope.get(name);
	    else
	    	if (scope.getIsChild())
	      	scope = getParentScope(scope.getID());
	      else
	      	scope = null;
	  }
	  while (scope != null);
	  
	  if (getScope(0).get(name) != null)
	      	return getScope(0).get(name);
	 
	  return null;
	}
	                                                                      
	public String getType(String name) {
		Symbol symbol = getSymbol(name);
	  
	  if (symbol != null)
	  	return symbol.getType();
	  else
	  	return "";    		
	}
	                                                                              
	public Object getValue(String name) {
	  Symbol symbol = getSymbol(name);
	  
	  if (symbol != null)
	  	return symbol.getValue();
	  else
	  	return "";  
	}
	                                                                                      
	public void setValue(String name, Object value) {
		getCurrentScope().get(name).setValue(value);
	}   
}
