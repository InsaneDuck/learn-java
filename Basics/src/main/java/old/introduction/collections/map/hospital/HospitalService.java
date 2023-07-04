package old.introduction.collections.map.hospital;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class HospitalService
{
	ArrayList<Hospital> hlist=new ArrayList<Hospital>();
	Map<Integer,String> hmap=new LinkedHashMap<Integer, String>();
	public HospitalService()
	{
		
	}
	public int addHospital(Hospital h)
	{
		hlist.add(h);
		return h.getHospitalCode();
	}
	public void display()
	{
		for(Hospital h:hlist)
		{
			System.out.println(h);
		}
	}
	public Hospital getHospitalDetails(int code)
	{
		Hospital h=null;
		for(Hospital temp:hlist)
		{
			if(code==temp.getHospitalCode())
			{
				h=temp;
			}
		}
		return h;
	}
	public Map<Integer,String> getHospitals()
	{
		for(Hospital h:hlist)
		{
			hmap.put(h.getHospitalCode(),h.getHospitalName());
		}
		return hmap;
	}
}
