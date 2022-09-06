package introduction.collections.set_demo.demo;

import java.util.HashSet;
import java.util.Set;

public class MovieInfo
{
	public static void main(String[] args)
	{
		Movie m1=new Movie("Name1","Director1",1,1);
		Movie m2=new Movie("Name2","Director2",2,2);
		Movie m3=new Movie("Name3","Director3",3,3);
		Movie m4=new Movie("Name4","Director4",4,4);
		Movie m5=new Movie("Name5","Director5",5,5);
		Set<Movie> s1=new HashSet<Movie>();
		s1.add(m1);
		s1.add(m2);
		s1.add(m3);
		s1.add(m4);
		s1.add(m5);
		System.out.println(s1);
	}
}
