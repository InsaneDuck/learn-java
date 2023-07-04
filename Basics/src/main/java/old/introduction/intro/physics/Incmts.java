package old.introduction.intro.physics;

import java.util.Scanner;
public class Incmts {
	public static double getMeters(double i)
	{
		double mts=i*0.025;
		return mts;
	}
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter inches in number=");
		double inch=sc.nextDouble();
		double meters=getMeters(inch);
		System.out.println("meters after converted from inches="+meters);	
		sc.close();
	}
}