package old.introduction.objects.obj_student;

public class percentage
{
	public static void main(String[] args)
	{
		int[] subjects=new int[5];
		subjects[0]=50;
		subjects[1]=50;
		subjects[2]=50;
		subjects[3]=50;
		subjects[4]=50;
		int total=0;
		for(int i=0;i<subjects.length;i++)	
		{
			total=total+subjects[i];
		}
		System.out.println("total="+total);
		double percentage=(total/500f)*100f;
		System.out.println("percentage="+percentage);
	}
}
