package introduction.intro.maths;
import java.util.Scanner;
public class Fivedigitsornot 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		String check=useCheck(i);
		System.out.println(check);
		sc.close();
	}
	public static String useCheck(int x)
	{
		String num="";
		if(x<100000)
		{
			if(x>9999)
			{
				num="Number is 5 digits";
			}
			else
			{
				num="Number is not 5 digits";
			}
		}
		else
			num="Number is not 5 digits";
		return num;
	}
}
