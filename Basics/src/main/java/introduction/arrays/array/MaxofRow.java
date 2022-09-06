package introduction.arrays.array;

import java.util.Scanner;

public class MaxofRow 
{
	public static void getMaxRow(float matrix[][],int r,int c)
	{
		float max=0;
		int row=0;
		int column=0;
        for(row=0;row<r;row++) 
        {
            for(column=0;column<c;column++) 
            { 
            	if(matrix[row][column]>max)
            	{
            		max=matrix[row][column];
            	}	
            }
            System.out.println("Maximum of row: "+(row+1)+" is "+max);
            max=0;
        }
        
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int r=sc.nextInt();
		System.out.println("Enter Number of Columns");
		int c=sc.nextInt();
		float[][] matrix=new float[r][c];
		for(int row=0;row<r;row++)
		{
			for(int column=0;column<c;column++)
			{
				System.out.println("Enter value of element in matrix at row :"+(row+1)+" column :"+(column+1));
				matrix[row][column]=sc.nextInt();
			}
		}
		System.out.println("Given matrix is ");
		for(int row=0;row<r;row++)
		{
			for(int column=0;column<c;column++)
			{
				System.out.print(matrix[row][column]+" ");
			}
			System.out.println();
		}
		getMaxRow(matrix,r,c);
		sc.close();
	}
}
