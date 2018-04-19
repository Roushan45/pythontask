package cheggsept;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//displaying menu 
		System.out.println("Mr.K’s Indian Food Menu Item Price (in dollars)\n");
		System.out.println("1  Chicken Curry 10.69 ");
		System.out.println("2  Shrimp Curry 14.25 ");
		System.out.println("3  Naan 3.59 ");
		System.out.println("4  Chai 2.45 ");
		System.out.println("5  Sindhi Biryani 7.24 ");
		System.out.println("6  Lamb Biryani 15.59 ");
		System.out.println("7  Veg Biryani 11.27 ");
		System.out.println("8  Gobi Manchurian 10.35");
		System.out.println("9  Chana Masala 9.45 ");
		System.out.println("10  Kheer 4.99 ");
		//asking for how many dish
		System.out.print("How many different dishes would you like to order today? ");
		int typesOfDishes = sc.nextInt();
		int temp=1;
		double totalAMount=0;
		double tax = 0;
		double tip = 0;
		//using while loop asking for dish info
		//loop will terminated once reach the enter number of dishes
		while(temp<=typesOfDishes)
		{
			System.out.print("Enter dish "+temp+" [1-10] ");
			int dishNo = sc.nextInt();
			System.out.print("How many servings of dish ");
			int nuOfDish = sc.nextInt();
			System.out.print("would you like to order? ");
			int orderConf = sc.nextInt();
			//if user would like to order
			if(orderConf==1)
				//using switch statement calculating price
				switch(dishNo){
				case 1:totalAMount+=(10.69*(double)nuOfDish);break;
				case 2:totalAMount+=(14.25*(double)nuOfDish);break;
				case 3:totalAMount+=(3.59*(double)nuOfDish);break;
				case 4:totalAMount+=(2.45*(double)nuOfDish);break;
				case 5:totalAMount+=(7.24*(double)nuOfDish);break;
				case 6:totalAMount+=(15.59*(double)nuOfDish);break;
				case 7:totalAMount+=(11.27*(double)nuOfDish);break;
				case 8:totalAMount+=(10.35*(double)nuOfDish);break;
				case 9:totalAMount+=(9.45*(double)nuOfDish);break;
				case 10:totalAMount+=(4.99*(double)nuOfDish);break;
				default :System.out.println("Wrong choice");
				}
			temp++;
		}
		//asking for tax 
		System.out.print("Enter the tax %: ");
		tax = sc.nextDouble();
		//asking for tip
		System.out.print("Do you want to add tip? [’y’ - yes or ’n’ - no] ");
		String tipstatus = sc.next();
		//if want to give tip then asking tip percentage
		if(tipstatus.toLowerCase().equals("yes")||tipstatus.toLowerCase().equals("y"))
		{
			System.out.print("Enter tip % [0-100]: ");
			tip = sc.nextDouble();
		}
		//calculating tip amount and tax amount
		double tipAmount = ((totalAMount/100.0)*tip);
		double taxAmount = ((totalAMount/100.0)*tax);
		//using printf statement to print up to 2 decimal places
		System.out.printf("Price : %.2f\n",totalAMount);
		System.out.printf("Tax (%.2f): %.2f\n",tax,taxAmount);
		System.out.printf("Tip (%.2f): %.2f\n ",tip,tipAmount);
		System.out.println("------------------------");
		System.out.printf("Total Amount: $ %.2f Your order has been placed and will be delivered soon! \n",(totalAMount+taxAmount+tipAmount));
		sc.close();
	}

}
