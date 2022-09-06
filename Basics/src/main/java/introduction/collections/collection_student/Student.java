package introduction.collections.collection_student;

public class Student
{
	static private int idgenerator=100;
	private int id;
	private String name;
	private int s1;
	private int s2;
	private int s3;
	public Student()
	{
		
	}
	public Student(String name, int s1, int s2, int s3)
	{
		idgenerator++;
		this.id = idgenerator;
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getPercentage()
	{
		double total=s1+s2+s3;
		return ((total)/300)*100;
	}
	public int getS1()
	{
		return s1;
	}
	public int getS2()
	{
		return s2;
	}
	public int getS3()
	{
		return s3;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setS1(int s1)
	{
		this.s1 = s1;
	}
	public void setS2(int s2)
	{
		this.s2 = s2;
	}
	public void setS3(int s3)
	{
		this.s3 = s3;
	}
	@Override
	public String toString()
	{
		return "\nStudent [id=" + id + ", name=" + name + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3
				+ ", Percentage=" + getPercentage() + "]";
	}
}
