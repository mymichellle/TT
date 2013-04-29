package columbia.plt.tt.datatype;

public class Date implements Comparable<Date> {
  
  private int year;
  private int month;
  private int day;
  private int hour;
  private int minute;
  
  
  public Date()
  {
  	year = 0;
  	month = 0;
  	day = 0;
  	hour = 0;
  	minute = 0;
  }
  
  public Date(int year, int month, int day, int hour, int minute) {
  	this.year = year;
  	this.month = month;
  	this.day = day;
  	this.hour = hour;
  	this.minute = minute;
  }
  
  public Date(String date) {
  	this.year = 0;
  	this.month = 0;
  	this.day = 0;
  	this.hour = 0;
  	this.minute = 0;
  	
  	if (date.length() > 0) {
  		String[] dates = date.split("\\.");
  		for (int i = 0; i < dates.length; i++) {
  			
  			switch (i) {
  			case 0: this.year = Integer.parseInt(dates[0]); break;
  			case 1: this.month = Integer.parseInt(dates[1]); break;
  			case 2: this.day = Integer.parseInt(dates[2]); break;
  			case 3: this.hour = Integer.parseInt(dates[3]); break;
  			case 4: this.minute = Integer.parseInt(dates[4]); break;
  			}
  		}
  	}			
  }
  
  
  public int getYear() { return this.year; }
  public void setYear(int year) { this.year = year; }
  public int getMonth() { return this.month; }
  public void setMonth(int month) { this.month = month; }
  public int getDay() { return this.day; }
  public void setDay(int day) { this.day = day; }
  public int getHour() { return this.hour; }
  public void setHour(int hour) { this.hour = hour; }
  public int getMinute() { return this.minute; }
  public void setMinute(int minute) { this.minute = minute; }

  
  @Override
  public int compareTo(Date date2) {
  	if (year < date2.year)
  		return -1;
  	else if (year > date2.year)
  		return 1;
  	
  	if (month < date2.month)
  		return -1;
  	else if (month > date2.month)
  		return 1;
  	
  	if (day < date2.day)
  		return -1;
  	else if (day > date2.day)
  		return 1;
  	
  	if (hour < date2.hour)
  		return -1;
  	else if (hour > date2.hour)
  		return 1;
  	
  	if (minute < date2.minute)
  		return -1;
  	else if (minute > date2.minute)
  		return 1;
  	
  	return 0;
  }
  
  @Override
  public String toString() {
  	return year + "." + month + "." + day + "." + hour + "." + minute;
  }
  
  public void add(TimeFrame tf) {
	  // TODO - handle overflow ie 13 months = 1 year 1 month
	  this.year = this.year + tf.getYears();
	  this.month = this.month + tf.getMonths();
	  this.day = this.day + tf.getDays();
	  this.hour = this.hour + tf.getHours();
	  this.minute = this.minute + tf.getMinutes();
  }
}
