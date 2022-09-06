package introduction.interfaces.interface_bank_roi;

public class ICICI implements bank 
{
	double netProfit;
	double investment;
	public ICICI(double netProfit, double investment) 
	{
		this.netProfit=netProfit;
		this.investment=investment;
	}
	@Override
	public double calcROI() 
	{
		return (netProfit/investment)*100;
	}
}