package introduction.interfaces.interface_employee;

public class Manager extends Employee
{
	int ManagerBonus;
	Manager()
	{
		
	}
	Manager(int id,String name,String address,int phone,double salary,int bonus)
	{
		super(id,name,address,phone,salary);
		this.ManagerBonus=bonus;
	}
}
