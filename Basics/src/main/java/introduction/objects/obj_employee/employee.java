package introduction.objects.obj_employee;

public class employee
{
	int empid;
	String name;
	String address;
	employee()
	{
		
	}
	employee(int i,String n,String add)
	{
		empid=i;
		name=n;
		address=add;
	}
	String getAddress(String add)
	{
		return address;
	}
	int getID(int i)
	{
		return empid;
	}
	String getName(String n)
	{
		return name;
	}
	void setAddress(String add)
	{
		address=add;
	}
	void setID(int i)
	{
		empid=i;
	}
	void setName(String n)
	{
		name=n;
	}
	@Override
	public String toString()
	{
		return empid+","+name+","+address;
	}
}

