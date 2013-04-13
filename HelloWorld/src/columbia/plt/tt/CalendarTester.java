package columbia.plt.tt;

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
  	c.Sort();
  	
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
  }
}
