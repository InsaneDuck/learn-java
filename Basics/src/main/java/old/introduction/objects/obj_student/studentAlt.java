package old.introduction.objects.obj_student;

public class studentAlt
{
	int id;     //initializing values in a class
	String name;
	int m1,m2,m3;
	studentAlt() //default constructor 
	{
		
	}
	studentAlt(int i,String n,int s1,int s2,int s3)//constructor //using initialized value to make a constructor
	{
		id=i;
		name=n;
		m1=s1;
		m2=s2;
		m3=s3;
	}
	public double percentage()
	{
		int total=m1+m2+m3;
		double percentage=(total/300f)*100f;
		return percentage;
	}
	@Override
	public String toString()
	{
		return "ID="+id+", Name="+name+" ,m1="+m1+
				" ,m2="+m2+" ,m3="+m3+
				" ,Percentage="+percentage();
	}
}
