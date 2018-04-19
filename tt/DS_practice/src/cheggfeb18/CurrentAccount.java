package cheggfeb18;

//current account 
public class CurrentAccount implements BankAccount{
	//private instance variables
	private String AccountType;
	private double balance;
	//constructor to initialize the variables
	public CurrentAccount(String at,double bal) {
		this.AccountType=at;
		this.balance=bal;
	}
	//method overridden from interface
		//method for depositing the amount
	@Override
	public void deposit(double amount) {
		if( amount<0) {
			System.out.println("Invalid amount!");
			return;
		}
		balance+=amount;	
	}
	//method for withdrawing the amount
	@Override
	public void withdraw(double amount) {
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

	@Override
	public String getAccountType() {
	
		return this.AccountType;
	}

	@Override
	public double getBalance() {
		
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account Type : "+AccountType+"\nBalance : $"+balance;
	}
}
