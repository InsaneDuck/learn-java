package introduction.exceptions.product;

public class InvalidProductException extends Exception
{
	InvalidProductException()
	{
		
	}
	InvalidProductException(String s)
	{
		super(s);
	}
}
