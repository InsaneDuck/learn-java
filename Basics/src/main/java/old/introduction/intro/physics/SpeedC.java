package old.introduction.intro.physics;

import java.util.Scanner;
public class SpeedC 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter distance(meters)=");
		double d=sc.nextDouble();
		System.out.println("enter time in follwing order hours then minutes then seconds");
		double h=sc.nextDouble();
		double m=sc.nextDouble();
		double s=sc.nextDouble();
		double s1=h*3600;     //converting hours to seconds
		double s2=m*60;       //converting minutes to seconds
		double time=s+s1+s2;    //total time in seconds
		double speed;
		speed=d/time;
		System.out.println("speed(m/s)="+speed);
		double speedkmh=speed*3.6;//speedkmh is speed in km/hr
		System.out.println("speed(km/hr)="+speedkmh);
		double speedmih=speedkmh/1.609;//speedmih is speed in miles/hr
		System.out.println("speed(miles/hr)="+speedmih);
		sc.close();
	}
}
