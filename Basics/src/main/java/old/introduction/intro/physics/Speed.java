package old.introduction.intro.physics;

import java.util.Scanner;
public class Speed {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance(KM)=");
		int d=sc.nextInt();
		System.out.println("Enter Time(Hours)=");
		int t=sc.nextInt();
		int speed;
		speed=d/t;
		System.out.println("Speed="+speed+"KM/Hour");
		sc.close();
	}
}