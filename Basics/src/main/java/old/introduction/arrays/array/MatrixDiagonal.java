package old.introduction.arrays.array;

import java.util.Scanner;

public class MatrixDiagonal
{
	public static void getleftDiagonal(float matrix[][],int r,int c)
	{
		String diagonal="";
		for(int row=0;row<r;row++)
		{
			for(int column=0;column<c;column++)
			{
				if(row==column)
				{
					diagonal=diagonal+","+matrix[row][column];
				}
			}
		}
		System.out.println("Left diagonal values of given matrix is "+diagonal);
	}
	public static void getrightDiagonal(float matrix[][],int r,int c)
	{
		String diagonal="";
		for(int row=0;row<r;row++)
		{
			for(int column=0;column<c;column++)
			{
				if(row+column==(c-1))
				{
					diagonal=diagonal+","+matrix[row][column];
				}
			}
		}
		System.out.println("Right diagonal values of given matrix is "+diagonal);
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
		getleftDiagonal(matrix,r,c);
		getrightDiagonal(matrix,r,c);
		sc.close();
	}
}
