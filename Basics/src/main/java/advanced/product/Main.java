package advanced.product;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
	    DAO d=new DAO();
		List<Product> productlist=d.getProducts();
		System.out.println("Please Choose Item");
		for(Product p:productlist) 
		{
			
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
		}
		
		Scanner sc = new Scanner(System.in);
		int id = Integer.valueOf(sc.nextLine());
		System.out.println("Please Choose Qty");
		int qty = Integer.valueOf(sc.nextLine());

		for(Product p :productlist) 
		{
			if(p.getId() == id) 
			{
				System.out.println("Total Price is "+(p.getPrice() * qty));
			}
		}
		sc.close();
	}
}
