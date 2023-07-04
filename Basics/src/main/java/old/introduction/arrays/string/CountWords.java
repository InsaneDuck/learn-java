package old.introduction.arrays.string;

import java.util.Scanner;

public class CountWords
{
	public static void countWords(String a)
	{
		int count=0;
		String[] s=a.split(" ");
		for (int i=0;i<s.length;i++)
		{
			if (!s[i].isEmpty())
			{
				count++;
			}
		}
 		System.out.println("Number of words="+count);
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		countWords(s);
		sc.close();
	}
}
