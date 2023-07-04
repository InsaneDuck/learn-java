package old.introduction.file_handling.cricket;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class cricket
{
	public static matches addMatchToList(String line)
	{
		String matchdetails[]=line.split(",");
		for(String s:matchdetails)
		{
			System.out.println(s);
		}
		int matchid=Integer.parseInt(matchdetails[0]);
		int season=Integer.parseInt(matchdetails[1]);
		String city=matchdetails[2].trim();
		String date=matchdetails[3].trim();
		String team1=matchdetails[4].trim();
		String team2=matchdetails[5].trim();
		String tosswinner=matchdetails[6].trim();
		String tossdecision=matchdetails[7].trim();
		String result=matchdetails[8].trim();
		String winner="";
		try
		{
			winner=matchdetails[9].trim();
		}
		catch(Exception e)
		{
			winner="no result";
		}
		matches m=new matches(matchid,season,city,date,team1,team2,
								tosswinner,tossdecision,result,winner);
		return m;
	}
	public static void main(String[] args) throws IOException
	{
		FileReader matchreader=new FileReader("files\\cricket\\matches.csv");
		BufferedReader matchbuffer=new BufferedReader(matchreader);
		List<matches> matchlist=new ArrayList<matches>();
		String line=matchbuffer.readLine();
		System.out.println(line);
		line=matchbuffer.readLine();
		System.out.println(line);
		while(line!=null)
		{
			matchlist.add(addMatchToList(line));
			line=matchbuffer.readLine();
		}
		matchbuffer.close();
		matchreader.close();
		for(matches m:matchlist)
		{
			System.out.println(m);
		}
	}
}
