package old.introduction.arrays.string;

import java.util.Scanner;

public class AllStringMethods
{
	public static void countString(String s)
	{
		int vowelcount=0;
		int consonantcount=0;
		int digitcount=0;
		int symbolcount=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isAlphabetic(c))
			{
				if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U'))
				{
					vowelcount++;
				}
				else
					consonantcount++;
			}
			else if(Character.isDigit(c))
			{
				digitcount++;
			}
			else
			{
				symbolcount++;
			}
		}
		System.out.println("Number of Vowels="+vowelcount);
		System.out.println("Number of Consonant="+consonantcount);
		System.out.println("Number of Digit="+digitcount);
		System.out.println("Number of Symbol="+symbolcount);
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		nextAlphabet(s);
		sc.close();
	}
	public static void nextAlphabet(String s)
	{
		String nextString="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='z')
			{
				c='a';
			}
			else if(c=='Z')
			{
				c='A';
			}
			else if(Character.isAlphabetic(c))
			{
				c++;
			}
			nextString=nextString+c;
		}
		System.out.println(nextString);
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
