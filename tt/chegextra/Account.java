

public class Account {
	private double balance;

	public Account() {
		this.balance=0;
	}
	public Account(double accBal){
		this.balance=accBal;
	}
	
	public void deposit(double d){
		balance = balance+d;
		System.out.println("new Balance = "+(this.balance));
	}
	public void withdraw(double d){
		this.balance=this.balance-d;
		System.out.println("Total balance is "+( this.balance));
	}
	
	public double getBalance(){
		return balance;
	}
}
