package cheggfeb18;

//Interface have methods
public interface BankAccount {
	
	void deposit(double amount);
	void withdraw(double amount);
	String toString();
	String getAccountType();
	double getBalance();

}
