package introduction.intro.maths;

import java.util.Scanner;
public class TriangleArea 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides of triangle a,b,c below");
		System.out.println("Enter side a");
		double a=sc.nextDouble();
		System.out.println("Enter side b");
		double b=sc.nextDouble();
		System.out.println("Enter side c");
		double c=sc.nextDouble();
		double s=(a+b+c)/2;
		double a1=s*(s-a)*(s-b)*(s-c);
		double area=Math.sqrt(a1);
		System.out.println("Area of Triangle="+area);
		sc.close();
	}
}