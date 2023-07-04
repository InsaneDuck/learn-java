package old.introduction.interfaces.interface_bill;

public class EBill implements iBill
{
	static int units;
	public static double calcBill(int no_of_units)
	{
		return no_of_units*6;
	}
	public static void displayBill()
	{
		System.out.println("Eclectric Bill="+calcBill(units));
	}
	EBill()
	{
		
	}
	EBill(int units)
	{
		EBill.units=units;
	}
	public int getUnits()
	{
		return units;
	}
	public void setUnits(int units)
	{
		EBill.units = units;
	}
}
