package introduction.interfaces.interface_bank_roi;

public class SBI implements bank
{
	double netProfit;
	double investment;
	public SBI(double netProfit, double investment) 
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
