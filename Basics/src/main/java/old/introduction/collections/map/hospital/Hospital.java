package old.introduction.collections.map.hospital;

import java.util.List;

public class Hospital
{
	private static int codegen=1000;
	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatments;
	private String contactPerson;
	private String contactNumber;
	private String location;
	public Hospital()
	{
		
	}
	public Hospital(String hospitalName,List<String> listOfTreatments,String contactPerson,String contactNumber,
			String location)
	{
		codegen++;
		hospitalCode=codegen;
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}
	public String getContactNumber()
	{
		return contactNumber;
	}
	public String getContactPerson()
	{
		return contactPerson;
	}
	public int getHospitalCode()
	{
		return hospitalCode;
	}
	public String getHospitalName()
	{
		return hospitalName;
	}
	public List<String> getListOfTreatments()
	{
		return listOfTreatments;
	}
	public String getLocation()
	{
		return location;
	}
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}
	public void setContactPerson(String contactPerson)
	{
		this.contactPerson = contactPerson;
	}
	public void setHospitalCode(int hospitalCode)
	{
		this.hospitalCode = hospitalCode;
	}
	public void setHospitalName(String hospitalName)
	{
		this.hospitalName = hospitalName;
	}
	public void setListOfTreatments(List<String> listOfTreatments)
	{
		this.listOfTreatments = listOfTreatments;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	@Override
	public String toString()
	{
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName 
				+ ", listOfTreatments="+ listOfTreatments + ", contactPerson=" 
				+ contactPerson + ", contactNumber=" + contactNumber+ ", location=" 
				+ location + "]";
	}
	
}
