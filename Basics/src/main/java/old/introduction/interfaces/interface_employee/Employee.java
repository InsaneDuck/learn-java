package old.introduction.interfaces.interface_employee;

public class Employee implements Allowance
{
	static int idgen=100;
	public static int getIdgen()
	{
		return idgen;
	}
	public static void setIdgen(int idgen)
	{
		Employee.idgen = idgen;
	}
	int id;
	String name;
	String address;
	int phone;
	double salary;
	Employee()
	{
		
	}
	Employee(int id,String name,String address,int phone,double salary)
	{
		idgen++;
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.salary=salary;
	}
	@Override
	public double calculateTransportAllowance()
	{
		return (15*salary)/100;
	}
	public String getAddress()
	{
		return address;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getPhone()
	{
		return phone;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return "ID :"+id+"\nName :"+name+"\nAddress :"+address+"\nPhone :"+phone+
				"\nSalary :"+salary;
	}
}
	
