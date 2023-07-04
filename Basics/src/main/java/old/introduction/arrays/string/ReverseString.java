package old.introduction.arrays.string;

import java.util.Scanner;

public class ReverseString
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		reverse(s);
		sc.close();
	}
	public static void reverse(String s)
	{
		int length = s.length();
		String reverse="";
		for (int index=(length-1);index>=0;index--) 
		{
			reverse=reverse+s.charAt(index);
		}
		System.out.println(reverse);
	}
}