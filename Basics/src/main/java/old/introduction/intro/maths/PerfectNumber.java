package old.introduction.intro.maths;
import java.util.Scanner;

public class PerfectNumber 
{
	public static boolean checkPerfect(int number)
	{
		int i;
		int sum=0;
		boolean isperfect=false;
		for(i=1;i<number;i++) 
		{
			if(number%i==0)  
			{
				sum=sum+i;
			}
		}
		if (sum == number)
		{
			isperfect=true;
		}
		return isperfect;
	}
	public static void main(String arg[]) 
	{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number:");
		int number=sc.nextInt();
		System.out.println("Given number "+number+" is perfect (True or False):"+checkPerfect(number));
		sc.close();
	}
}
