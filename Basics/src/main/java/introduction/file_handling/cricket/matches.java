package introduction.file_handling.cricket;

public class matches
{
	int matchid;
	int season;
	String city;
	String date;
	String team1;
	String team2;
	String tosswinner;
	String tossdecision;
	String result;
	String winner;
	public matches(int matchid, int season, String city, String date, String team1, String team2, String tosswinner,
			String tossdecision, String result, String winner)
	{
		super();
		this.matchid = matchid;
		this.season = season;
		this.city = city;
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
		this.tosswinner = tosswinner;
		this.tossdecision = tossdecision;
		this.result = result;
		this.winner = winner;
	}
	public String getCity()
	{
		return city;
	}
	public String getDate()
	{
		return date;
	}
	public int getMatchid()
	{
		return matchid;
	}
	public String getResult()
	{
		return result;
	}
	public int getSeason()
	{
		return season;
	}
	public String getTeam1()
	{
		return team1;
	}
	public String getTeam2()
	{
		return team2;
	}
	public String getTossdecision()
	{
		return tossdecision;
	}
	public String getTosswinner()
	{
		return tosswinner;
	}
	public String getWinner()
	{
		return winner;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	public void setMatchid(int matchid)
	{
		this.matchid = matchid;
	}
	public void setResult(String result)
	{
		this.result = result;
	}
	public void setSeason(int season)
	{
		this.season = season;
	}
	public void setTeam1(String team1)
	{
		this.team1 = team1;
	}
	public void setTeam2(String team2)
	{
		this.team2 = team2;
	}
	public void setTossdecision(String tossdecision)
	{
		this.tossdecision = tossdecision;
	}
	public void setTosswinner(String tosswinner)
	{
		this.tosswinner = tosswinner;
	}
	public void setWinner(String winner)
	{
		this.winner = winner;
	}
	@Override
	public String toString()
	{
		return "matches [matchid=" + matchid + ", season=" + season + ", city=" + city + ", date=" + date + ", team1="
				+ team1 + ", team2=" + team2 + ", tosswinner=" + tosswinner + ", tossdecision=" + tossdecision
				+ ", result=" + result + ", winner=" + winner + "]";
	}
}
