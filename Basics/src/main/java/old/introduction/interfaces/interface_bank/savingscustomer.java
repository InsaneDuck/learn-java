package old.introduction.interfaces.interface_bank;

public class savingscustomer implements savings
{
	private int accno;
	private String name;
	private long balance;
	savingscustomer()
	{
		
	}
	savingscustomer(int accno,String name,long balance)
	{
		this.accno=accno;
		this.setName(name);
		this.balance=balance;
	}
	@Override
	public void deposit(int amount)
	{
		balance+=amount;
		System.out.println(" Your account"+ accno+" balance is :"+balance+" after "
				+"depositing the amount " + amount);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public void withDraw(int amount)
	{
		balance-=amount;
		System.out.println(" Your account "+ accno+"balance is : "  + balance + " after "
				+ "withdrawl the amount " + amount);
	}
}
