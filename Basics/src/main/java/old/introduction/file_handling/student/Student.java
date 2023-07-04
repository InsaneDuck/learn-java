package old.introduction.file_handling.student;

public class Student
{
	private int id;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	public Student(int id, String name, int m1, int m2, int m3)
	{
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public int getId()
	{
		return id;
	}
	public int getM1()
	{
		return m1;
	}
	public int getM2()
	{
		return m2;
	}
	public int getM3()
	{
		return m3;
	}
	public String getName()
	{
		return name;
	}
	public double getPercentage()
	{
		double total=m1+m2+m3;
		return (total/300)*100;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setM1(int m1)
	{
		this.m1 = m1;
	}
	public void setM2(int m2)
	{
		this.m2 = m2;
	}
	public void setM3(int m3)
	{
		this.m3 = m3;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3
				+ ", Percentage=" + getPercentage() + "]";
	}
}