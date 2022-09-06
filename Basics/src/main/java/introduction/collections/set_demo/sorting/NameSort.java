package introduction.collections.set_demo.sorting;

import java.util.Comparator;

public class NameSort implements Comparator<Movie>
{
	@Override
	public int compare(Movie m1, Movie m2)
	{
		String name1=m1.getName();
		String name2=m2.getName();
		return name1.compareToIgnoreCase(name2);
	}
	
}
