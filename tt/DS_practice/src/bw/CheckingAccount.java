package bw;

public class CheckingAccount extends Account{
	

	public CheckingAccount(double accBal) {
		
		//super();
		deposit(accBal);
		System.out.println("sdnnjn");
	}
	
	
	
	public static void main(String[] args) {
		new CheckingAccount(45);
	}

}
