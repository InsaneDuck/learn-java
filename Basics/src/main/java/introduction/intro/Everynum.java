package introduction.intro;

import java.util.Scanner;
public class Everynum {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for i=");
		int i=sc.nextInt();
		int i1=i/100000;
		int i11=i%100000;
		int i2=i11/10000;
		int i22=i11%10000;
		int i3=i22/1000;
		int i33=i22%1000;
		int i4=i33/100;
		int i44=i33%100;
		int i5=i44/10;
		int i55=i44%10;
		int i6=i55;
		System.out.println("i1="+i1+"\ni2="+i2+"\ni3="+i3+"\ni4="+i4+"\ni5="+i5+"\ni6="+i6);
		int evencount=0;
		int oddcount=0;
		int num;
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
		System.out.println("evencount="+evencount+"\noddcount="+oddcount);
		if(evencount>oddcount) 
		{
			int evencheck=i%2;
			if(evencheck==0)
				num=i+2;
			else
				num=i+1;
		}
		else
		{
			num=i+2;
		}
		System.out.println("number="+num);
		sc.close();
	}

}
