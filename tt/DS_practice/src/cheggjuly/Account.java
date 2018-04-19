package cheggjuly;

import java.util.Date;
//account class
public class Account {
//required class variables
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	//default constructor
	 public Account()
	 {
		 //initializing the date
		 dateCreated = new Date();
		this.annualInterestRate=4.5;
	 }
	 //parameterized constructor
	 public Account(int id, int balance)
	 {
		 dateCreated = new Date();
		 this.id=id;
		 this.balance=balance;
		 this.annualInterestRate=4.5;
	 }
	 //getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate()
	{
		return (this.annualInterestRate/100)/12;
	}
	public double getMonthlyInterest()
	{
		return getMonthlyInterest()*this.balance;
	}
	public void withdraw(double balance)
	{
		this.balance=this.balance-balance;
	}
	public void deposit(double balance)
	{
		this.balance=this.balance+balance;
	}
	//tostring method for printing
	@Override
	public String toString()
	{
		return String.format("\nAccount ID%20s",this.id )
				+ String.format("\nAccount Balance %16s",this.balance )
				+String.format("\nInterest Rate %15s",this.annualInterestRate)
				+String.format("\nDate Opened %42s", this.dateCreated);
		
	}

}
