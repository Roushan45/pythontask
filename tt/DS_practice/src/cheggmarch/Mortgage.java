package cheggmarch;
class Mortgage extends Account
{
    Mortgage(long amount)
   {
      super("Mortgage", amount);
   }
   void withdraw(long amount)
   {
      setAmount(getAmount() - amount);
   }
}