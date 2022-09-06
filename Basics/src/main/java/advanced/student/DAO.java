package advanced.student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO //data access object
{
	public List<Student> getStudentBydep(String dep) throws ClassNotFoundException, SQLException
	{
		List<Student> studentlist=new ArrayList<Student>();
		Connection c=sqldb.Connect();
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("select * from student where dep='"+dep+"'");
		while(r.next())
		{
			Student student=new Student();
			student.setId(r.getInt(1));
			student.setMarks(r.getInt(3));
			student.setName(r.getString(2));
			studentlist.add(student);
		}
		c.close();
		return studentlist;
	}
	public List<String> getDep() throws ClassNotFoundException, SQLException
	{
		List<String> deplist=new ArrayList<String>();
		Connection c=sqldb.Connect();
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("select distinct(dep) from student");
		while(r.next())
		{
			deplist.add(r.getString(1));
		}
		c.close();
		return deplist;
	}
}
