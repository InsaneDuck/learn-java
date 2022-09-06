package introduction.file_handling.student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class StudentDetails
{
	public static Student createStudent(String line)
	{
		String details[]=line.split(",");
		int id=Integer.parseInt(details[0]);
		String name=details[1];
		int m1=Integer.parseInt(details[2]);
		int m2=Integer.parseInt(details[3]);
		int m3=Integer.parseInt(details[4]);
		Student s=new Student(id,name,m1,m2,m3);
		return s;
	}

	public static void main(String[] args) throws IOException
	{
		FileReader reader=new FileReader("files\\student\\studentdetails.csv");
		BufferedReader buffer=new BufferedReader(reader);
		String line=buffer.readLine();
		System.out.println(line);
		List<Student> details=new ArrayList<Student>();
		line=buffer.readLine();
		System.out.println(line);
		while(line!=null)
		{
			details.add(createStudent(line));
			line=buffer.readLine();
		}
		reader.close();
		buffer.close();
		for(Student s:details)
		{
			System.out.println(s);
		}
	}
}
