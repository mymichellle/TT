package columbia.plt.tt.datatype;

public class Task implements Comparable<Task> {
  
  private String name;
  private Date start;
  private Date end;
  private String location;
  private int priority;
  private String description;
  
  
  public Task() {
  	this.name = "";
  	this.start = null;
  	this.end = null;
  	this.location = "";
  	this.priority = -1;
  	this.description = "";				
  }
  
  public Task(String name, Date start, Date end, String location, int priority, String description) {
  	this.name = name;
  	this.start = start;
  	this.end = end;
  	this.location = location;
  	this.priority = priority;
  	this.description = description;
  }
  
  
  public String getName() { return this.name;	}	
  public void setName(String name) { this.name = name; }
  public Date getStart() { return this.start; }
  public void setStart(Date start) { this.start = start; }
  public Date getEnd() { return this.end; }
  public void setEnd(Date end) { this.end = end; }
  public String getLocation() { return this.location; }
  public void setLocation(String location) { this.location = location; }
  public int getPriority() { return this.priority; }
  public void setPriority(int priority) { this.priority = priority; }
  public String getDescription() { return this.description; }
  public void setDescription(String description) { this.description = description; }

  
  @Override
  public int compareTo(Task task2) {
  	return this.start.compareTo(task2.getStart());
  }	
  
  @Override
  public String toString() {
  	return "Name: " + name + ", Start: " + start.toString() + ", End: " + end.toString() + ", Location: " + location + ", Priority: " + Integer.toString(priority) + ", Description: " + description;
  }
}
