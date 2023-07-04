package old.introduction.collections.map.book;

public class Book
{
	static int idgen=0;
	int id;
	String name;
	String author;
	public Book()
	{
		
	}
	public Book(String name, String author)
	{
		++idgen;
		this.id=idgen;
		this.name = name;
		this.author = author;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
}
