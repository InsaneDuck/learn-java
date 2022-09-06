package introduction.interfaces.interface_library;

import java.util.Scanner;

public class LibraryInterfaceDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int age;
		String booktype=null;
		System.out.println("Enter type of user\n1.Kids\n2.Adult");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter age:");
			age=sc.nextInt();
			System.out.println("Enter booktype:\n1.kids\n2.fiction");
			int option2=sc.nextInt();
			if(option2==1)
			{
				booktype="kids";
			}
			else if(option2==2)
			{
				booktype="fiction";
			}
			else
			{
				System.out.println("Invalid Option");
			}
			kidUsers k=new kidUsers(age,booktype);
			k.registerAccount();
			k.requestBook();
		}
		else if(option==2)
		{
			System.out.println("Enter age:");
			age=sc.nextInt();
			System.out.println("Enter booktype:\n1.kids\n2.fiction");
			int option2=sc.nextInt();
			if(option2==1)
			{
				booktype="kids";
			}
			else if(option2==2)
			{
				booktype="fiction";
			}
			else
			{
				System.out.println("Invalid Option");
			}
			AdultUser k=new AdultUser(age,booktype);
			k.registerAccount();
			k.requestBook();
		}
		else
		{
			System.out.println("Invalid option");
		}
	}
}
