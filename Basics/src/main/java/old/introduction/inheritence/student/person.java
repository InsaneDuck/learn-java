package old.introduction.inheritence.student;

public class person
{
	String name;
	String address;
	person()
	{
		
	}
	person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Person[Name="+name+" ,Address="+address+"]";
	}
}
