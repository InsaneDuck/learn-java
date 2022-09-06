package introduction.inheritence.player;

public class batman extends player
{
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int sixes;
	private int fours;
	batman()
	{
		
	}
	batman(String name,int rs,int c,int hc,int bf,int s,int f)
	{
		setName(name);
		this.runsScored=rs;
		this.centuries=c;
		this.halfCenturies=hc;
		this.ballsFaced=bf;
		this.sixes=s;
		this.fours=f;
	}
	public int getBallsFaced()
	{
		return ballsFaced;
	}
	public int getCenturies()
	{
		return centuries;
	}
	public int getFours()
	{
		return fours;
	}
	public int getHalfCenturies()
	{
		return halfCenturies;
	}
	public int getRunsScored()
	{
		return runsScored;
	}
	public int getRunsScoredInBoundaries()
	{
		return (4*fours+6*sixes);
	}
	public int getSixes()
	{
		return sixes;
	}
	public String getStrikeRate()
	{
		return Integer.toString((runsScored*100)/ballsFaced);
	}
	public void setBallsFaced(int ballsFaced)
	{
		this.ballsFaced = ballsFaced;
	}
	public void setCenturies(int centuries)
	{
		this.centuries = centuries;
	}
	public void setFours(int fours)
	{
		this.fours = fours;
	}
	public void setHalfCenturies(int halfCenturies)
	{
		this.halfCenturies = halfCenturies;
	}
	public void setRunsScored(int runsScored)
	{
		this.runsScored = runsScored;
	}
	public void setSixes(int sixes)
	{
		this.sixes = sixes;
	}
	@Override
	public String toString()
	{
		return  "Name="+name+", RunsScored="+runsScored+", BallsFaced="+ballsFaced+", Centuries="+centuries+
				", HalfCenturies"+halfCenturies+", Sixes="+sixes+", Fours="+fours+
				", StrikeRate="+getStrikeRate()+
				", RunsScoredInBoundaries="+getRunsScoredInBoundaries();
	}
}
