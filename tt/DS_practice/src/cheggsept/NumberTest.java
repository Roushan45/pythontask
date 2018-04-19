package cheggsept;

import java.util.Scanner;

public class NumberTest {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		//asking the user input
		System.out.print("Enter an integer :");
		number = sc.nextInt();
		//first condition positive and divisible by 2
		boolean test1 = number > 0 && number % 2==0;
		//second condition  negative and divisible by 2 
		boolean test2 = number < 0 && number % 2==0;
		//third condition positive or divisible by 2 but not both 
		boolean test3 = (number > 0 || number % 2 == 0)&&!(number>0 && number % 2 == 0);
		//fourth condition less than or equal to 30 or divisible by 3 
		boolean test4 = number <= 30 || number % 3 ==0;
		//printing the result
		System.out.println("Is "+number+" positive and divisible by 2 ? "+test1);
		System.out.println("Is "+number+" negative and divisible by 2 ? "+test2);
		System.out.println("Is "+number+" positive or divisible by 2 but not both ? "+test3);
		System.out.println("Is "+number+" less than or equal to 30 or divisible by 3 ? "+test4);
		
		sc.close();
	}
}
