package old.introduction.arrays.string;

import java.util.Scanner;

public class avgWordcount
{
	public static float average(float sumofitems,float numberofitems)
	{
		float average=(sumofitems/numberofitems);
		return average;
	}
	public static int countLetters(String s)
	{
		int countletters=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isAlphabetic(c))
			{
				countletters++;
			}
		}
		return countletters;
	}
	public static int countWords(String s)
	{
		String[] str=s.split(" ");
		int wordcount=str.length;
		return wordcount;
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("Letter Count="+countLetters(s));
		System.out.println("Word Count="+countWords(s));
		System.out.println("Average Word length="+average(countLetters(s),countWords(s)));
		sc.close();
	}
}
