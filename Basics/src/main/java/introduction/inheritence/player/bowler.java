package introduction.inheritence.player;

public class bowler extends player
{
	private int ballsBowled;
	private int runsLeaked;
	private int wickets;
	public bowler()
	{
		
	}
	public bowler(String name,int bb,int rl,int w)
	{
		setName(name);
		ballsBowled=bb;
		runsLeaked=rl;
		wickets=w;
	}
	public int getBallsBowled()
	{
		return ballsBowled;
	}
	public int getRunsLeaked()
	{
		return runsLeaked;
	}
	public String getStrikeRate()
	{
		return Integer.toString((ballsBowled/wickets));
	}
	public int getWickets()
	{
		return wickets;
	}
	public void setBallsBowled(int ballsBowled)
	{
		this.ballsBowled = ballsBowled;
	}
	public void setRunsLeaked(int runsLeaked)
	{
		this.runsLeaked = runsLeaked;
	}
	public void setWickets(int wickets)
	{
		this.wickets = wickets;
	}
	@Override
	public String toString()
	{
		return "Bowler[Name:"+name+", ballsBowled="+ballsBowled+", runsLeaked ="+runsLeaked+
				",wickets ="+wickets+",StrikeRate="+getStrikeRate()+"]";
	}
}
