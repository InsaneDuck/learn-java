package old.introduction.intro.maths;

import java.util.Scanner;
public class Dxy 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter coordinate of x(x1,y1)");
		System.out.println("Enter x1=");
		float x1=sc.nextFloat();
		System.out.println("Enter y1=");
		float y1=sc.nextFloat();
		System.out.println("Enter coordinates of y(x2,y2)");
		System.out.println("Enter x2=");
		float x2=sc.nextFloat();
		System.out.println("Enter y2=");
		float y2=sc.nextFloat();
		double distance=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println("Distance between x and y is="+distance);
		sc.close();
	}
}