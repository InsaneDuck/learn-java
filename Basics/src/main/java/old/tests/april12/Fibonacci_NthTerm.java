package old.tests.april12;

public class Fibonacci_NthTerm 
{

	public static void main(String[] args) 
	{
		System.out.println(getNthTermOfFibonacciSeries(10));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) 
	{
		// ADD YOUR CODE HERE
		if ((nthTerm-1)<=1) 
            return -1; 
        return getNthTermOfFibonacciSeries(nthTerm-1)+getNthTermOfFibonacciSeries(nthTerm-2);
	}


}
