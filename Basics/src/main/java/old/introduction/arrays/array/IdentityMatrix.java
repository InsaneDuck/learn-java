package old.introduction.arrays.array;

import java.util.Scanner;

public class IdentityMatrix     
{    
    public static void isIdentity(float matrix[][],int r,int c)
    {
    	boolean flag=true;
        if(r!=c)
        {    
            System.out.println("Matrix should be a square matrix");    
        }    
        else 
        {
            for(int row=0;row<r;row++)
            {    
                for(int column=0;column<c;column++)
                {    
                  if(row==column && matrix[row][column]!= 1)
                  {    
                      flag=false;    
                      break;    
                  }    
                  if(row!=column && matrix[row][column]!=0)
                  {    
                      flag=false;    
                      break;    
                  }    
                }    
            }   
            if(flag)    
                System.out.println("Given matrix is an identity matrix");    
            else    
                System.out.println("Given matrix is not an identity matrix");    
        }    
    } 
    public static void main(String[] args)
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
		sc.close();
		isIdentity(matrix,r,c);
    }
}    