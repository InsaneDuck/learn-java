package advanced.student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{
		DAO d=new DAO();
		List<String> list=d.getDep();
		String filepath="";
		for(String dep:list)
		{
			FileWriter fw=new FileWriter(filepath);
			BufferedWriter bw=new BufferedWriter(fw);
			List<Student> studentlist=d.getStudentBydep(dep);
			for(Student s:studentlist)
			{
				bw.write(s.getId()+" "+s.getName()+" "+s.getMarks()+"\n");
			}
			bw.close();
			fw.close();
		}
	}
}
