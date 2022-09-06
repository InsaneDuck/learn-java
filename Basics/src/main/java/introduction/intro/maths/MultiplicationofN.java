package introduction.intro.maths;

import java.util.Scanner;
public class MultiplicationofN 
{
	public static long getMultiply(int num1,int num2)
	{
		long multiplication=num1*num2;
		return multiplication;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1=");
		int n1=sc.nextInt();
		System.out.println("Enter n2=");
		int n2=sc.nextInt();
		long mul=getMultiply(n1,n2);
		System.out.println("Multiplication of n1,n2="+mul);
		sc.close();	
	}
	
}
