package old.introduction.file_handling.distance;

public class points
{
	String point;
	private int x;
	private int y;
	public points(String point, int x, int y)
	{
		super();
		this.point = point;
		this.x = x;
		this.y = y;
	}
	public String getPoint()
	{
		return point;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void setPoint(String point)
	{
		this.point = point;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	@Override
	public String toString()
	{
		return point+"("+x+","+y+")";
	}
}
