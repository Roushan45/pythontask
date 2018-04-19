package cheggjune;

import java.util.Scanner;
/***
 * Hot Dog Main class for testing all the functionality
 *hot dog stand class
 * @author 
 */
public class HotDogStandMainClass {

	/***
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no=0;
		//created object of HotDogStandClass
		HotDogStandClass dog = new HotDogStandClass();
		//asking from buyer no of hotdogs
		System.out.print("Enter the no of dogs you want to buy : ");
		no=sc.nextInt();
		dog.buy(no);
		System.out.print("Enter the no of dogs you want to buy : ");
		no=sc.nextInt();
		dog.buy(no);
		//printing the current value of class object
		System.out.println(dog.toString());
		sc.close();
	}

}
