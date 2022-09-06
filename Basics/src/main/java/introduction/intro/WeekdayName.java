package introduction.intro;

import java.util.Scanner;
public class WeekdayName 
{
	public static String checkDay(int x)
	{
		String day="";
		if(x==1)
			day="Sunday";
		else if(x==2)
			day="Monday";
		else if(x==3)
			day="Tuesday";
		else if(x==4)
			day="Wednesday";
		else if(x==5)
			day="Thursday";
		else if(x==6)
			day="Friday";
		else if(x==7)
			day="Saturday";
		else if(x==0)
			day="Saturday";
		else
			day="Error";
		return day;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int weekday=sc.nextInt();
		String check=checkDay(weekday);
		System.out.println("Today is a "+check);
		sc.close();
	}
}
