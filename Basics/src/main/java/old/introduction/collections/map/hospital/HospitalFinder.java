package old.introduction.collections.map.hospital;

import java.util.ArrayList;

public class HospitalFinder
{
	
	public static void main(String[] args)
	{
		ArrayList<String> treatments=new ArrayList<String>();
		HospitalService hs=new HospitalService();
		Hospital h1= new Hospital("hospitalName1",treatments,"contactPerson","contactNumber","location");
		Hospital h2= new Hospital("hospitalName2",treatments,"contactPerson","contactNumber","location");
		Hospital h3= new Hospital("hospitalName3",treatments,"contactPerson","contactNumber","location");
		Hospital h4= new Hospital("hospitalName4",treatments,"contactPerson","contactNumber","location");
		Hospital h5= new Hospital("hospitalName5",treatments,"contactPerson","contactNumber","location");
		hs.addHospital(h1);
		hs.addHospital(h2);
		hs.addHospital(h3);
		hs.addHospital(h4);
		hs.addHospital(h5);
		System.out.println("---------All Hospitals---------");
		hs.display();
		System.out.println("--------Enquiry--------");
		System.out.println(hs.getHospitalDetails(1003));
	}
}
