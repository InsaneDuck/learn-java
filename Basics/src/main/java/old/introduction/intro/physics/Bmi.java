package old.introduction.intro.physics;

import java.util.Scanner;
public class Bmi {
	public static void main(String arg[]) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Weight in kg=");
		double w=sc1.nextDouble();
		System.out.println("Enter Height in meters=");
		double h=sc1.nextDouble();
		double bmi;
		bmi=w/(h*h);
		System.out.println("BMI="+bmi);
		sc1.close();
	}
}
