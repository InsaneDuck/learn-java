package introduction.interfaces.interface_bank_roi;

public class CalculateROI 
{
	public static void main(String[] args) 
	{
		SBI sbi=new SBI(20000,100000);
		ICICI icici=new ICICI(30000,90000);
		System.out.println("The ROI for SBI is "+sbi.calcROI());
		System.out.println("The ROI for ICICI is "+icici.calcROI());
	}
}