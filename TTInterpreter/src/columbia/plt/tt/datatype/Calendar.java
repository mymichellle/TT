package columbia.plt.tt.datatype;

import java.util.ArrayList;
import java.util.Collections;

public class Calendar extends ArrayList<Task> {
  
  private String name;
  private Date start;
  private Date end;
  	
  
  public Calendar(String name) {
  	this.name = name;
  }
  
  public Calendar(String name, Date start, Date end) {
  	this.name = name;
  	this.start = start;
  	this.end = end;
  }
  
  
  public String getName() { return this.name;	}	
  public void setName(String name) { this.name = name; }	
  public Date getStart() { return this.start; }	
  public void setStart(Date start) { this.start = start; }	
  public Date getEnd() { return this.end;	}	
  public void setEnd(Date end) { this.end = end; }
  
  
  public void sort() {
  	Collections.sort(this);
  }
  
  public Task getTaskByName(String name) {
  	for (int i = 0; i < this.size(); i ++) {
  		if (this.get(i).getName() == name)
  			return this.get(i);
  	}
  	
  	return null;
  }
  
  public ArrayList<Task> getTasksWithinRange(Date start, Date end) {
  	ArrayList<Task> tasks = new ArrayList<Task>();
  	
  	for (int i = 0; i < this.size(); i ++) {
  		if (this.get(i).getStart().compareTo(start) >= 0 && this.get(i).getEnd().compareTo(end) <= 0)
  			tasks.add(this.get(i));
  	}
  	
  	Collections.sort(tasks);
  	return tasks;
  }
  
  public ArrayList<Task> getTasksWithinRange(String start, Date end) {
  	return getTasksWithinRange(new Date(start), end);
  }
  
  public ArrayList<Task> getTasksWithinRange(Date start, String end) {
  	return getTasksWithinRange(start, new Date(end));
  }
  
  public ArrayList<Task> getTasksWithinRange(String start, String end) {
  	return getTasksWithinRange(new Date(start), new Date(end));
  }
}
