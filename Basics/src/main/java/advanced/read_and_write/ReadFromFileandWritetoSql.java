package advanced.read_and_write;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReadFromFileandWritetoSql
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String pwd="satya";
		Connection c=DriverManager.getConnection(url,user,pwd);
		PreparedStatement s=c.prepareStatement("insert into studentdemo values(?,?,?)");
		FileReader reader= new FileReader("files\\student.csv");
		BufferedReader buffer=new BufferedReader(reader);
		String line=buffer.readLine();
		System.out.println(line);
		line=buffer.readLine();
		while(line!=null)
		{
			String details[]=line.split(",");
			s.setInt(1,Integer.valueOf(details[0]));
			s.setInt(3,Integer.valueOf(details[2]));
			s.setString(2,details[1]);
			s.executeUpdate();
			line=buffer.readLine();
		}
		buffer.close();
		reader.close();
		s.close();
		c.close();
	}
}
