/**
 * class to implement both bills and coins
 * @author brettnelson
 *
 */
public class MonetaryUnit {

	public boolean isABill;
	public int value = 0;
	
	public MonetaryUnit(boolean unit, int amount)
	{
		isABill = unit;
		value = amount;
	}
}
