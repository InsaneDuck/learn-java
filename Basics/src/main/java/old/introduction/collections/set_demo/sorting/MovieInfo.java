package old.introduction.collections.set_demo.sorting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MovieInfo
{
	public static void main(String[] args)
	{
		Movie m1=new Movie("Name2","Director7",120,5);
		Movie m2=new Movie("Name1","Director3",150,4);
		Movie m3=new Movie("Name4","Director5",180,4);
		Movie m4=new Movie("Name5","Director1",210,2);
		Movie m5=new Movie("Name3","Director2",60,3);
		Set<Movie> s1=new HashSet<Movie>();
		s1.add(m1);
		s1.add(m2);
		s1.add(m3);
		s1.add(m4);
		s1.add(m5);
		for(Movie m:s1)
		{
			System.out.println(m);
		}
		System.out.println("---------------------------------------");
		System.out.println("Sorting by Name");
		NameSort nsort= new NameSort();
		Set<Movie> s2=new TreeSet<Movie>(nsort);
		s2.add(m1);
		s2.add(m2);
		s2.add(m3);
		s2.add(m4);
		s2.add(m5);
		for(Movie m:s2)
		{
			System.out.println(m);
		}
		System.out.println("---------------------------------------");
		System.out.println("Sorting by Director");
		DirectorSort dsort= new DirectorSort();
		Set<Movie> s3=new TreeSet<Movie>(dsort);
		s3.add(m1);
		s3.add(m2);
		s3.add(m3);
		s3.add(m4);
		s3.add(m5);
		for(Movie m:s3)
		{
			System.out.println(m);
		}
		System.out.println("---------------------------------------");
		System.out.println("Sorting by Duration");
		DurationSort drsort= new DurationSort();
		Set<Movie> s4=new TreeSet<Movie>(drsort);
		s4.add(m1);
		s4.add(m2);
		s4.add(m3);
		s4.add(m4);
		s4.add(m5);
		for(Movie m:s4)
		{
			System.out.println(m);
		}
		System.out.println("---------------------------------------");
		System.out.println("Sorting by Ratings");
		RatingSort rsort= new RatingSort();
		Set<Movie> s5=new TreeSet<Movie>(rsort);
		s5.add(m1);
		s5.add(m2);
		s5.add(m3);
		s5.add(m4);
		s5.add(m5);
		for(Movie m:s5)
		{
			System.out.println(m);
		}
	}
}
