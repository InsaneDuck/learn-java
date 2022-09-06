package introduction.arrays.array;

import java.util.Scanner;

public class SumofRows
{
	public static void getRowSum(float[][] matrix,int r,int c)
	{
		for(int row=0;row<r;row++)
		{
			float sum=0;
			for(int column=0;column<c;column++)
			{
				sum=sum+matrix[row][column];
				System.out.print("Sum of values in row :"+(row+1)+" is "+sum);
			}
			System.out.println();
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
		getRowSum(matrix,r,c);
		sc.close();
	}
}
