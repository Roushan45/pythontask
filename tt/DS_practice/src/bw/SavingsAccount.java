package bw;

import bw.Account;
public class SavingsAccount extends Account{
	private double interestRate;

//	public SavingsAccount() {
//		
//	}
	public SavingsAccount(double accBal,double intrstRate) {
		//super(23);
		System.out.println("in suer const");
		interestRate = intrstRate;
		
	}
	
	public static void main(String[] args) {
		SavingsAccount newAc = new SavingsAccount(23, 4);
	}

}
