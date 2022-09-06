package tests;
public class CountNines {
	public static int getCountNines(int a, int b) {
		if(a<0||b<0)
		{
			return -1;
		}
		else if(a==0||b==0)
		{
			return -2;
		}
		int count=0,digit,number,start=0,end=0;
		if(a<b)
		{
			start=a;
			end=b;
		}
		else if(a>b)
		{
			start=b;
			end=a;
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

	public static void main(String[] args) {
		System.out.println(getCountNines(30, 20));

	}

}