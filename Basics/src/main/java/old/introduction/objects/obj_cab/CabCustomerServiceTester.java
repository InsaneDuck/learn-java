package old.introduction.objects.obj_cab;

public class CabCustomerServiceTester
{
	public static void main(String[] args)
	{
		CabCustomer c1=new CabCustomer("customerName1","pickupLocation1","dropLocation1",8,8332993516l);
		CabCustomer c2=new CabCustomer("customerName2","pickupLocation2","dropLocation2",4,9441667755l);
		CabCustomer c3=new CabCustomer("customerName3","pickupLocation3","dropLocation3",6,8332993516l);
		CabCustomer c4=new CabCustomer("customerName4","pickupLocation4","dropLocation4",3,9441776655l);
		CabCustomerService cab=new CabCustomerService();
		cab.addCabCustomer(c1);
		cab.addCabCustomer(c2);
		cab.addCabCustomer(c3);
		cab.addCabCustomer(c4);
		cab.display();
		System.out.println(cab.printBill(c4));
		System.out.println(cab.printBill(c3));
		System.out.println(cab.printBill(c2));
		System.out.println(cab.printBill(c1));
	}
}
