package introduction.collections.linkedlist_demo;

import java.util.LinkedList;

public class EmployeeDetails
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("101","Anu","HYD");
		Employee e2 = new Employee("102","Ravi","SEC");
		Employee e3= new Employee("103","John Doe","Pune");
		LinkedList<Employee> employeeList = new LinkedList<Employee>();
		employeeList.add(e1);// id, name, address
		employeeList.add(e2);
		employeeList.add(e3);
		System.out.println(employeeList);
		System.out.println("_____________________________________________________");
		for(int i = 0; i < employeeList.size(); i++) {
			Employee e = employeeList.get(i);// i = 0 e = e1[id,name,address];
			System.out.println(e.getId());
		}
		
//		System.out.println(e1.getId());
//		System.out.println(e2.getId());
//		System.out.println(e3);
//		
//		String s = e2.toString();
	}

}
