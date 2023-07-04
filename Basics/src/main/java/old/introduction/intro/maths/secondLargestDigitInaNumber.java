package old.introduction.intro.maths;
import java.util.Scanner;

public class secondLargestDigitInaNumber
{
	public static int getSecondLargest(int n)
	{
		int largest=0;
		int secondlargest=0;
		int r=0;
		while(n>0)
		{
			r=n%10;
			if(r>largest)
			{
				secondlargest=largest;
				largest=r;
			}
			else if(r>secondlargest && r<largest)
			{
				secondlargest=r;
			}
			n=n/10;
		}
		return secondlargest;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i=sc.nextInt();
		System.out.println("Second largest number in the given number is "+getSecondLargest(i));
		sc.close();
	}
}
