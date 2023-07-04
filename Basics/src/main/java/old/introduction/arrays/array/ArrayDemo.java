package old.introduction.arrays.array;

import java.util.Scanner;

public class ArrayDemo 
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter array size");
			int index=sc.nextInt();
			float value[]=new float[index];
			int i;
			for(i=0;i<index;i++)
			{
				System.out.println("Enter value of array in "+(i+1)+" position");
				value[i]=sc.nextFloat();
			}
			System.out.println("Elements in array");
			for(i=0;i<index;i++)
			{
				System.out.println(value[i]);
			}
			sc.close();
		}
	}
}
