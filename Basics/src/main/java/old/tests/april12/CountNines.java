package old.tests.april12;

public class CountNines 
{
	public static int countAllNines(int x,int y)
	{
		// ADD YOUR CODE HERE
		if(x<0||y<0)
		{
			return -1;
		}
		else if(x==0||y==0)
		{
			return -2;
		}
		int count=0,digit,number,start,end;
		if(x>y)
		{
			start=y;
			end=x;
		}
		else
		{
			start=x;
			end=y;
		}
		for(int i=start;i<=end;i++)
		{
			number=i;
			while(number>0)
			{
				digit=number%10;
				if(digit==9)
				{
					count++;
				}
				number=number/10;
			}
		}
		if(count==0)
		{
			return -3;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(countAllNines(79,99));
		System.out.println(countAllNines(900,898));
		System.out.println(countAllNines(9002223,89232));
		System.out.println(countAllNines(-2,-4));
		System.out.println(countAllNines(10,15));
		
			
	}
}
