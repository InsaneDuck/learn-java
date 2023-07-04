package old.introduction.intro.physics;


public class MinYears {
	public static void main(String arg[]) {
	int mins=3000010;
	int years=mins/525600;
	int mins1=mins%525600; //mins1 is remaining minutes after calculating years
	int days=mins1/1440;
	int mins2=mins1%1440;  //mins2 is remaining minutes after calculating days
	int hours=mins2/60;
	int min3=mins2%60;     //mins3 is remaining minutes after calculating hours
	int minutes=min3;
	System.out.println("Given minutes has "+years+" years "+days+" days "+hours+" hours and "+minutes+" minutes");
}
}
