package old.introduction.interfaces.interface_library;

public class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	AdultUser()
	{
		
	}
	AdultUser(int age,String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	public int getAge()
	{
		return age;
	}
	public String getBookType()
	{
		return bookType;
	}
	@Override
	public void registerAccount()
	{
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	@Override
	public void requestBook()
	{
		if(bookType=="fiction")
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setBookType(String bookType)
	{
		this.bookType = bookType;
	}
}
