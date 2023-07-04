package old.introduction.interfaces.interface_bill;

import java.util.Scanner;

public class CalculateBillAmount 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which bill you want to generate:");
		System.out.println("1:Water");
		System.out.println("2:Electricity");
		int option=sc.nextInt();
		System.out.println("Enter Number of units consumed");
		int units=sc.nextInt();
		if(option==1)
		{
			WBill.units=units;
			WBill.displayBill();
		}
		else if(option==2)
		{
			EBill.units=units;
			EBill.displayBill();
		}
		else
		{
			System.out.println("Invalid Selection");
		}
		sc.close();
	}
}
