package old.introduction.arrays.array;

import java.util.Scanner;

public class UniqueNumbers
{
	public static void main (String[] args) 
	{
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("size :");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Array elements : " + size);
			for(int i=0;i<size;i++) 
			{
				arr[i]=sc.nextInt();			
			}   
			int i;    
			System.out.print("The array is: ");    
			for (i=0;i<size;++i)       
				System.out.print(arr[i] + " "); 
			 
			String res = "";
			for(int x = 0 ; x < arr.length; x++) 
			{
				int count = 0;
				for(int y = 0; y < arr.length; y++) 
				{
					if(arr[x] == arr[y])
						count ++;
				}
				
				if(count == 1)
					res += " " + arr[x];
			}
			System.out.print("\nUnique numbers of above array are: "+res);
			sc.close();
		}
	}
}