package old.introduction.objects.obj_student;

import java.util.Scanner;

public class StudentInfo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		student c20=new student();
		System.out.println("Enter number of students");
		int classsize=sc.nextInt();
		int ids[]=new int[classsize];
		String names[]=new String[classsize];
		int[][] marks=new int[classsize][5];
		for(int i=0;i<classsize;i++)
		{
			System.out.println("Enter id of roll number "+(i+1));
			ids[i]=sc.nextInt();
			c20.id=ids[i];
			System.out.println("Enter name of roll number "+(i+1));
			names[i]=sc.next();
			c20.name=names[i];
			for(int j=0;j<5;j++)
			{
				System.out.println("Enter marks of student "+(i+1)+" in subject "+(j+1));
				marks[i][j]=sc.nextInt();
				c20.subjects[j]=marks[i][j];
			}
			for(int j=0;j<5;j++)
			{
				System.out.println("Marks of student "+(i+1)+" in subject "+(j+1)+" are "+c20.subjects[j]);
			}
			System.out.println("Percentage of total marks for student "+(i+1)+" is "+c20.percentage()+"%");
			System.out.println();
		}
		sc.close();
	}
}
