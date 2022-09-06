package introduction.collections.map.sort;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class SortingandCounting
{
	public static void main(String[] args)
	{
		int[] a= {1,1,2,1,3,2,3,4,4,3,4,4,6};
		Map<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			h.put(i,a[i]);
		}
		System.out.println(h);
		TreeMap<Integer,Integer> hsorted=sortByValue(h);
		System.out.println(hsorted);
	}
	public static TreeMap<Integer,Integer> sortByValue(Map<Integer,Integer> h) 
	{
		Comparator<Integer> c=new Sorting(h);
		TreeMap<Integer,Integer> sorted = new TreeMap<Integer,Integer>(c);
		sorted.putAll(h);
		return sorted;
	}
}
