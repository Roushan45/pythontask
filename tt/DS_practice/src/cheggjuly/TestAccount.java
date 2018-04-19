package cheggjuly;

public class TestAccount {
	
	public static void main(String[] args) {
		//created two accounts
		System.out.println("Myaccount account got created with initial bal of 10000");
		Account myAccount = new Account(123,10000);
		System.out.println("Myaccount account got created with initial bal of 20000");
		Account yourAccount = new Account(124, 20000);
		myAccount.setAnnualInterestRate(5);
		//performing the action on those methods
		System.out.println("MyAccount withdrawing 2000 ...");
		myAccount.withdraw(2000);
		System.out.println("Current balance of MyAccount : "+myAccount.getBalance());
		myAccount.deposit(1000);
		System.out.println("MyAccount deposited 1000 ...");
		System.out.println("Current balance of MyAccount : "+myAccount.getBalance());
		yourAccount.setAnnualInterestRate(5);
		System.out.println("youraccount withdrawing 3000 ...");
		
		yourAccount.withdraw(3000);
		System.out.println("Current balance of youraccount : "+yourAccount.getBalance());
		System.out.println("yourAccount deposited 2000 ...");
		yourAccount.deposit(2000);
		System.out.println("Current balance of yourAccount : "+yourAccount.getBalance());
		System.out.println("Printing the final summary of accounts: ");
		System.out.println(myAccount);
		System.out.println(yourAccount);
		//as given account with id 1122 created 
		Account acc = new Account(1122, 20000);
		acc.withdraw(2500);
		acc.deposit(300);
		System.out.println(acc);
		
	}

}
