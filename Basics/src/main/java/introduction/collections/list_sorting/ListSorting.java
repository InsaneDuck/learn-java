package introduction.collections.list_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(5);
		l1.add(0);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}
}
