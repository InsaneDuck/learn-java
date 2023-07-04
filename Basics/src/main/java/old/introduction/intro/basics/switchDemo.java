package old.introduction.intro.basics;

public class switchDemo 
{
	public static void main(String arg[])
	{
		char var='b';
		switch(var)
		{
		case 'a':System.out.println("a");
		break;
		case 'A':System.out.println("A");
		break;
		case 'b':System.out.println("b");
		break;
		case 'B':System.out.println("B");
		break;
		default:System.out.println("Default Statement");
		}
	}
}
