package old.tests.march15;
public class ProductPanlindrome {

	public static void main(String[] args) {
		final int START = 10;
		final int END = 100;
		System.out.println(ProductPanlindrome.getCount(START, END));
	}

	public static int getCount(int start, int end) 
	{
		int number,reversenumber=0,palindromecount=0;
		for(int x=start;x<=end;x++)
		{
			for(int y=start;y<=end;y++)
			{
				number=x*y;
				reversenumber=getReverse(number); //we are reversing using another method or else it will change the value of number 
		        if (number==reversenumber)
		            palindromecount++;
			}
		}
		return palindromecount;
	}
	public static int getReverse(int number)
	{
		int remainder;
		int reversenumber=0;
		while(number!=0)
        {
            remainder=number%10;
            reversenumber=reversenumber*10+remainder;
            number=number/10;
        }
		return reversenumber;
	}
}