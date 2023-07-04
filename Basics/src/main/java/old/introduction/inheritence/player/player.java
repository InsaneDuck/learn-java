package old.introduction.inheritence.player;

public class player
{
	private static int idgenerator=0;
	private int   id ;
	protected String  name;
	player()
	{
		
	}
	player(String name)
	{
		idgenerator++;
		id=idgenerator;
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
