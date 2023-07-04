package old.introduction.exceptions.demo;

import java.util.Scanner;

public class Voting
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		sc.close();
		if(age<18)
		{
			throw new Exception();	
		}
		else
		{
			System.out.println("Eligible for voting");
		}
	}
}
