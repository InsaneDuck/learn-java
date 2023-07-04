package old.introduction.objects.obj_circle;

import java.util.Scanner;

public class CircleObjects
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter radius=");
		c.radius=sc.nextFloat();
		System.out.println("Area of cirle for given radius is="+c.area());
		System.out.println("Perimeter of cirle for given radius is="+c.perimeter());
		sc.close();
	}
}
