package hackerrank;

import java.util.Scanner;

public class Solution
{
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		MyCalculator c=new MyCalculator();
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println("Enter power");
		int p=sc.nextInt();
		System.out.println(c.power(n, p));
		sc.close();
	}
}
