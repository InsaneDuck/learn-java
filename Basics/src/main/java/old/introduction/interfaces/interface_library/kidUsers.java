package old.introduction.interfaces.interface_library;

public class kidUsers implements LibraryUser
{
	int age;
	String bookType;
	kidUsers()
	{
		
	}
	kidUsers(int age,String bookType)
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
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	@Override
	public void requestBook()
	{
		if(bookType=="kids")
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
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
