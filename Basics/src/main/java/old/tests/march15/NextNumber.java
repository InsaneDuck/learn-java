package old.tests.march15;
public class NextNumber 
{
	public static void main(String[] args) {
		System.out.println(NextNumber.nextNum(12465));
		System.out.println(NextNumber.nextNum(111222));

		System.out.println(NextNumber.nextNum(12465));
		System.out.println(NextNumber.nextNum(12466));
		System.out.println(NextNumber.nextNum(13575));
		System.out.println(NextNumber.nextNum(123456));

	}

	public static int nextNum(int num) {
		int i=num;
		int i1=i/100000;//first digit of input
		int i11=i%100000;
		int i2=i11/10000;//second digit of input
		int i22=i11%10000;
		int i3=i22/1000;//third digit of input
		int i33=i22%1000;
		int i4=i33/100;//fourth digit of input
		int i44=i33%100;
		int i5=i44/10;//five digit of input
		int i55=i44%10;//sixth digit of input
		int evencount=0;
		int oddcount=0;
		int num1;
		if(i1!=0) 
		{
			int a=i1%2;
			if(a==0)
				evencount++;
			else
				oddcount++;
		}
		else
		{
			evencount=0;
		}
		int b=i2%2;
		if(b==0)
		{
			evencount++;
		}	
		else
		{
			oddcount++;
		}	
		int c=i3%2;
		if(c==0)
		{
			evencount++;
		}	
		else
		{
			oddcount++;
		}	
		int d=i4%2;
		if(d==0)
		{
			evencount++;
		}	
		else
		{
			oddcount++;
		}
		int e=i5%2;
		if(e==0)
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
		int f=i55%2;
		if(f==0)
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
		if(evencount==oddcount)
			num1=i;
		else
		{if(evencount>oddcount) 
		{
			int evencheck=i%2;
			if(evencheck==0)
				num1=i+2;
			else
				num1=i+1;
		}
		else
		{
			num1=i+2;
		}
		num=num1;
		}
		return num;
	}
}
