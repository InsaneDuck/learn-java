package old.advanced.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqldb
{
	public static Connection Connect() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/java";
		String user="root";
		String pwd="satya";
		Connection c=DriverManager.getConnection(url,user,pwd);
		return c;
	}
}
