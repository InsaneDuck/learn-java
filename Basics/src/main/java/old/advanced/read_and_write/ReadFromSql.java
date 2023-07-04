package old.advanced.read_and_write;

import java.io.IOException;
import java.sql.*;
public class ReadFromSql
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String pwd="satya";
		Connection c=DriverManager.getConnection(url,user,pwd);
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("select * from studentdemo");
		while(r.next())
		{
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
		}
		s.close();
		c.close();
	}
}
