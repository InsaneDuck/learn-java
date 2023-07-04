package old.introduction.arrays.string;

import java.util.Scanner;

public class PalindromeString
{
	public static void isPalindrome(String s)
	{
		String reverse=reverse(s);
		if(s.equals(reverse))
		{
			System.out.println("Is Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		isPalindrome(s);
		sc.close();
	}
	public static String reverse(String s)
	{
		int length = s.length();
		String reverse="";
		for (int index=(length-1);index>=0;index--) 
		{
			reverse=reverse+s.charAt(index);
		}
		return reverse;
	}
}
