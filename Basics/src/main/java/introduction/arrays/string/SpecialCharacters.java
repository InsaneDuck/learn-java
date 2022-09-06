package introduction.arrays.string;

import java.util.Scanner;

public class SpecialCharacters
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		specialCharacters(s);
		sc.close();
	}
	public static void specialCharacters(String s)
	{
		
		String symbols="";
		String alphaNumeric="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isAlphabetic(c))
			{
				alphaNumeric+=c;
			}
			else if(Character.isDigit(c))
			{
				alphaNumeric+=c;
			}
			else
			{
				symbols+=c;
			}
		}
		System.out.println(symbols.concat(alphaNumeric));
	}
}
