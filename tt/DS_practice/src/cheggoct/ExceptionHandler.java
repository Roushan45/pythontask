package cheggoct;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionHandler {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		//validating integer
		while(true){
			try{
				System.out.println("Input an Integer : ");
				input = sc.next();
				Integer.valueOf(input);//casting to integer 
										//if it fails will throw an exception
				System.out.println("Result  = "+input);
				break;
			}
			catch(Exception e)
			{
				System.out.println("The program doed not recognize the number as an integer, be sure you are not"
						+ "typing in a float or alpha, please try again.");
			}
		}
		while(true){//validating float
			try{
				System.out.println("Input a float : ");
				input = sc.next();
				Float.valueOf(input);
				System.out.println("Result  = "+input);
				break;
			}
			catch(Exception e)
			{
				System.out.println("The program doed not recognize the number as float, be sure you are not"
						+ "typing in an alpha chars, please try again.");
			}
		}
		while(true){
			try{
				System.out.println("Input a String : ");//validating string
				input = sc.next();
				if(!input.matches("[a-zA-Z]+"))//using the given regex
					throw new InputMismatchException("");
				break;
			}
			catch(Exception e)
			{
				System.out.println("Invalid input, be sure you didnot accidently enter a numeric character"
						+ ", please try again.");
			}
		}
		
		while(true){
			try{
				System.out.print("Input the Integers : ");//validating integers
				input = sc.nextLine();
				String array[] = input.split(" ");
				if(array.length>3)//if more than 3 size then throwing exception
					throw new Exception();
				for(String s: array)
					Integer.valueOf(s);//cheking for invalid chars
				System.out.println(input);
				break;
			}
			catch(Exception e)
			{
				System.out.println("Invalid input, be sure you didnot enter more than three integers or a alpha character"
						+ ", please try again.");
			}
		}
		
		
		while(true){//validating file name
			try{
				System.out.println("Input the name of file : ");
				input = sc.next();
				Pattern regex = Pattern.compile("[^A-Za-z0-9]");
				Matcher matcher  = regex.matcher(input);
				if(matcher.find())//if any special char found throw an exception
					throw new Exception();
				break;
			}
			catch(Exception e)
			{
				System.out.println("Invalid input, it not contains special char"
						+ ", please try again.");
			}
		}
	}

}
