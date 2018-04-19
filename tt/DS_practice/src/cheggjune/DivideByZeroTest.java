package cheggjune;

import java.util.Scanner;

class DivideByZeroTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;
		System.out.print("Please enter a number: ");
		num1 = sc.nextInt();
		System.out.print("Please enter a second number: ");
		num2 = sc.nextInt();
		//This block will test the division of num1 and num2. If everything is
		//ok, the result will print.
		try {
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
		}
		//If the try block fails, this catch block will catch the error and //report the problem to the user and end the program.
		catch (ArithmeticException mistake)
		{
			//Programmers can insert their own exception messages to be printed
			//to the user here.
			System.out.println("Exception: Cannot Divide by zero.");
			System.out.println("Program will now terminate.");
			//Alternately, you can choose to print the variable declared in the
			//catch black statement. In this case, the program will print the
			//default exception as it would appear within the IDE.
			System.out.println("\n\n" + mistake); 
		} 
	} 
}