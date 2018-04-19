package cheggAugust;
import java.util.Scanner;
public class ParseInts
{
	public static void main(String[] args)
	{
		int val, sum=0;
		Scanner scan = new Scanner(System.in);
		String line;
		System.out.println("Enter a line of text");
		Scanner scanLine = new Scanner(scan.nextLine());
		/*
		 * in this modified version of program try 
		 * block have to place inside while loop
		 * and catch block inside the while loop
		 * in this way if exception occurs 
		 * while line will be processed even if exception 
		 * occurs.
		 * */
		
		while (scanLine.hasNext())
		{
			try{
				val = Integer.parseInt(scanLine.next());
				sum += val;
			}
			//catching number format exception
			catch(NumberFormatException e)
			{

			}
		}

		System.out.println("The sum of the integers on this line is " +
				sum);
	}
}