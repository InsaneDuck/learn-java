package everyonecancode;

public class Armstrong01
{
    public static void main(String[] args)
    {
        int num1 = 100;
        int num2 = 10000000;
        System.out.print(generateArmstrongNums(num1, num2));
    }
    public static String generateArmstrongNums(int start, int limit)
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
    		for(int i=start;i<limit;i++)
        	{
        		if(isArmstrong(i))
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
    public static boolean isArmstrong(int num)
    {
        //ADD YOUR CODE HERE
    	return num==sumOfPowersOfDigits(num);
    }
    public static int sumOfPowersOfDigits(int n)
    {
        //ADD YOUR CODE HERE
    	int sum=0;
    	int digits[]=getDigits(n);
    	for(int i=0;i<digits.length;i++)
    	{
    		sum=sum+power(digits[i],digits.length);
    	}
    	return sum;
    }
    public static int[] getDigits(int n)
    {
        //ADD YOUR CODE HERE
    	String num=Integer.toString(n);
    	int[] digits=new int[num.length()];
    	for(int i=0;i<num.length();i++)
    	{
    		digits[i]=n%10;
    		n=n/10;
    	}
    	return digits;
    }
    public static int power(int d, int p)
    {
        //ADD YOUR CODE HERE
    	int power=1;
    	for(int i=1;i<=p;i++)
    	{
    		power=power*d;
    	}
    	return power;
    }
}
