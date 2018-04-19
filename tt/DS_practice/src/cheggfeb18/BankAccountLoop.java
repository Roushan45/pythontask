package cheggfeb18;

import java.util.Scanner;

public class BankAccountLoop {
//private instance variables
	private double balance;
	private double interestRate=5;
	
	//method for withdraw the amount
	public void withDraw(double amount) {
		if( amount<0) {
			System.out.println("Invalid amount!");
			return;
		}
		//checking balance before withdraw
		if(amount>balance) {
			System.out.println("Not enough balance ! ");
			return;
		}
		balance-=amount;
		
	}
	
	public void deposit(double amount) {
		if( amount<0) {
			System.out.println("Invalid amount!");
			return;
		}
		balance+=amount;
	}
	
	public double getInterestForMonth() {
		double monthlyRate=interestRate/12;
		return (monthlyRate*balance)/100;
	}
	
	public void display() {
		System.out.println("The Balance is  $"+balance);
	}

	public double getBalance() {
		return balance;
	}
	public static void main(String[] args) {
		System.out.println("\n\t**welcome to Mercy Bank**\n");
		Scanner sc = new Scanner(System.in);
		BankAccountLoop acc = new BankAccountLoop();
		while(true) {
			System.out.println("Choose a number (1) Deposit: (2) withdrawl: (3) Interest calc: (4) Display: (0) Exit");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.print("Enter the Deposit Amount : \n$");
				double amount=sc.nextDouble();
				acc.deposit(amount);
			}
			else if(choice==2) {
				System.out.print("Enter the Amount to withdraw : \n$");
				double amount=sc.nextDouble();
				acc.withDraw(amount);
			}
			else if(choice==3) {
				System.out.println("The balance before interest is  $"+acc.getBalance());
				System.out.println("The interest rate for this month is  $"+acc.getInterestForMonth());
				System.out.println("The Balance after interest rate calculation is $"+(acc.getBalance()+acc.getInterestForMonth()));
			}
			else if(choice==4) {
				acc.display();
			}
			else if(choice==0) {
				System.out.println("Thanks for using Mercy Bank....");
				break;
			}
			else {
				System.out.println("Invalid choice !");
			}
			System.out.println("-------------------------------------------------");
		}
	}

}
