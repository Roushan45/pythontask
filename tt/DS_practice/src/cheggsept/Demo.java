package cheggsept;

import java.util.Scanner;

public class Demo {
	/**
	 * this method will predict hours for study
	 * for getting 90 or A
	 * @param points
	 */
	public static void prediction(int points)
	{
		//taken a target point that will add the points 
		//after each iteration
		int targetPoint=0;
		for(int i=0;;i++)
		{
			//if target point achieve printing the message and  breaking the loop
			if(targetPoint>=90){
				System.out.println("If a student studies "+i+" hours they will earn "
						+targetPoint+" points.");
				System.out.println("A Student would have to spend "+i+" hours studying for this exam"
						+ "to earn more than 90 points and get A");break;
			}
			System.out.println("If a student studies "+i+" hours they will earn "
					+targetPoint+" points.");
			targetPoint+=points;
			
			
		}
	}

	public static void main(String[] args) {
		//scanner object for reading input
		Scanner sc = new Scanner(System.in);
		//asking points from professor
		System.out.print("How many points is an hour worth of studying? >> ");
		int input = sc.nextInt();
		//calling the prediction method
		prediction(input);
		sc.close();
	}

}
