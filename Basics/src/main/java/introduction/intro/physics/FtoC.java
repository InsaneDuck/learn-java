package introduction.intro.physics;


import java.util.Scanner;
public class FtoC 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fahrenheit value=");
		double f=sc.nextDouble();
		double c;
		c=(f-32)/1.8;
		System.out.println("Celsius="+c);
		sc.close();
	}
}