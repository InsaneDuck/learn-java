package old.introduction.intro.maths;
import java.util.Scanner;
public class NumberDigits
{
	public static int[] getDigits(int n)
    {
        //ADD YOUR CODE HERE
    	String num=Integer.toString(n);
    	int[] digits=new int[num.length()];
    	for(int i=0;i<num.length();i++)
    	{
    		digits[i]=n%10;
    		n=n/10;
    	}
    	return digits;
    }
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Digits are:"+getDigits(n));
		sc.close();
	}
}