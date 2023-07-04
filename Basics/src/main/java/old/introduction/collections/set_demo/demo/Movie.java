package old.introduction.collections.set_demo.demo;

public class Movie
{
	String name;
	String director_name;
	double duration;
	double ratings;
	Movie()
	{
		
	}
	public Movie(String name, String director_name, double duration, double ratings)
	{
		this.name = name;
		this.director_name = director_name;
		this.duration = duration;
		this.ratings = ratings;
	}
	public String getDirector_name()
	{
		return director_name;
	}
	public double getDuration()
	{
		return duration;
	}
	public String getName()
	{
		return name;
	}
	public double getRatings()
	{
		return ratings;
	}
	public void setDirector_name(String director_name)
	{
		this.director_name = director_name;
	}
	public void setDuration(double duration)
	{
		this.duration = duration;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setRatings(double ratings)
	{
		this.ratings = ratings;
	}
	@Override
	public String toString()
	{
		return "\nMovie [name=" +name
				+ ", director_name=" + director_name 
				+", duration=" + duration + ", ratings="
				+ ratings + "]";
	}
	
}
