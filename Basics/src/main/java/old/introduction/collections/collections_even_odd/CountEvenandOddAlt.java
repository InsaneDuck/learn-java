package old.introduction.collections.collections_even_odd;

import java.util.ArrayList;
import java.util.Scanner;

public class CountEvenandOddAlt
{
	public static String EvenandOddCountAlt(ArrayList<Integer> a)
	//for each loop
	{
		int evencount=0,oddcount=0;
		for(Integer element:a)
		{
			if(element%2==0)
				evencount++;
			else
				oddcount++;
		}
		return "Even Count="+evencount+"\nOdd Count="+oddcount;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.println("Enter Integer values,Enter exit to exit");
		while(sc.hasNextInt())
		{
				a.add(sc.nextInt());
		}
		System.out.println(a);
		System.out.println(EvenandOddCountAlt(a));
		sc.close();
	}
}
