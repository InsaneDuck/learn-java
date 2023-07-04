package old.advanced.intro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class First
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
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		s.executeUpdate("insert into jdbcdemo values("+id+",'"+name+"',"+age+")");
		s.close();
		c.close();
		sc.close();
		System.out.println("Record Inserted");
	}
}
