	package cheggsept;
	
	import java.util.Random;
	import java.util.Scanner;
	/**
	 * this class will generate random numbers in given range
	 * @author Admin
	 *
	 */
	public class RandomGenerator {
	
		public static void main(String[] args) {
			//scanner object for scanning user input
			Scanner sc = new Scanner(System.in);
			//Random class object
			Random rand = new Random();
			//please note that i was not able to set seed value using Config.SEED as 
			//unable to locate this class and variable
			//if u can find that in your system then can do
			//rand.setSeed(Config.SEED);
			//however i am setting other seed value
			rand.setSeed(20L);
			System.out.print("Enter minimum integer : ");
			//constant variables for MINIMUM
		    final int MINIMUM = sc.nextInt();
			System.out.print("Enter maximum  integer : ");
			//constant variables for MAXMUM
			final int MAXIMUM = sc.nextInt();
			//generating three random variable in given range
			System.out.println("Three integers are : ");
			for(int i = 0;i<3;i++)
			{
				System.out.println(rand.nextInt(MAXIMUM - MINIMUM + 1) + MINIMUM);
			}
			sc.close();
		}
	}
