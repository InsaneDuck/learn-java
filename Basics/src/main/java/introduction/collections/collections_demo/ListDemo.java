package introduction.collections.collections_demo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
public class ListDemo
{
	public static void main(String[] args)
	{
		ArrayList<Integer> L1=new ArrayList<Integer>(); 
		//for integer array without defining any data type it will accept all data types
		//data is stored sequential order
		ArrayList L2=new ArrayList();
		L1.add(1);L1.add(2);L1.add(3);L1.add(4);
		L2.add("Satya");
		L2.add("Anil");
		System.out.println(L1);
		System.out.println(L2);
		L1.add(2,31);
		//inserts 3 in index 3 and shifts the values after it
		L2.set(0,"Anil");
		//will replace the value at that index
		System.out.println(L1);
		System.out.println(L2);
		L1.remove(2);
		//here 2 is index of value you want to remove from array
		L2.remove(0);
		L2.add(0,"Satya");
		System.out.println(L1);
		System.out.println(L2);
		L2.addAll(L1);
		//adds all L1 elements to L2 at the end of L2
		System.out.println(L2);
		System.out.println(L2.contains("Satya"));
		//true or false to check if element is present in an array
		LinkedList L3=new LinkedList();
		//data is stored randomly in linked list at an node containing
		// data and address of next node and previous node it uses double linked list
		L3.add(21);
		L3.add(39);
		L3.add(24);
		System.out.println(L3);
		HashSet H1=new HashSet();
		//does no store in any order
		H1.add(21);
		H1.add(29);
		H1.add(27);
		H1.add(97832);
		System.out.println(H1);
		TreeSet T2=new TreeSet();
		//stores values in ascending order
		T2.add(2);
		T2.add(3);
		T2.add(4);
		System.out.println(T2);
		T2.addAll(H1);
		System.out.println(T2);
		//adds all elements from H1 to T2 and since T2 is a tree 
		//it gets sorted in ascending order
	}
}
