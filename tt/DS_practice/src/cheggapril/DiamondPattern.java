package cheggapril;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taking user input will store in this
		int noOfRows;
		//this will track to rows and columns
		int k, l;
		//blank will used to blank spaces in pattern 
		//that is beore start and after star
		int blank = 1;
		System.out.print("Please enter the number of rows in Diamond pattern : ");
		//scanning the user input
		Scanner scan = new Scanner(System.in);
		noOfRows = scan.nextInt();
		//no of blank spaces
		blank = noOfRows - 1;
		//running the for loop
		for (l = 1; l <= noOfRows; l++) 
		{
			//printing the blank spaces
			for (k = 1; k <= blank; k++) 
			{
				System.out.print(" ");
			}
			//decreasing the no of blank spaces 
			blank=blank-1;
			//printing the star after blank spaces
			for (k = 1; k <= 2 * l - 1; k++) 
			{
				System.out.print("*");                
			}
			//printing new line
			System.out.println();
		}//here up face will got printed now below code will print down face
		//resetting the value of blank spaces
		blank = 1;
		for (l = 1; l <= noOfRows - 1; l++) 
		{
			//printing balnk spaces
			for (k = 1; k <= blank; k++) 
			{
				System.out.print(" ");
			}
			//in down faces increasing the no of blank spaces
			blank=blank+1;
			for (k = 1; k <= 2 * (noOfRows - l) - 1; k++) 
			{
				//printing the star
				System.out.print("*");
			}
			//printing the new line
			System.out.println();
		}//down faces print done
		//closing the scanner resources
		scan.close();
	}

}
