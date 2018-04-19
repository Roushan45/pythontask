package cheggmarch;

import java.util.Scanner;

public class RectanglePattern {

	public static void main(String[] args) {
		//scanner object , using for taking input
		Scanner scanner=new Scanner(System.in);
		//note here i am using the ouput statement 
		//for readbility you can omit it if not required
		System.out.print("Enter the no of rows :");
		//stores the now of rows
		int row=scanner.nextInt();
		System.out.print("Enter the no of column :");
		//stores the no of columns
		int column=scanner.nextInt();
		System.out.print("Enter the character to print : ");
		//stores the pattern to be printed
		String character=scanner.next();
		//required validation , if rows less than or equal to 0 or 
		//column greater than 50 then it will return
		if(row<=0||column>50){
			System.out.println("error in input");
			//closing the scanner object
			scanner.close();
			return;
		}
		//printing the rectangle using two for loops
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(character.charAt(0));
			}
			System.out.println();
		}
		//closing the scanner resources
		scanner.close();
	}

}
