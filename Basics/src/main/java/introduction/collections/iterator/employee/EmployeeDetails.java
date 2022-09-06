package introduction.collections.iterator.employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetails
{
	
	public static void main(String[] args)
	{
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("Satya",5000));
		emp.add(new Employee("Satya1",10000));
		emp.add(new Employee("Satya2",15000));
		emp.add(new Employee("Satya3",20000));
		emp.add(new Employee("Satya4",25000));
		emp.add(new Employee("Satya5",30000));
		emp.add(new Employee("Satya6",35000));
		emp.add(new Employee("Satya7",40000));
		emp.add(new Employee("Satya8",45000));
		Iterator<Employee> it=emp.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println(e);
		}
		System.out.println("----------------------------");
		ArrayList<Employee> Fresher=new ArrayList<Employee>();
		Iterator<Employee> ifresher=emp.iterator();
		while(ifresher.hasNext())
		{
			Employee fresher=ifresher.next();
			if(fresher.getSalary()<20000)
			{
				Fresher.add(fresher);
				ifresher.remove();
				System.out.println(fresher);
			}
		}
		System.out.println(Fresher);
	}
}
