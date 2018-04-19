package cheggfeb18;

public class BankApp {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount("Saving",500);
		CurrentAccount current = new CurrentAccount("current", 500);
		saving.withdraw(50);
		saving.deposit(100);
		current.deposit(120);
		current.withdraw(30);
		System.out.println(current);
		System.out.println();
		System.out.println(saving);
	}

}
