package columbia.plt.tt.datatype;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
  
  public Date(Date d) {
  	this.year = d.year;
  	this.month = d.month;
  	this.day = d.day;
  	this.hour = d.hour;
  	this.minute = d.minute;
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
	  String monthString = ""+month;
	  if(month < 10)
		  monthString = "0"+month;
	  String dayString = ""+day;
	  if(day < 10)
		  dayString = "0"+day;
	  String hourString = ""+hour;
	  if(hour < 10)
		  hourString = "0"+hour;
	  String minuteString = ""+minute;
	  if(minute < 10)
		  minuteString = "0"+minute;
  	return year + "." + monthString + "." + dayString + "." + hourString + "." + minuteString;
  }
  
  private int getDaysInMonth()
  {
	  // GregorianCalendar indexes months starting at 0 for Jan
	  java.util.Calendar javaCalendar = new java.util.GregorianCalendar(year, month-1, day);
	  return javaCalendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
  }
  
  public void add(TimeFrame tf) {
	  // TODO - handle overflow ie 13 months = 1 year 1 month
	  int overflow = 0;
	  this.minute = this.minute + tf.getMinutes();
	  if (this.minute > 59) {
		  overflow = this.minute/60;
		  this.minute = this.minute - (60*overflow);
	  }
	  else {
		  overflow = 0;
	  }
	  
	  this.hour = this.hour + tf.getHours() + overflow;
	  if (this.hour > 23) {
		  overflow = this.hour/24;
		  this.hour = this.hour - (24*overflow);
	  }
	  else {
		  overflow = 0;
	  }
	  
	  // TODO - check the month and find out how many days there should be in a month
	  this.day = this.day + tf.getDays() + overflow;
	  int monthDays = this.getDaysInMonth();
	  if (this.day > monthDays) {
		  overflow = this.day/monthDays;
		  this.day = this.day - (monthDays*overflow);
	  }
	  else {
		  overflow = 0;
	  }

	  this.month = this.month + tf.getMonths() + overflow;
	  if (this.month > 12) {
		  overflow = this.month/12;
		  this.month = this.month - overflow;
	  }
	  else {
		  overflow = 0;
	  }
	  
	  this.year = this.year + tf.getYears() + overflow;
  }
  
  public void substract(TimeFrame tf) {  
  	int overflow = 0;
  	this.minute = this.minute - tf.getMinutes();
  	if (this.minute < 0) {
  		this.minute = Math.abs(this.minute);
  		overflow = this.minute/60;
  		this.minute = this.minute - (60*overflow);
  	}
  	else {
  		overflow = 0;
  	}
  	
  	this.hour = this.hour - tf.getHours() - overflow;
  	if (this.hour < 0) {
  		this.hour = Math.abs(this.hour);
  		overflow = this.hour/24;
  		this.hour = this.hour - (24*overflow);
  	}
  	else {
  		overflow = 0;
  	}
  		  	  	  	  	  	  	  	  	  
  	this.day = this.day - tf.getDays() - overflow;
  	int monthDays = this.getDaysInMonth();
  	if (this.day < 0) {
  		this.day = Math.abs(this.day);
  		overflow = this.day/monthDays;
  		this.day = this.day - (monthDays*overflow);
  	}
  	else {
  		overflow = 0;
  	}
  		  	  	  	  	  	  	  	  	  	  	  	  	  
  	this.month = this.month - tf.getMonths() - overflow;
  	if (this.month > 12) {
  		this.month = Math.abs(this.month);
  		overflow = this.month/12;
  		this.month = this.month - overflow;
  	}
  	else {
  		overflow = 0;
  	}
  		  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  	  
  	this.year = this.year - tf.getYears() - overflow;
  }
  
  public Boolean is(columbia.plt.tt.interpreter.Interpreter.TimeFrameConst t)
  {
	  // Use Java's SimplDateFormat and Date class to find the day of the week
	  SimpleDateFormat ttFormat = new SimpleDateFormat("yyyy.MM.dd.hh.mm");
	  SimpleDateFormat dayInWeek = new SimpleDateFormat("EEEE");
	  String dayName = "";
	  
	  try 
	  {
		  java.util.Date javaDate = ttFormat.parse(this.toString());
		  dayName = dayInWeek.format(javaDate); 
	  } 
	  catch (ParseException e) 
	  {
		  e.printStackTrace();
	  }
	  
	  switch(t){
	  case MONDAY:
		  if(dayName.equals("Monday"))
			  return true;
		  break;
	  case TUESDAY:
		  if(dayName.equals("Tuesday"))
			  return true;
		  break;
	  case WEDNESDAY:
		  if(dayName.equals("Wednesday"))
			  return true;
		  break;
	  case THURSDAY:
		  if(dayName.equals("Thursday"))
			  return true;
		  break;
	  case FRIDAY:
		  if(dayName.equals("Friday"))
			  return true;
		  break;
	  case SATURDAY:
		  if(dayName.equals("Saturday"))
			  return true;
		  break;
	  case SUNDAY:
		  if(dayName.equals("Sunday"))
			  return true;
		  break;
	  case JANUARY:
		  if(this.month == 1)
			  return true;
		  break;
	  case FEBRUARY:
		  if(this.month == 2)
			  return true;
		  break;
	  case MARCH:
		  if(this.month == 3)
			  return true;
		  break;
	  case APRIL:
		  if(this.month == 4)
			  return true;
		  break;
	  case MAY:
		  if(this.month == 5)
			  return true;
		  break;
	  case JUNE:
		  if(this.month == 6)
			  return true;
		  break;
	  case JULY:
		  if(this.month == 7)
			  return true;
		  break;
	  case AUGUST:
		  if(this.month == 8)
			  return true;
		  break;
	  case SEPTEMBER:
		  if(this.month == 9)
			  return true;
		  break;
	  case OCTOBER:
		  if(this.month == 10)
			  return true;
		  break;
	  case NOVEMBER:
		  if(this.month == 11)
			  return true;
		  break;
	  case DECEMBER:
		  if(this.month == 12)
			  return true;
		  break;
	  case WEEKEND:
		  if(dayName.equals("Sunday") || dayName.equals("Saturday"))
			  return true;
		  break;
	  case WEEKDAY:
		  if(!(dayName.equals("Sunday") || dayName.equals("Saturday")))
			  return true;
		  break;
		  
	  default:
		  return false;
	  }
	  
	  return false;
  }
}
