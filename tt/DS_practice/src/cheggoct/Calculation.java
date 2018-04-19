package cheggoct;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//asking user for expression to cimpute
		System.out.print("Enetr the expression : ");
		//scaning the user input
		String expression = sc.next().toLowerCase();
		//if expression for exp
		if(expression.contains("exp"))
		{
			//getting the double value using
			//string substring and parsing to double
			double value = Double.valueOf(expression.substring(4,expression.length()-1));
			//using printf statement printing the value upto 4 decimal places
			System.out.printf("Computed result : %.4f\n",Math.exp(value));
		}
		else if(expression.contains("log10"))
		{
			//getting the double value using
			//string substring and parsing to double
			double value = Double.valueOf(expression.substring(6,expression.length()-1));
			//using printf statement printing the value upto 4 decimal places
			System.out.printf("Computed result : %.4f\n",Math.log10(value));
		}
		else if(expression.contains("log"))
		{
			//getting the double value using
			//string substring and parsing to double
			double value = Double.valueOf(expression.substring(4,expression.length()-1));
			//using printf statement printing the value upto 4 decimal places
			System.out.printf("Computed result : %.4f\n",Math.log(value));
		}
		else if(expression.contains("pow"))
		{
			//in case of pow there are two values to extract 
			//so first getting the substring value like 10,3
			//then splitting using , to get separate values
			String temp[] = expression.substring(4,expression.length()-1).split(",");
			double value1=Double.valueOf(temp[0]);
			double value2=Double.valueOf(temp[1]);
			//printing upto 4 decimal places
			System.out.printf("Computed result : %.4f\n",Math.pow(value1,value2));
		}
		else if(expression.contains("sqrt"))
		{
			//getting the double value using
			//string substring and parsing to double
			double value = Double.valueOf(expression.substring(5,expression.length()-1));
			//using printf statement printing the value upto 4 decimal places
			System.out.printf("Computed result : %.4f\n",Math.sqrt(value));
		}
		//in case of invalid input
		else{
			System.out.println("Wrong input!");
		}
	}
	
}
