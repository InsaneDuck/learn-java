package introduction.intro.maths;

import java.util.Scanner;
public class AdditionofN 
{
	public static void getSum(int num1,int num2)
	{
		System.out.println("Sum of "+num1+","+num2+"="+(num1+num2));
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of n1,n2,n3,n4,n5,n6,n7,n8");
		System.out.println("Enter n1=");
		int n1=sc.nextInt();
		System.out.println("Enter n2=");
		int n2=sc.nextInt();
		System.out.println("Enter n3=");
		int n3=sc.nextInt();
		System.out.println("Enter n4=");
		int n4=sc.nextInt();
		System.out.println("Enter n5=");
		int n5=sc.nextInt();
		System.out.println("Enter n6=");
		int n6=sc.nextInt();
		System.out.println("Enter n7=");
		int n7=sc.nextInt();
		System.out.println("Enter n8=");
		int n8=sc.nextInt();
		getSum(n1,n2);
		getSum(n3,n4);
		getSum(n5,n6);
		getSum(n7,n8);
		sc.close();
	}

}
