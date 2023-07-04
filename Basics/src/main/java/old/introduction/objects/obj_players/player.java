package old.introduction.objects.obj_players;

public class player
{
	static int idgenerator=0;
	private int playerid;
	private String name;
	private int runsScored;
	private int ballsFaced;
	private int sixes;
	private int fours;
	public player()
	{
		
	}
	public player(String n,int rs,int b,int s,int f)
	{	
		idgenerator++;
		playerid=idgenerator;
		name=n;
		runsScored=rs;
		ballsFaced=b;
		sixes=s;
		fours=f;
	}
	public int getID()
	{
		return playerid;
	}
	public String getName()
	{
		return name;
	}
	public int getRunsScoredInBoundaries()
	{
		return (4*fours+6*sixes);
	}
	public String getStrikeRate()
	{
		int strikerate=(runsScored*100)/ballsFaced;
		return Integer.toString(strikerate);
	}
	public void setID(int id)
	{
		playerid=id;
	}
	public void setName(String s)

	{
		name=s;
	}
	@Override
	public String toString()
	{
		return  "ID="+playerid+" Name="+name+" RunsScored="+runsScored+" BallsFaced="+ballsFaced+" Sixes="+sixes+" Fours="+fours+" StrikeRate="+getStrikeRate()+" RunsScoredInBoundaries="+getRunsScoredInBoundaries();
	}
}
