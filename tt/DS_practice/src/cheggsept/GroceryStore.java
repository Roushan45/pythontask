package cheggsept;

import java.util.Scanner;

public class GroceryStore {

	public static void main(String[] args) {
		//scanner object
		Scanner inputScanner = new Scanner(System.in);
		//name of variables that required
		String firstProductName,secondProductName;
		int firstProductQuantity,secondProductQuantity;
		double firstProductUnitPrice,secondProductUnitPrice;
		//asking from user to enter the data for products
		System.out.print("Enter the name of first product : ");
		//initially converting all digits to lower
		firstProductName = inputScanner.next().toLowerCase();
		//after converting first digit to upper and then combining rest string
		firstProductName = firstProductName.substring(0, 1).toUpperCase()+firstProductName.substring(1,firstProductName.length());
		System.out.print("Enter the Quantity of first product : ");
		firstProductQuantity = inputScanner.nextInt();
		System.out.print("Enter the unit price of first product : ");
		firstProductUnitPrice = inputScanner.nextDouble();
		//same as above for seconf string
		System.out.print("Enter the name of second product : ");
		secondProductName = inputScanner.next().toLowerCase();
		secondProductName = secondProductName.substring(0, 1).toUpperCase()+secondProductName.substring(1,secondProductName.length());
		System.out.print("Enter the Quantity of second product : ");
		secondProductQuantity = inputScanner.nextInt();
		System.out.print("Enter the unit price of second product : ");
		secondProductUnitPrice = inputScanner.nextDouble();
		//using printf printing in tabular form
		System.out.printf("\n%1$-10s","Product Name");
		System.out.printf("%1$15s","Quantity");
		System.out.printf("%1$15s","Unit Price");
		System.out.printf("%1$15s","Total Price\n");
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%1$-10s",firstProductName);
		System.out.printf("%1$15s",firstProductQuantity);
		System.out.printf("%1$16s",firstProductUnitPrice);
		double totalPrice = Math.round((double)firstProductUnitPrice*firstProductQuantity);
		System.out.printf("%1$15s \n",totalPrice);
		System.out.printf("%1$-10s",secondProductName);
		System.out.printf("%1$15s",secondProductQuantity);
		System.out.printf("%1$16s",secondProductUnitPrice);
		totalPrice = Math.round((double)secondProductUnitPrice*secondProductQuantity);
		System.out.printf("%1$15s \n",totalPrice);	
		System.out.println("-------------------------------------------------------------");
		}

}
