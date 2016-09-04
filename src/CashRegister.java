/**
   A cash register totals up sales and computes change due. Also keeps track
   of the number of items in sale.
*/
public class CashRegister
{
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;
   
   private MonetaryUnit unit;

   private double purchase;
   private double payment;   
   private int itemCount;
   private double changeLeft = 0;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }
   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      double newTotal = purchase + amount;
      purchase = newTotal;
      itemCount++;
   }
   
   /**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void enterPayment(MonetaryUnit unit)
   {
      this.unit = unit;
   }
   
   public int displayAmountPaid(MonetaryUnit unit)
   {
	   if(unit.isABill)
		   payment = unit.value*100;
	   else
		   payment = unit.value;
	   
	   return (int)payment;
   }
}