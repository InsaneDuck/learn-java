package introduction.objects.obj_cab;
import java.util.ArrayList;

public class CabCustomerService extends CabCustomer
{
	ArrayList<CabCustomer> CustomerList=new ArrayList<CabCustomer>();
	CabCustomerService()
	{
		
	}
	void addCabCustomer(CabCustomer c)
	{
		CustomerList.add(c);
	}
	double calculateBill(CabCustomer c)
	{
		if(isFirstCustomer(c))
		{
			return 0;
		}
		else if(c.getDistance()<=4)
		{
			return 80;
		}
		else if(c.getDistance()>4)
		{
			return (80+((c.getDistance()-4)*6));
		}
		return 0;
	}
	public void display()
	{
		for(CabCustomer c: CustomerList)
		{
			System.out.println(c);
		}
	}
	boolean isFirstCustomer(CabCustomer c)
	{
		for(CabCustomer c1: CustomerList)
		{
			if(c.getPhone()==c1.getPhone())
			{
				return false;
			}
		}
		CustomerList.add(c);
		return true;
	}
	String printBill(CabCustomer c)
	{
		if(isFirstCustomer(c))
		{
			return c.getCustomerName()+" Please pay your bill of Rs"+calculateBill(c);
		}
		else
			return c.getCustomerName()+" Please pay your bill of Rs"+calculateBill(c);
	}
}
