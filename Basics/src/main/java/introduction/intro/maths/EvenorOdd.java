package introduction.intro.maths;
import java.util.Scanner;
public class EvenorOdd 
{
	public static String isEvenOrOdd(int x)
	{
		String type="";
		if(x%2==0)
		{
			type="even";
		}
		else 
		{
			type="odd";
		}
		
		return type;
	}
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		String evenorodd=isEvenOrOdd(i);
		System.out.println(evenorodd);
		sc.close();
	}
}
