package old.introduction.intro.maths;
import java.util.Scanner;

public class primeORnot
{
	public static boolean checkPrime(int n)
	{
		boolean prime=true;
		int i,half=n/2;
		if (n==0||n==1)
		{
			prime=false;
		}
		else
		{
			for(i=2;i<=half;i++)
			{
				switch((n%i))
				{
				case 0:
					prime=false;
				break;
				}
			}
		
		}
		return prime;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=sc.nextInt();
		System.out.println("Given number is prime(true or false):"+checkPrime(i));
		sc.close();
	}
}