package introduction.collections.iterator.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(5);
		l1.add(0);
		Iterator<Integer> i1=l1.iterator();
		
		while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
	}
}
