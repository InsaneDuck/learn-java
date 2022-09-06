package introduction.intro.maths;
import java.util.Scanner;
public class sumOfnNumbers 
{
	public static int getSumofn(int n)
	{
		int x=1;
		int sum=0;
		while(x<=n)
		{
			sum+=x;
			x++;
		}
		return sum;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value=");
		int n=sc.nextInt();
		System.out.println("Sum of n number="+getSumofn(n));
		sc.close();
	}
}