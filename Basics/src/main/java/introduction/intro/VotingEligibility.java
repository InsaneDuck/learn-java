package introduction.intro;

import java.util.Scanner;
public class VotingEligibility 
{
	public static String isEligible(int age)
	{
		String result="";
		if(age>=18)
		{
			result="Eligible for Voting";
		}
		else
		{
			result="Not Eligible for Voting";
		}
		return result;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age=");
		int age=sc.nextInt();
		String eligibility=isEligible(age);
		System.out.println(eligibility);
		sc.close();
	}
}
