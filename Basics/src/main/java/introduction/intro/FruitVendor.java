package introduction.intro;

public class FruitVendor
{
	public static void getFruitsCombination(float b,float o,float a)
	{
		for(int bananas=1;bananas<=100;bananas++)
		{
			for(int oranges=1;oranges<=100;oranges++)
			{
				for(int apples=1;apples<=100;apples++) {
					float cost=(bananas*b)+(oranges*o)+(apples*a);
					int totalfruits=bananas+oranges+apples;
					if(cost==100 && totalfruits==100)
					{
						System.out.println("Bananas="+bananas+" Oranges="+oranges+" Apples="+apples+" Cost="+cost);
					}
				}
			}
		}
	}
	public static void main(String arg[])
	{
		float banana=0.5f;
		float orange=1f;
		float apple=5f;
		getFruitsCombination(banana,orange,apple);
	}
}
