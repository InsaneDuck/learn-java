package old.introduction.intro.basics;
import java.util.Scanner;

public class MathOperations
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		boolean choice;
		do
		{
			System.out.println("Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n6.Power");
			System.out.println("Enter operation to be performed");
			int option=sc.nextInt();
			System.out.println("Enter two numbers");
			double n1=sc.nextDouble();
			double n2=sc.nextDouble();
			switch(option)
			{
			case 1:System.out.println("Addition of "+n1+","+n2+"="+(n1+n2));
			break;
			case 2:System.out.println("Subtraction of "+n1+","+n2+"="+(n1-n2));
			break;
			case 3:System.out.println("Multiplication of "+n1+","+n2+"="+(n1*n2));
			break;
			case 4:System.out.println("Division of "+n1+","+n2+"="+(n1/n2));
			break;
			case 5:System.out.println("Remainder of "+n1+"when divided by"+n2+"="+(n1%n2));
			break;
			case 6:System.out.println("Power of "+n1+","+n2+"="+Math.pow(n1,n2));
			break;
			default:System.out.println("Invalid input");
			}
			System.out.println("Do you want to continue (true or false)");
			choice=sc.nextBoolean();
		}
		while(choice==true);
		sc.close();
	}
}
