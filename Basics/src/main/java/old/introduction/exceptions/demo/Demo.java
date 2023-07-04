package old.introduction.exceptions.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		float res=0.0f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 inputs");
		try
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			res=n1/n2;
		}
		catch(ArithmeticException|InputMismatchException i)
		{
			System.out.println(i);
		}
		/*catch(InputMismatchException i)
		{
			System.out.println(i);
		}*/
		finally
		{
			System.out.println("result :"+res);
		}
		System.out.println("Remaining code.........");
		String s=sc.next();
		try
		{
			method(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(s);
		sc.close();
	}
	public static void method(String s) throws Exception
	{
		System.out.println(Integer.valueOf(s));
		String s1=s.toLowerCase();
		System.out.println(s1);
	}
}
