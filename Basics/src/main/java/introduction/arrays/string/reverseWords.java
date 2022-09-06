package introduction.arrays.string;

import java.util.Scanner;

public class reverseWords
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		reverseString(s);
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
		return(reverse);
	}
	public static void reverseString(String s)
	{
		String[] words=s.split(" ");
		String reversedString="";
		for (int i=0;i<words.length;i++)
	        { 
	           String reverseWord=reverse(words[i]);
	           reversedString=reversedString+reverseWord+" ";
	        }
		System.out.println(reversedString);
	}
}
