package old.introduction.objects.obj_student;

public class student
{
	int id;
	String name;
	int[] subjects=new int[5];
	public void details(int i,String n,int[] s)
	{
		id=i;
		name=n;
		for(int x=0;x<subjects.length;x++)
		{
			subjects[x]=s[x];
		}
	}
	public double percentage()
	{
		int total=0;
		for(int i=0;i<subjects.length;i++)	
		{
			total=total+subjects[i];
		}
		double percentage=(total/500f)*100f;
		return percentage;
	}
	@Override
	public String toString()
	{
		return "ID="+id+", Name="+name;
	}
}
