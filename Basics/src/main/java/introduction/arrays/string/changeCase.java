package introduction.arrays.string;

import java.util.Scanner;

public class changeCase
{
	public static void changecase(String str)
	{   
		char c;
        for(int i=0;i<str.length();i++) 
        {
        	c=str.charAt(i);
        	if(Character.isLowerCase(c))
        	{
        		System.out.print(Character.toUpperCase(c));
        	}
        	else if(Character.isUpperCase(c))
        	{    
            	System.out.print(Character.toLowerCase(c));
        	}
        	else
        	{
        		System.out.print(c);
        	}
            
        }   
    }
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		changecase(s);
		sc.close();
	}   
}
