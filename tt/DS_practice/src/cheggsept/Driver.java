package cheggsept;

import java.util.Scanner;
/**
 * This is the Driver class for testing implementaion
 * of temperature and wind chill class
 * @author yourname
 *
 */
public class Driver {
/**
 * main function
 * @param args
 */
	public static void main(String[] args) {
		// created object of temp and wind chill
		Temperature temp =new Temperature();
		Windchill wc = new Windchill();
		Scanner sc = new Scanner(System.in);
		double userInpTemp;
		//in nested looping asking the user input
		//with required validation
		while(true)
		{
			//initially asking the user to enter temp in celcius or fahreneit
			System.out.print("Enter the temperature select any \n1.C for Celcius\n2.F for Fahrenheit");
			String in = sc.nextLine();
			if(in.toLowerCase().equals("1")||in.toLowerCase().equals("2"))
			{
				System.out.print("Enter the temperature value : ");
				userInpTemp = sc.nextDouble();
				if(Integer.valueOf(in)==1)
					temp.setCelcius(userInpTemp);
				else
					temp.setFahrenheit(userInpTemp);
				break;
			}
			System.out.println("Please enter valid input !");

		}
		//printing the values 
		System.out.println("\nTemperature \n"+temp);
		System.out.println("wind chill index "+wc.getWindChillIndex());
		//asking user for changing the temp or wind speed 
		//until he quits
		while(true){
			System.out.print("\nDo you want to change Temperature and speed of wind or enter q/Q to quit : ");
			String choice = sc.next();
			if(choice.equals("q")|| choice.equals("Q"))
				break;
			else
			{
				while(true){
				System.out.println("Enter T/t for chenge in temperature ");
				System.out.println("Enter S/s for chenge in speed of wind ");
				String choice1 = sc.next();
				if(choice1.toLowerCase().equals("t"))
				{
					boolean valid=false;
					while(true)
					{
						System.out.println("Enter C for celcius \nEnter F for Fahrenheit ");
						String choice2 = sc.next();
						if(choice2.toLowerCase().equals("c"))
						{
							System.out.print("Enter the temperature in celcius : ");
							double choice3 = sc.nextDouble();
							temp.setCelcius(choice3);
							wc.setTemperature(choice3);
							valid=true;
							break;
						}
						else if(choice2.toLowerCase().equals("f"))
						{
							System.out.print("Enter the temperature in Fahrenheit : ");
							double choice3 = sc.nextDouble();
							wc.setTemperature(choice3);
							temp.setFahrenheit(choice3);
							valid=true;
							break;
						}
						else
							System.out.println("Please enter valid entry!");
					}
					if(valid)break;
				}
				else if(choice1.toLowerCase().equals("s"))
				{
					System.out.print("Enter the wind speed : ");
					double windSpeed = sc.nextDouble();
					wc.setWindSpeed(windSpeed);
					break;
				}
				else
					System.out.println("Please enter valid input!");
			}
			}
			System.out.println(temp);
			System.out.println(wc);
		}

	}

}
