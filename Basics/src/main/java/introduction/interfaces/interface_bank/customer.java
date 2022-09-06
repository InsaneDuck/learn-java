package introduction.interfaces.interface_bank;

public class customer
{
	public static void main(String[] args) {
		/*LoanCustomer c1 = new LoanCustomer(45617,"Anu",50000,120000);
		c1.payment(5000);
		System.out.println(c1);*/
		savingscustomer s1 = new savingscustomer(74125,"Ravi",200000);
		s1.withDraw(2000);
		s1.deposit(3000);
	}
}
