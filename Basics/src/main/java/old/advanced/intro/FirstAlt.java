package old.advanced.intro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class FirstAlt
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String pwd="satya";
		Connection c=DriverManager.getConnection(url,user,pwd);
		PreparedStatement s=c.prepareStatement("insert into jdbcdemo values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter age");
		int age=sc.nextInt();
		s.setInt(1,id);
		s.setInt(3,age);
		s.setString(2,name);
		s.executeUpdate();
		s.close();
		c.close();
		sc.close();
		System.out.println("Record Inserted");
	}
}
