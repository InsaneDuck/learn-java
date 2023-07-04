package old.introduction.exceptions.student;

public class Student
{
	static int idgen=100;
	private int id;
	private String name;
	private String address;
	public Student(String name, String address)
	{
		idgen++;
		this.id = idgen;
		this.name = name;
		this.address = address;
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
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
