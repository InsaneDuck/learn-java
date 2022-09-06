package hackerrank;

public class MyCalculator
{
	MyCalculator()
	{
		
	}
	long power(int n,int p) throws Exception
	{
		if(n<0||p<0)
		{
			throw new Exception("n or p should not be negative");
		}
		else if(n==0||p==0)
		{
			throw new Exception("n or p should not be zero");
		}
		else
		{
			return (long) Math.pow(n, p);
		}
	}
}
