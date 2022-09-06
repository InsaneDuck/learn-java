package introduction.inheritence.student;

public class staff extends person
{
	String school;
	double pay;
	staff()
	{
		
	}
	staff(String name,String address,String school,double pay)
	{
		super.setName(name);
		super.setAddress(address);
		this.school=school;
		this.pay=pay;
	}
	public double getPay()
	{
		return pay;
	}
	public String getSchool()
	{
		return school;
	}
	public void setPay(double pay)
	{
		this.pay = pay;
	}
	public void setSchool(String school)
	{
		this.school = school;
	}
	@Override
	public String toString()
	{
		return "Staff[Name="+name+" ,Address="+address+" ,School="+school+" ,Pay="+pay;
	}
}
