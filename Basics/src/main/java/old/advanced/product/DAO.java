package old.advanced.product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO
{
	public List<Product> getProducts() throws ClassNotFoundException, SQLException 
	{
		List<Product> productlist=new ArrayList<Product>();
		Connection c=sqldb.Connect();
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from product");
		while(rs.next())
		{
			Product p = new Product();
			p.setId(rs.getInt(1));
			p.setPrice(rs.getInt(3));
			p.setName(rs.getString(2));
			
			productlist.add(p);
		}
		c.close();
		
		return productlist;
	}
	
}
