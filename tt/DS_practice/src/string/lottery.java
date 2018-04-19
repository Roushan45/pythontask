package string;
import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		int lottery = 719;

		// Prompt the user to enter a guess

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three digit number: ");

		int guess = input.nextInt();



		// Get digits from lottery

		int lotteryDigit1 = lottery / 100;

		int lotteryDigit2 = (lottery % 100) / 10;

		int lotteryDigit3 = lottery % 10;



		// Get digits from guess

		int guessDigit1 = guess / 100;

		int guessDigit2 = (guess % 100) / 10;

		int guessDigit3 = guess % 10;



		System.out.println("The lottery number is: " + lottery);



		// Sum up both sets of digits to compare for 3 inconsecutive matches

		int guessSum = guessDigit1 + guessDigit2 + guessDigit3;

		int lotterySum = lotteryDigit1 + lotteryDigit2 + lotteryDigit3;

		//written condition for fourt prize
		boolean a=( guessDigit1 == lotteryDigit2 ||guessDigit1==lotteryDigit1|| guessDigit1 == lotteryDigit3);
		boolean b=(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3 ||guessDigit2==lotteryDigit2);
		boolean c=(guessDigit3 == lotteryDigit2 || guessDigit1 == lotteryDigit1 | guessDigit3==lotteryDigit3);
//System.out.println(a+""+ b + c);
		// Check the guess

		if (guess == lottery)

			System.out.println("1st prize: three digits match in exact order.");

		//   improved the logical syntax

		else if((lotteryDigit1 == guessDigit1

				|| lotteryDigit1 == guessDigit2 

				|| lotteryDigit1 == guessDigit3)

				&& (lotteryDigit2 == guessDigit1

				|| lotteryDigit2 == guessDigit2 

				|| lotteryDigit2 == guessDigit3)

				&& (lotteryDigit3 == guessDigit1

				|| lotteryDigit3 == guessDigit2 

				|| lotteryDigit3 == guessDigit3)

				&& guessSum == lotterySum)      

			System.out.println("2nd prize: three digits match, but not in the exact order.");

		//improved here
		else if ((guessDigit1 == lotteryDigit1 && guessDigit2==lotteryDigit2)
				||guessDigit2==lotteryDigit2 && guessDigit3 == lotteryDigit3)


			System.out.println("3rd prize: two digits match, in its exact position.");


		//using above condition 
		else if (a && b|| a&&c||b&&c)
			System.out.println("4th prize: two digits match, but not in the exact position.");

		//for matching one digit
		else if ((guessDigit1 == lotteryDigit1 || guessDigit2==lotteryDigit2||guessDigit3==lotteryDigit3))
			System.out.println("5th prize: one digit matches in its exact position.");

		else if ((guessDigit1 == lotteryDigit1

				|| guessDigit1 == lotteryDigit2

				|| guessDigit1 == lotteryDigit3)

				|| (guessDigit2 == lotteryDigit1

				|| guessDigit2 == lotteryDigit2

				|| guessDigit2 == lotteryDigit3)

				|| (guessDigit3 == lotteryDigit1

				|| guessDigit3 == lotteryDigit2

				|| guessDigit3 == lotteryDigit3))

			System.out.println("6th prize: one digit matches, but not in the exact position.");



		else

			System.out.println("Sorry, you win nothing.");

	}

}