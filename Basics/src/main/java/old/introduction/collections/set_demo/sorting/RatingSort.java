package old.introduction.collections.set_demo.sorting;

import java.util.Comparator;

public class RatingSort implements Comparator<Movie>
{
	@Override
	public int compare(Movie m1, Movie m2)
	{
		double rating1=m1.getRatings();
		double rating2=m2.getRatings();
		if(rating1>rating2)
			return 1;
		else if(rating1<rating2)
			return -1;
		return 0;
	}
	
}