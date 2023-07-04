package old.introduction.collections.collection_student;

import java.util.LinkedList;

public class StudentDemo
{
	public static void main(String[] args)
	{
		Student s1=new Student("Student1",40,50,60);
		Student s2=new Student("Student2",40,50,60);
		Student s3=new Student("Student3",40,50,60);
		Student s4=new Student("Student4",40,50,60);
		Student s5=new Student("Student5",40,50,60);
		LinkedList<Student> l1=new LinkedList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		System.out.println(l1);
	}
}
