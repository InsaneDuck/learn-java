package old.introduction.file_handling.cricket;

public class deliveries
{
	int matchid;
	int inning;
	String batting;
	String bowling;
	int over;
	int ball;
	String batman;
	String bowler;
	int wideruns;
	int byeruns;
	int legbyeruns;
	int noballruns;
	int penaltyruns;
	int batmanruns;
	int extraruns;
	int totalruns;
	public deliveries(int matchid, int inning, String batting, String bowling, int over, int ball, String batman,
			String bowler, int wideruns, int byeruns, int legbyeruns, int noballruns, int penaltyruns, int batmanruns,
			int extraruns, int totalruns)
	{
		super();
		this.matchid = matchid;
		this.inning = inning;
		this.batting = batting;
		this.bowling = bowling;
		this.over = over;
		this.ball = ball;
		this.batman = batman;
		this.bowler = bowler;
		this.wideruns = wideruns;
		this.byeruns = byeruns;
		this.legbyeruns = legbyeruns;
		this.noballruns = noballruns;
		this.penaltyruns = penaltyruns;
		this.batmanruns = batmanruns;
		this.extraruns = extraruns;
		this.totalruns = totalruns;
	}
	public int getBall()
	{
		return ball;
	}
	public String getBatman()
	{
		return batman;
	}
	public int getBatmanruns()
	{
		return batmanruns;
	}
	public String getBatting()
	{
		return batting;
	}
	public String getBowler()
	{
		return bowler;
	}
	public String getBowling()
	{
		return bowling;
	}
	public int getByeruns()
	{
		return byeruns;
	}
	public int getExtraruns()
	{
		return extraruns;
	}
	public int getInning()
	{
		return inning;
	}
	public int getLegbyeruns()
	{
		return legbyeruns;
	}
	public int getMatchid()
	{
		return matchid;
	}
	public int getNoballruns()
	{
		return noballruns;
	}
	public int getOver()
	{
		return over;
	}
	public int getPenaltyruns()
	{
		return penaltyruns;
	}
	public int getTotalruns()
	{
		return totalruns;
	}
	public int getWideruns()
	{
		return wideruns;
	}
	public void setBall(int ball)
	{
		this.ball = ball;
	}
	public void setBatman(String batman)
	{
		this.batman = batman;
	}
	public void setBatmanruns(int batmanruns)
	{
		this.batmanruns = batmanruns;
	}
	public void setBatting(String batting)
	{
		this.batting = batting;
	}
	public void setBowler(String bowler)
	{
		this.bowler = bowler;
	}
	public void setBowling(String bowling)
	{
		this.bowling = bowling;
	}
	public void setByeruns(int byeruns)
	{
		this.byeruns = byeruns;
	}
	public void setExtraruns(int extraruns)
	{
		this.extraruns = extraruns;
	}
	public void setInning(int inning)
	{
		this.inning = inning;
	}
	public void setLegbyeruns(int legbyeruns)
	{
		this.legbyeruns = legbyeruns;
	}
	public void setMatchid(int matchid)
	{
		this.matchid = matchid;
	}
	public void setNoballruns(int noballruns)
	{
		this.noballruns = noballruns;
	}
	public void setOver(int over)
	{
		this.over = over;
	}
	public void setPenaltyruns(int penaltyruns)
	{
		this.penaltyruns = penaltyruns;
	}
	public void setTotalruns(int totalruns)
	{
		this.totalruns = totalruns;
	}
	public void setWideruns(int wideruns)
	{
		this.wideruns = wideruns;
	}
	@Override
	public String toString()
	{
		return "deliveries [matchid=" + matchid + ", inning=" + inning + ", batting=" + batting + ", bowling=" + bowling
				+ ", over=" + over + ", ball=" + ball + ", batman=" + batman + ", bowler=" + bowler + ", wideruns="
				+ wideruns + ", byeruns=" + byeruns + ", legbyeruns=" + legbyeruns + ", noballruns=" + noballruns
				+ ", penaltyruns=" + penaltyruns + ", batmanruns=" + batmanruns + ", extraruns=" + extraruns
				+ ", totalruns=" + totalruns + "]";
	}
}
