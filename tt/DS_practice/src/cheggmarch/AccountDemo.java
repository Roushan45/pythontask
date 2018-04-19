package cheggmarch;
class AccountDemo
{
   public static void main(String[] args)
   {
      SavingsAccount sa = new SavingsAccount(10000);
      System.out.println("account name: " + sa.getName());
      System.out.println("initial amount: " + sa.getAmount());
      sa.deposit(5000);
      System.out.println("new amount after deposit: " + sa.getAmount());
      System.out.println("");
      CheckingAccount ca = new CheckingAccount(20000);
      System.out.println("account name: " + ca.getName());
      System.out.println("initial amount: " + ca.getAmount());
      ca.deposit(6000);
      System.out.println("new amount after deposit: " + ca.getAmount());
      ca.withdraw(3000);
      System.out.println("new amount after withdrawal: " + ca.getAmount());
      System.out.println("");
      //Certificate of deposit information
      //name of account will be savings as it extending the 
      //SavingAccout Class
      System.out.println("Name of Certificate of account chaged to savings as it is \n"
      		+ "extending the SavingAccount class");
      CertificateOfDeposit cd = new CertificateOfDeposit(150000);
      System.out.println("account name: " + cd.getName());
      System.out.println("initial amount: " + cd.getAmount());
      cd.deposit(50000);
      System.out.println("new amount after deposit: " + cd.getAmount());
      
      System.out.println("");
      System.out.println("");
      //Mortgate information
      Mortgage mortage = new Mortgage(250000);
      System.out.println("account name: " + mortage.getName());
      System.out.println("initial amount: " + mortage.getAmount());
      mortage.withdraw(50000);
      System.out.println("new amount after withdraw: " + mortage.getAmount());
   }
}