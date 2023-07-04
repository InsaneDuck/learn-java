package old.introduction.arrays.string;

import java.util.Scanner;

public class FullName
   {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Name :");
			String firstname=sc.nextLine();
			System.out.println("Enter Last Name :");
			String lastname=sc.nextLine();
			String fullname="";
			fullname=firstname.concat(" "+lastname);
			System.out.println("Full Name :"+fullname);
			sc.close();
			}
	}