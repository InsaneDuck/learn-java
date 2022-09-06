package introduction.arrays.array;

import java.util.Scanner;

public class ArraySearch 
{
	public static String getSearchElementIndex(int search,int arr[]) {
		String indices="";
		for(int index=0;index<arr.length;index++)
		{
			
			if(arr[index]==search)
				indices +=  index + " "; 
		}
		
		return indices;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("size :");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("Array elements : " + size);
		for(int i=0;i<size;i++) 
		{
			numbers[i]=sc.nextInt();			
		}
		System.out.println("Search Element : ");
		int se=sc.nextInt(); 						 
		String found = getSearchElementIndex(se,numbers);
		if(found.length()!= 0)
		{
			System.out.println("The element " + se + " found at : " + found);
			System.out.println(found.length());
		}	
		else
			System.out.println("The element was not found");
		sc.close();
		
	}
}
