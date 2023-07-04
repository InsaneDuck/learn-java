package old.introduction.collections.collections_demo;

import java.util.LinkedList;

public class ListMethods
{
	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		//generic type is declared here to be <String> so it only stores String values
		l1.add("Apple");
		l1.add("Guava");
		l1.add("Orange");
		l1.add("Mango");
		l1.add("Banana");
		System.out.println(l1);
		l1.add(3,"Berry");
		l1.add("Orange");
		System.out.println(l1);
		l1.remove("Orange");
		System.out.println(l1);
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("Rose");
		l2.add("Lotus");
		l2.add("Jasmine");
		Object[] o=l2.toArray();
		//linked list converted to an Arraylist
		String s=o[1].toString();
		System.out.println(s);
		l2.addAll(1, l1);
		System.out.println(l2);
		//adds l1 at index 1
		System.out.println(l2.containsAll(l1));
		//checks if l2 contains l1 elements
		System.out.println(l1.indexOf("Orange"));
		System.out.println(l1.lastIndexOf("Orange"));
		//since values in linked list are not stored in order we will get different index value
		System.out.println(o);
		
	}
}
