package introduction.collections.iterator.employee;

public class Employee
{
	static int idgen=0;
	private int id;
	private String name;
	private int salary;
	public Employee()
	{
		
	}
	public Employee(String name, int salary)
	{
		super();
		idgen++;
		this.id = idgen;
		this.name = name;
		this.salary = salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
