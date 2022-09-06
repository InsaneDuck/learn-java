package introduction.exceptions.student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class studentlist
{
	public static void main(String[] args)
	{
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("name0","address0"));
		list.add(new Student("name1","address1"));
		list.add(new Student("name2","address2"));
		list.add(new Student("name3","address3"));
		list.add(new Student("name4","address4"));
		list.add(new Student("name5","address5"));
		list.add(new Student("name6","address6"));
		list.add(new Student("name7","address7"));
		list.add(new Student("name8","address8"));
		list.add(new Student("name9","address9"));
		for(Student s:list)
		{
			System.out.println(s);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a id");
		int id=sc.nextInt();
		sc.close();
		if(!search(list,id))
		{
			try
			{
				throw new StudentNotFoundException(id+" Student not found");
			}
			catch(StudentNotFoundException s)
			{
				s.printStackTrace();
			}
		}
	}
	public static boolean search(List<Student> list,int id)
	{
		for(Student s:list)
		{
			if(id==s.getId())
			{
				System.out.println(s);
				return true;
			}
		}
		return false;
	}
}
