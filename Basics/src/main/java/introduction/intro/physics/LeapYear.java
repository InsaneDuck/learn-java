package introduction.intro.physics;
import java.util.Scanner;
public class LeapYear 
{
	public static String checkLeap(int x)
	{
		String yeartype="";
		if(x%100==0)
		{
			if(x%400==0)
				yeartype="Leap Year";
			else
				yeartype="Not Leap Year";
		}
		else if(x%4==0)
		{
			yeartype="Leap Year";
		}
		else
			yeartype="Not Leap Year";
		return yeartype;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year");
		int year=sc.nextInt();
		String yearcheck=checkLeap(year);
		System.out.println(yearcheck);
		sc.close();
	}
}
