package introduction.intro;

import java.util.Scanner;
public class itemPrice
{
	public static double discountedPrice(double p)
	{
		double discountedprice=0.0d;
		if(p<10000)
		{
			discountedprice=p-(p*0.1d);
		}
		else if(p<20000)
		{
			discountedprice=p-(p*0.2d);
		}
		else
		{
			discountedprice=p-(p*0.25d);
		}
		return discountedprice;	
	}
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price of the item:");
		double price=sc.nextDouble();
		System.out.println("Final price after discont="+discountedPrice(price));
		sc.close();
	}
}
