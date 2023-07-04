package old.introduction.intro.maths;

import java.util.Scanner;
public class AreaofRectangle 
{
	public static double getRectangle(double l,double b)
	{
		double area=l*b;
		return area;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides length(l) and breadth(b) rectangle");
		System.out.println("Enter length(l)=");
		double length=sc.nextDouble();
		System.out.println("Enter breadth(b)=");
		double breadth=sc.nextDouble();
		double area=getRectangle(length,breadth);
		System.out.println("Area of Rectangle="+area);
		sc.close();
	}
}
