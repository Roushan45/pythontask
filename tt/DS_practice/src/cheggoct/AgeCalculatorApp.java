package cheggoct;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgeCalculatorApp {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to the Age Calculator\n");

		// Get input from the the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your date of birth (YYYY-MM-DD): ");
		String dateOfBirthString = sc.nextLine();
		//using the regular expression 
		//checking the user input format
		Pattern pattern = Pattern.compile("(\\d{4}\\-\\d{2}\\-\\d{2}$)");
		Matcher match = pattern.matcher(dateOfBirthString);
		if(!match.find())//if format not found
		{
			sc.close();
			//causing an exception
			throw new Exception("Date Not in Correct format!");
		}
		AgeCalculator ac = new AgeCalculator(dateOfBirthString);
		System.out.println();

		// Get and print user's date of birth
		System.out.println("Your date of birth is "+ac.getUserDOB());

		// Get and print the current date
		System.out.println("The current date is "+ac.getCurrentDate());

		//Calculate the user's age

		//Print the user's age
		System.out.println("Your age is "+ac.getAge());
		sc.close();
	}
}
