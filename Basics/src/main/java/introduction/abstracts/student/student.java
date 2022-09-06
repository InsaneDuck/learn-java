package introduction.abstracts.student;

public abstract class student
{
	static int idgenerator=0;
	int id;
	String name;
	public student()
	{
		
	}
	public student(String name)
	{
		idgenerator++;
		this.name=name;
		this.id=idgenerator;
	}
	public abstract double findPercentage();
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
