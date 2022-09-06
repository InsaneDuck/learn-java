package introduction.collections.map.book;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BookList
{
	public static Book addBook()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book");
		String book=sc.nextLine();
		System.out.println("Enter Author");
		String author=sc.nextLine();
		sc.close();
		return new Book(book,author);
	}
	public static void main(String[] args)
	{
		Map<Book,Integer> books=new HashMap<Book,Integer>();
		Book b=addBook();
		books.put(b,b.getId());
		System.out.println(books);
	}
}

