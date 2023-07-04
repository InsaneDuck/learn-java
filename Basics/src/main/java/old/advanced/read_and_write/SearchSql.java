package old.advanced.read_and_write;

import java.sql.*;
import java.util.Scanner;

public class SearchSql
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String pwd="satya";
		Connection c=DriverManager.getConnection(url,user,pwd);
		Statement s=c.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		ResultSet r=s.executeQuery("select * from studentdemo where name='"+name+"'");
		while(r.next())
		{
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
		}
		sc.close();
		s.close();
		c.close();
	}
}
