package introduction.intro.maths;
import java.util.Scanner;

public class nextPrime 
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

	public static int getNextPrime(int n) 
	{
		 n++; 
		while(!checkPrime(n)) 
		{
			n++;
		}
		return n;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println(getNextPrime(n));
		sc.close();
	}
}
