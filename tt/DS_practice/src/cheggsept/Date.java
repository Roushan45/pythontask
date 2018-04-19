package cheggsept;

import java.util.NoSuchElementException;
/**
 * this is the date class
 */
public class Date {
	//instancde fields
	private int month;
	private int day;
	private int year;
	//overloaded constructors
	public Date(int m,int d, int y)
	{
		this.month=m;
		this.day=d;
		this.year=y;
	}
	
	public Date(String m,int d, int y)
	{
		this.day = d;
		this.year = y;
		//using equal method checking the month name
		if(m.equalsIgnoreCase("january"))
			this.month = 1;
		else if(m.equalsIgnoreCase("February"))
			this.month = 2;
		else if(m.equalsIgnoreCase("March"))
			this.month = 3;
		else if(m.equalsIgnoreCase("April"))
			this.month = 4;
		else if(m.equalsIgnoreCase("May"))
			this.month = 5;
		else if(m.equalsIgnoreCase("June"))
			this.month = 6;
		else if(m.equalsIgnoreCase("July"))
			this.month = 7;
		else if(m.equalsIgnoreCase("August"))
			this.month = 8;
		else if(m.equalsIgnoreCase("September"))
			this.month = 9;
		else if(m.equalsIgnoreCase("October"))
			this.month = 10;
		else if(m.equalsIgnoreCase("November"))
			this.month = 11;
		else if(m.equalsIgnoreCase("December"))
			this.month = 12;
		else{
			this.month=1;
			this.day=1;
			this.year=2017;
			throw new NoSuchElementException("Month name not valid ");
		}
	}
	public Date(int d, int y)
	{
		this.day=d;
		this.year=y;
	}
	//to string
	public String toString()
	{
		return "Date : "+this.month+"/"+this.day+"/"+this.year;
	}
	//overloaded display methods
	public void displayDate ()
	{
		String date = "Date : "+this.month+"/"+this.day+"/"+this.year;
		System.out.println(date);
	}
	public void displayDate(int value)
	{
		String month="";
		if(this.month==1)
			month="January";
		else if(this.month==2)
			month = "February";
		else if(this.month==3)
			month = "March";
		else if(this.month==4)
			month = "April";
		else if(this.month==5)
			month = "May";
		else if(this.month==6)
			month = "June";
		else if(this.month==7)
			month = "July";
		else if(this.month==8)
			month = "July";
		else if(this.month==9)
			month = "August";
		else if(this.month==10)
			month = "September";
		else if(this.month==11)
			month = "October";
		else if(this.month==12)
			month = "December";
		String date = "Date : "+month+" "+this.day+", "+this.year;
		System.out.println(date);
		
	}
	
	public void displayDate(int value0,int value1)
	{
		String date = "Date : "+this.day+"  "+this.year;
		System.out.println(date);
	}
	//checking for leap year
	public static boolean isLeapYear(int year)
	{
		if(year%4 == 0)
	    {
	        if( year%100 == 0)
	        {
	            if ( year%400 == 0)
	            	return true;
	            else
	            	return false;
	        }
	        else
	        	return true;
	    }
	    else
	    	return false;
		
	}
}
