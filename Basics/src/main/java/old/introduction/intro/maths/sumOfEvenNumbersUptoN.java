package old.introduction.intro.maths;
import java.util.Scanner;
public class sumOfEvenNumbersUptoN 
{
	public static int getSumofeven(int n)
	{
		int x=2;
		int sum=0;
		while(x<=n)
		{
			sum+=x;
			x=x+2;
		}
		return sum;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value=");
		int n=sc.nextInt();
		System.out.println("Sum of even numbers upto n="+getSumofeven(n));
		sc.close();
	}
}