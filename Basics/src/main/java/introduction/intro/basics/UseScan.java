package introduction.intro.basics;

import java.util.Scanner;
public class UseScan {
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in); //sc is object to use scanner
		System.out.println("enter number=");
		int a=sc.nextInt();
		System.out.println("a="+a);
		sc.close();
	}
}
