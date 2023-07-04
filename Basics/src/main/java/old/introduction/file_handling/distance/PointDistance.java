package old.introduction.file_handling.distance;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PointDistance
{
	
	public static double calculateDistance(points a,points b)
	{
		int x1=a.getX();
		int y1=a.getY();
		int x2=b.getX();
		int y2=b.getY();
		double d=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		return d;
	}

	public static points createPoint(String line)
	{
		String details[]=line.split(",");
		String point=details[0];
		int x=Integer.parseInt(details[1]);
		int y=Integer.parseInt(details[2]);
		points p=new points(point,x,y);
		return p;
	}
	public static void main(String[] args) throws IOException
	{
		FileReader reader=new FileReader("files\\distance\\Points.csv");
		BufferedReader buffer=new BufferedReader(reader);
		String line=buffer.readLine();
		System.out.println(line);
		List<points> pointlist=new ArrayList<points>();
		List<Double> distance=new ArrayList<Double>();
		Map<String,Double> mapd=new HashMap<String,Double>();
		line=buffer.readLine();
		while(line!=null)
		{
			pointlist.add(createPoint(line));
			line=buffer.readLine();
		}
		reader.close();
		buffer.close();
		for(points s:pointlist)
		{
			System.out.println(s);
		}
		for(int i=0;i<pointlist.size();i++)
		{
			for(int j=0;j<pointlist.size();j++)
			{
				if(i!=j)
				{
					String p=pointlist.get(i).toString()+pointlist.get(j).toString();
					double d=calculateDistance(pointlist.get(i),pointlist.get(j));
					mapd.put(p, d);
					distance.add(d);
				}
			}
		}
		System.out.println(distance);
		Collections.sort(distance);
		System.out.println(distance);
		
	}
}
