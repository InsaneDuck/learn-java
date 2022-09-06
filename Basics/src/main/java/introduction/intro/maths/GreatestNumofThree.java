package introduction.intro.maths;
import java.util.Scanner;
public class GreatestNumofThree 
{
	public static String getGreater(int x,int y,int z) 
	{
		String greater="";
		if(x>y)
		{
			if(x>z)
				greater=+x+" is the greatest";
			else
				greater=+z+" is the greatest";
		}
		else
		{
			if(y>z)
				greater=+y+" is the greatest";
			else
				greater=+z+" is the greatest";
		}
		return greater;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers a,b,c");
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		System.out.println("Enter c");
		int c=sc.nextInt();
		String greatest=getGreater(a,b,c);
		System.out.println(greatest);
		sc.close();
	}
}
