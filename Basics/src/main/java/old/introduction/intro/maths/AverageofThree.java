package old.introduction.intro.maths;

import java.util.Scanner;
public class AverageofThree 
{
	public static double getAvg(double x,double y,double z)
	{
		double avg=(x+y+z)/3;
		return avg;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number a,b,c");
		System.out.println("Enter a=");
		double a=sc.nextDouble();
		System.out.println("Enter b=");
		double b=sc.nextDouble();
		System.out.println("Enter c=");
		double c=sc.nextDouble();
		double average=getAvg(a,b,c);
		System.out.println("Average of a,b,c="+average);
		sc.close();
	}
}