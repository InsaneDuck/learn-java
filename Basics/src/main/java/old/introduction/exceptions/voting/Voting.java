package old.introduction.exceptions.voting;

import java.util.Scanner;

public class Voting
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		int age=s.nextInt();
		s.close();
		if(age<18)
		{
			try
			{
				throw new AgeInvalidException("Age must be >=18");
			}
			catch(AgeInvalidException e)
			{
				e.printStackTrace();
			}
		}
		else
			System.out.println("Eligible for voting");
	}
}
