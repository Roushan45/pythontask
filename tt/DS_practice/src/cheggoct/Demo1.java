package cheggoct;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//asking user for input string
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String input = sc.next();
		//calling the method and printing the result
		System.out.println(expand(input));
		sc.close();
	}

	public static String expand(String s)
	{
		//taken a empty string for appending result
		String result="";
		//converted to char array
		char array [] = s.toCharArray();
		//looping through array
		for(int i=0;i<array.length;i++)
		{//getting the current char value
			char c = array[i];
			//no of count
			int count=0;
			for(int j=i;j<array.length;j++)
			{
				//if same char increasing the count
				if(c==array[j])
					count++;
				else
					break;
			}
			//appending the value to result
			//first converting char to string by
			//String.valueOf
			result+=String.valueOf(c)+count;
			i+=count-1;
		}
		//returning the value
		return result;
	}
}
