package old.introduction.intro.maths;
import java.util.Scanner;

public class PrimeNumbersInaRange
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
		System.out.println("Enter start of the range:");
		int start=sc.nextInt();
		System.out.println("Enter end of the range:");
		int end=sc.nextInt();
		if(start<end)
		{
			System.out.println("Primes between "+start+" and "+end+" are "+Prime(start,end));
		}
		else
		{
			System.out.println("start of range must be less than end of range");
		}
		sc.close();
	}
	public static String Prime(int start,int end)
	{
		String primes="";
		for(int i=start;i<=end;i++)
		{
			boolean primecheck=checkPrime(i);
			if(primecheck)
			{
				primes=primes+i+",";
			}
		}
		return primes;
	}
}