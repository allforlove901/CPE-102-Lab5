public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      MonetaryUnit unit = new MonetaryUnit(true, 10);

      System.out.println("Cents: " + register.displayAmountPaid(unit));
      System.out.println("Expected: 1000");
   }
}