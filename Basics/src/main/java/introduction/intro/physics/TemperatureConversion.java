package introduction.intro.physics;
import java.util.Scanner;
public class TemperatureConversion 
{
	public static double convertTemperature(int ch,double temp)
	{
		double convertedTemperature=0;
		switch(ch)
		{
		case 0:convertedTemperature=(temp-32)*(5/9);
		break;
		case 1:convertedTemperature=(temp*(9/5))+32;
		break;
		}
		return convertedTemperature;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ch(0 or 1)=");
		int ch=sc.nextInt();
		if(ch==0)
		{
			System.out.println("Enter temperature in Fahrenheit:");
		}
		else if(ch==1)
		{
			System.out.println("Enter temperature in Celsius:");
		}
		double temp=sc.nextDouble();
		convertTemperature(ch,temp);
		if(ch==0)
		{
			System.out.println("Temperature in Celsius:"+convertTemperature(ch,temp));
		}
		else if(ch==1)
		{
			System.out.println("Temperature in Fahrenheit:"+convertTemperature(ch,temp));
		}
		sc.close();
	}
}
