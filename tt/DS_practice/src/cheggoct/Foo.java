package cheggoct;

import java.util.Scanner;

public class Foo {

	public static void main(String[] args) {
		int x;
		Scanner i = new Scanner(System.in);
		System.out.print("Enter a number from 20 - 25 : ");
		x=i.nextInt();//added line for taken input
		//instead of <= only < required
		//as range is from 20 
		//if range will in between then was ok
		while(x<20 || x> 25)//&& removed 
							//|| XOR required for comparison
							//because either x is less than 20 or x
						    //greater than 25 then it will be false
		{
			System.out.println("Out of range.");
			System.out.print("Enter again: ");
			x=i.nextInt();
			
		}
		System.out.println("Thanks");
	}
}
