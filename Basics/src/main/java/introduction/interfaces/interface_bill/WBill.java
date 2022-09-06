package introduction.interfaces.interface_bill;

public class WBill implements iBill
{
	static int units;
	public static double calcBill(int no_of_units)
	{
		return no_of_units*5;
	}
	public static void displayBill()
	{
		System.out.println("Water Bill="+calcBill(units));
	}
	WBill()
	{
		
	}
	WBill(int units)
	{
		WBill.units=units;
	}
	public int getUnits()
	{
		return units;
	}
	public void setUnits(int units)
	{
		WBill.units = units;
	}
}
