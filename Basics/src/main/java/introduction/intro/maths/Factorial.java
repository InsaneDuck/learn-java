package introduction.intro.maths;
import java.util.Scanner;

public class Factorial
{
	public static int getFactorial(int n)
	{
		int i;
		int factorial=1;
		for(i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to calculate factorial:");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is "+getFactorial(n));
		sc.close();
	}
}
