package introduction.intro.maths;
import java.util.Scanner;

public class isEveryDigitOdd
{
	public static boolean isAllDigitsOdd(int num) 
    {
        //ADD YOUR CODE HERE
    	boolean isOdd=true;
    	while (num>0)
		{
			int digit=num%10;
			if(digit%2==0)
			{
				isOdd=false;
			}
			num=num/10;
		}
    	return isOdd;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int i=sc.nextInt();
		System.out.println(isAllDigitsOdd(i));
		sc.close();
	}
}
