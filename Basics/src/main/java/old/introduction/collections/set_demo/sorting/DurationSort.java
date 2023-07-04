package old.introduction.collections.set_demo.sorting;

import java.util.Comparator;

public class DurationSort implements Comparator<Movie>
{
	@Override
	public int compare(Movie m1, Movie m2)
	{
		int duration1=m1.getDuration();
		int duration2=m2.getDuration();
		if(duration1>duration2)
			return 1;
		else if(duration1<duration2)
			return -1;
		return 0;
	}
	
}
