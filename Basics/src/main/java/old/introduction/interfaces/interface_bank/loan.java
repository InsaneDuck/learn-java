package old.introduction.interfaces.interface_bank;

public interface loan extends savings /* we can also not use extend and implement 
											multiple interfaces in loan customer*/
{
	public void payment(int amount);
}
