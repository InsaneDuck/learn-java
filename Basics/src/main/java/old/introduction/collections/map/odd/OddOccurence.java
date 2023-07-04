package old.introduction.collections.map.odd;
import java.util.LinkedHashMap;
import java.util.Map;
public class OddOccurence
{
	public static void main(String[] args)
	{
		int a[]= {1,1,2,1,3,2,3,4,4,3,4,4,6};
		LinkedHashMap<Integer,Integer> odd=new LinkedHashMap<Integer,Integer>();
		for(Integer element:a)
		{
			if(odd.containsKey(element))
			{
				int count=odd.get(element);
				odd.put(element, ++count);
			}
			else
			{
				odd.put(element, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:odd.entrySet())
		{
			if(entry.getValue()%2!=0)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}
