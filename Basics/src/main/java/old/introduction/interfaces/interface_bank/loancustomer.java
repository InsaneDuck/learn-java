package old.introduction.interfaces.interface_bank;

public class loancustomer implements loan/*we can use multiple interfaces 
										and use syntax "implements loan,savings" */
{
	private int accno;
	private String name;
	private int savings;
	private int loan;
	loancustomer()
	{
		
	}
	loancustomer(int accno,String name,int savings,int loan)
	{
		this.accno=accno;
		this.name=name;
		this.savings=savings;
		this.loan=loan;
	}
	@Override
	public void deposit(int amount)
	{
		savings=savings+amount;
	}
	public int getAccno()
	{
		return accno;
	}
	public int getLoan()
	{
		return loan;
	}
	public String getName()
	{
		return name;
	}
	public int getSavings()
	{
		return savings;
	}
	@Override
	public void payment(int amount)
	{
		loan=loan-amount;
	}
	public void setAccno(int accno)
	{
		this.accno = accno;
	}
	public void setLoan(int loan)
	{
		this.loan = loan;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSavings(int savings)
	{
		this.savings = savings;
	}
	@Override
	public String toString()
	{
		return null;
	}
	@Override
	public void withDraw(int amount)
	{
		savings=savings-amount;
	}
}
