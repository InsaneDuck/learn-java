package old.introduction.interfaces.basics;

public class Sample implements I1
{
	private int i,j;
	Sample()
	{
		
	}
	Sample(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public void print()
	{
		// TODO Auto-generated method stub
		System.out.println("i="+i+" ,j="+j);
	}
	
}
