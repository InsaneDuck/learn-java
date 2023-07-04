package old.everyonecancode;

import java.util.Scanner;

public class OddPalindromes01 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Limits:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(generateOddPalindromes(num1, num2));
        sc.close();
    }

    public static String generateOddPalindromes(int start, int limit) 
    {
        //ADD YOUR CODE HERE
    	String result="";
    	if(start<=0 || limit<=0)
		{
			return "-1";
		}
    	else if(start>=limit)
		{
			return "-2";
			
		}
    	else
    	{
    		for(int i=start;i<=limit;i++)
        	{
        		if(isPalindrome(i) && isAllDigitsOdd(i))
        		{
        			result=result+","+i;
        		}
        	}
    	}
		if(result.length()==0)
		{
			return "-3";
			
		}
    	return result.substring(1);
    }

    public static boolean isPalindrome(int num) 
    {
        //ADD YOUR CODE HERE
    	int r=reverse(num);
    	return(num==r);
    }

    public static int reverse(int num) 
    {
        //ADD YOUR CODE HERE
    	int reverse=0;
		while (num>0)
		{
			int remainder = num%10;
            reverse=reverse*10+remainder;
            num/=10;
		}
		return reverse;
    }

    public static boolean isAllDigitsOdd(int num) 
    {
        //ADD YOUR CODE HERE
    	int reverse=reverse(num);
    	while (reverse>0)
		{
			int digit=reverse%10;
			if(digit%2==0 && digit!=0)
			{
				return false;
			}
			reverse=reverse/10;
		}
    	return true;
    }
}

