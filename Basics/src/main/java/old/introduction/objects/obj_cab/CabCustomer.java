package old.introduction.objects.obj_cab;

public class CabCustomer
{
	private static int idgen=0;
	private int custid;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private long phone;
	public CabCustomer()
	{
		
	}
	public CabCustomer(String customerName,String pickupLocation,String dropLocation,int distance,long phone)
	{
		++idgen;
		this.custid = idgen;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}
	public int getCustid()
	{
		return custid;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public int getDistance()
	{
		return distance;
	}
	public String getDropLocation()
	{
		return dropLocation;
	}
	public long getPhone()
	{
		return phone;
	}
	public String getPickupLocation()
	{
		return pickupLocation;
	}
	public void setCustid(int custid)
	{
		this.custid = custid;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public void setDistance(int distance)
	{
		this.distance = distance;
	}
	public void setDropLocation(String dropLocation)
	{
		this.dropLocation = dropLocation;
	}
	public void setPhone(long phone)
	{
		this.phone = phone;
	}
	public void setPickupLocation(String pickupLocation)
	{
		this.pickupLocation = pickupLocation;
	}
	@Override
	public String toString()
	{
		return "CabCustomer [custid=" + custid + ", customerName=" 
				+ customerName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation 
				+ ", distance=" + distance + ", phone=" + phone + "]";
	}
	
}
