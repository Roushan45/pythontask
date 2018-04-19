package cheggoct;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Age calculator class
 * @author your name
 *
 */
public class AgeCalculator {

	//private instance for holding date
	private String date;
	//initializing the constructor
	public AgeCalculator(String date)
	{
		this.date=date;
	}
	//parsing user input string 
	//to getting the user dob
	public String getUserDOB()
	{
		String arr[]= date.split("-");//splitting the string by -
		//getting the name of month
		String monthString = new DateFormatSymbols().getMonths()[Integer.valueOf(arr[1])-1];
		//making dob
		String dob = monthString.substring(0, 3)+" "+arr[2]+", "+arr[0];
		return dob;
	}
	/*
	 * for current date
	 */
	public String getCurrentDate()
	{
		//generating the date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String arr[] = sdf.format(new Date()).split("-");
		String monthString = new DateFormatSymbols().getMonths()[Integer.valueOf(arr[1])-1];
		//making the cur date
		String cur_date = monthString.substring(0, 3)+" "+arr[2]+", "+arr[0];
		return cur_date;
	}
	public int getAge()
	{
		//returning the age by subtracting dob from cur date
		return Integer.valueOf(getCurrentDate().split(",")[1].trim())-Integer.valueOf(this.date.split("-")[0]);
	}
}
