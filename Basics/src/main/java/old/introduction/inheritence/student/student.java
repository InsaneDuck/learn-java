package old.introduction.inheritence.student;

public class student extends person
{
	String program;
	int year;
	double fee;
	student()
	{
		
	}
	student(String name,String address,String program,int year,double fee)
	{
		super.setName(name);
		super.setAddress(address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public double getFee()
	{
		return fee;
	}
	public String getProgram()
	{
		return program;
	}
	public int getYear()
	{
		return year;
	}
	public void setFee(double fee)
	{
		this.fee = fee;
	}
	public void setProgram(String program)
	{
		this.program = program;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	@Override
	public String toString()
	{
		return "Student[Name="+name+" ,Address="+address+
				" ,Program="+program+" ,Year="+year+" ,Fee="+fee;
	}
}
