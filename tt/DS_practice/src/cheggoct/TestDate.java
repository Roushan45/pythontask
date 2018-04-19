package cheggoct;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestDate {

	
	public static void main(String[] args) {
		
//		//String monthString = new DateFormatSymbols().getMonths()[12-1];
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String cur = sdf.format(new Date());
//		System.out.println(cur);
//		
//		 System.out.println("Welcome to the Age Calculator\n");
//
//	        // Get input from the the user
//	        Scanner sc = new Scanner(System.in);
//	        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
	        String dateOfBirthString = "1968-10-80";
	        String regex = "^/(^([0-9]{4})[.]([0-9]{1})$)/";
	        
	        //System.out.println(match.find());
//	        String afrr[] = dateOfBirthString.split("-");
//	        String monthString = new DateFormatSymbols().getMonths()[Integer.valueOf(afrr[1])-1];
//	        System.out.println(monthString);
//	        System.out.println();
//	        System.out.println("Your current dob "+monthString.substring(0, 3)+" "+afrr[2]+", "+afrr[0]);
//	       
//	        // Get and print user's date of birth
//	        System.out.println("Your date of birth is ");
//
//	        // Get and print the current date
//	        System.out.println("The current date is ");
//
//	        //Calculate the user's age
//	               
//	        //Print the user's age
//	        System.out.println("Your age is ");
//	        sc.close();
	    }
	
}
