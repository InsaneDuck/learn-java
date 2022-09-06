package introduction.exceptions.product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ProductList
{
	public static void main(String[] args)
	{
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(195,100));
		list.add(new Product(196,100));
		list.add(new Product(197,100));
		list.add(new Product(198,100));
		list.add(new Product(199,100));
		list.add(new Product(200,100));
		list.add(new Product(201,100));
		list.add(new Product(202,100));
		list.add(new Product(203,100));
		list.add(new Product(204,100));
		for(Product p:list)
		{
			System.out.println(p);
		}
		Iterator<Product> it=list.iterator();
		while(it.hasNext())
		{
			Product p=it.next();
			try
			{
				if(p.getWeight()<200)
				{
					throw new InvalidProductException();
				}
			}
			catch(InvalidProductException e)
			{
				it.remove();
			}
		}
		System.out.println("-----------------------------------------------------");
		for(Product p:list)
		{
			System.out.println(p);
		}
	}
	
}
