package columbia.plt.tt.programs;

import columbia.plt.tt.datatype.Calendar;
import columbia.plt.tt.datatype.Date;
import columbia.plt.tt.datatype.Task;
import columbia.plt.tt.datatype.TimeFrame;
import columbia.plt.tt.interpreter.Scope;
import columbia.plt.tt.interpreter.Symbol;
import columbia.plt.tt.interpreter.SymbolTable;


public class CalendarTester {
	
	public static void main(String[] args) {
		// Instantiate Calendar class
	 	Calendar c = new Calendar("myCalendar");
	  	  	  	  	
	  // Add tasks
	  c.add(new Task("task1", new Date("2013.4.12.3.24"), new Date("2013.4.13.5.24"), "", 1, ""));
	  c.add(new Task("task2", new Date("2013.3.4.2.20"), new Date("2013.3.13.5.24"), "", 1, ""));
	  System.out.println("# Of Tasks: " + c.size());
	  	  	  	  	  	  	  	  	  	
	  // Print out Tasks
	  for (int i = 0; i < c.size(); i++) {
	    System.out.println(c.get(i).toString());
	  }
	  	  	  	  	  	  	  	  	  	  	  	  	
	  // Sort by Task's start
	  c.sort();
	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	
	  // Print out Tasks after sort
	  for (int i = 0; i < c.size(); i++) {
	    System.out.println(c.get(i).toString());
	  }
	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	
	  // getTaskByName
	  System.out.println(c.getTaskByName("task1").toString());
	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	
	  // getTasksWithinRange
	  for (int i = 0; i < c.getTasksWithinRange("2013.4.1.0.0", "2013.5.31.0.0").size(); i++) {
	  	System.out.println(c.get(i).toString());
	  }
	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	
	  // Instantiate TimeFrame
	  TimeFrame tf = new TimeFrame("2013.4.1", "2013.5.31");
	  System.out.println(tf.toString());
	  TimeFrame tf2 = new TimeFrame("3 days + 4 years + 2 months + 3 days");
	  System.out.println(tf2.toString());
	  
	  SymbolTable st = new SymbolTable();
	  int scopeID = st.addScope();
	  System.out.println(scopeID);
	  Scope s = st.getScope(scopeID);
	  
    if (s == null)
	    System.out.print("test");
	  
	  st.getScope(scopeID).addSymbol("x", "Number", new Calendar("myCalendar"));
	  Symbol sb = st.getScope(scopeID).get("x");
	  System.out.print(sb.getType());	  
	}
}
