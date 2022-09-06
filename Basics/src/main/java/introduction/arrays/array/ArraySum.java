package introduction.arrays.array;

import java.util.Scanner;

public class ArraySum 
{
	public static void main(String arg[])
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter array size");
			int index=sc.nextInt();
			float value[]=new float[index];
			int i;
			for(i=0;i<index;i++)
			{
				System.out.println("Enter value of array in position "+(i+1));
				value[i]=sc.nextFloat();
			}
			double sum=0;
			for(i=0;i<index;i++)
			{
				sum=sum+value[i];
			}
			System.out.println("Sum of elements in array="+sum);
			sc.close();
		}
	}
}
