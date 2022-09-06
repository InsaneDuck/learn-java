package introduction.collections.map.sort;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class Sorting implements Comparator<Integer>
{
	HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	Sorting(Map<Integer, Integer> h2)
	{
		this.h.putAll(h2);
	}
	@Override
	public int compare(Integer key1,Integer key2)
	{
		if(h.get(key1)>=h.get(key2))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
