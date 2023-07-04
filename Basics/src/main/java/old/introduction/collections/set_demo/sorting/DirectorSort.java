package old.introduction.collections.set_demo.sorting;

import java.util.Comparator;

public class DirectorSort implements Comparator<Movie>
{
	@Override
	public int compare(Movie m1, Movie m2)
	{
		String director1=m1.getDirector_name();
		String director2=m2.getDirector_name();
		return director1.compareToIgnoreCase(director2);
	}
}
