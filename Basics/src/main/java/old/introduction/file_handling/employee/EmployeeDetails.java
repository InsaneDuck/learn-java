package old.introduction.file_handling.employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails
{
	public static void main(String[] args) throws IOException
	{
		FileReader reader= new FileReader("files\\employeedetails\\employee");
		BufferedReader buffer=new BufferedReader(reader);
		String line=buffer.readLine();
		System.out.println(line);
		List<String> details=new ArrayList<String>();
		while(line!=null)
		{
			String s[]=line.split(":");
			details.add(s[1]);
			line=buffer.readLine();
		}
		buffer.close();
		Employee e= new Employee(details.get(0),details.get(1),details.get(2));
		System.out.println(e);
	}
}
