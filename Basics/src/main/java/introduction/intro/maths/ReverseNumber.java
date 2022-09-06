package introduction.intro.maths;
import java.util.Scanner;
public class ReverseNumber
{
	public static int getReverse(int num)
	{
		int reverse=0;
		while (num!=0)
		{
			int remainder = num%10;
            reverse=reverse*10+remainder;
            num/=10;
		}
		return reverse;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Given Number is:"+n+" Reverse of given number is:"+getReverse(n));
		sc.close();
	}
}