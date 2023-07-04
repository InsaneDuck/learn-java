package old.introduction.objects.obj_employee;

public class employeeAlt
{
	static int idgenerator=0;
	int empid;
	String firstName;
	String lastName;
	int salary;
	employeeAlt()
	{
		
	}
	employeeAlt(String fn,String ln,int sal)
	{
		idgenerator++;
		empid=idgenerator;
		firstName=fn;
		lastName=ln;
		salary=sal;
	}
	int getAnnualSalary()
	{
		return salary*12;
	}
	String getfirstName()
	{
		return firstName;
	}
	int getID()
	{
		return empid;
	}
	String getlastName()
	{
		return lastName;
	}
	String getName()
	{
		String name=firstName+" "+lastName;
		return name;
	}
	int getSalary()
	{
		return salary;
	}
	int raiseSalary(int percent)
	{
		int raise=(percent/100)*salary;
		salary=salary+raise;
		return salary;
	}
	void setID(int id)
	{
		empid=id;
	}
	void setSalary(int sal)
	{
		salary=sal;
	}
	@Override
	public String toString()
	{
		return empid+","+getName()+","+salary;
	}
}

