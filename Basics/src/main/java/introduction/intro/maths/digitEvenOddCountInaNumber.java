package introduction.intro.maths;
import java.util.Scanner;
public class digitEvenOddCountInaNumber
{
	public static int getEven(int n)
	{
		int digit=0;
		int evencount=0;
		while(n>0)
		{
			digit=n%10;
			n=n/10;
			if((digit%2)==0)
				evencount++;
		}
		return evencount;
	}
	public static int getOdd(int n)
	{
		int digit=0;
		int oddcount=0;
		while(n>0)
		{
			digit=n%10;
			n=n/10;
			if((digit%2)!=0)
				oddcount++;
		}
		return oddcount;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=sc.nextInt();
		System.out.println("Number of even numbers in given number="+getEven(i));
		System.out.println("Number of odd numbers in given number="+getOdd(i));
		sc.close();
	}
}
