package old.introduction.collections.collections_even_odd;
import java.util.ArrayList;
import java.util.Scanner;
public class CountEvenandOdd
{
	public static String EvenandOddCount(ArrayList<Integer> a)
	{
		int evencount=0,oddcount=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)%2==0)
				evencount++;
			else
				oddcount++;
		}
		return "Even Count="+evencount+"\nOdd Count="+oddcount;
	}
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
		System.out.println("How many values do you want to store in ArrayList");
		int size=sc.nextInt();
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println(a);
		System.out.println(EvenandOddCount(a));
		System.out.println(EvenandOddCountAlt(a));
		sc.close();
	}
}
