package old.introduction.file_handling.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDetails
{
	public static void main(String[] args) throws IOException
	{
		List<Employee> e=new ArrayList<Employee>();
		FileReader reader= new FileReader("files\\csvdemo\\employee.csv");
		BufferedReader buffer=new BufferedReader(reader);
		String line=buffer.readLine();
		System.out.println(line);
		line=buffer.readLine();
		while(line!=null)
		{
			String details[]=line.split(",");
			e.add(new Employee(details[0],details[1],details[2]));
			line=buffer.readLine();
		}
		buffer.close();
		reader.close();
		for(Employee s:e)
		{
			System.out.println(s);
		}
	}
}
