package introduction.inheritence.demo;

public class Derived extends Base
{
	int j;
	Derived()
	{
		
	}
	Derived(int i,int j)
	{
		super(i); //super calls to Base(int i) because derived extends base
		this.j=j; 
	}
}
