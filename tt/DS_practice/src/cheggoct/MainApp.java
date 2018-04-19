package cheggoct;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//asking the detaild of burger and drink from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Hamburger  : ");
		String bur_size = sc.next();
		System.out.print("Enter the Topping : ");
		String topping = sc.next();
		System.out.print("Enter the Price : ");
		double bur_price  =sc.nextDouble();
		
		System.out.print("Enter type of Drink:  ");
		String drink_type = sc.next();
		System.out.print("Enter the drink size : ");
		String drink_size = sc.next();
		System.out.print("Enter the Price : ");
		double drink_price  =sc.nextDouble();
		//created object for drink with variables
		Drink drink = new Drink(drink_type,drink_size,drink_price);
		//finally created object of hamburger with drink details and burger detai;s
		Hamburger burger = new Hamburger(bur_size,bur_price,topping,drink);
		//printing the order info
		System.out.println("Order Info \n"+burger);
		sc.close();
		
	}

}
