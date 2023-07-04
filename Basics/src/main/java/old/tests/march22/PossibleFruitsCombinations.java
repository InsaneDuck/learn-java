package old.tests.march22;

public class PossibleFruitsCombinations
{	
	public static String getPossibleFruitsCombinations() {
		float b=0.5f;
		float o=1f;
		float a=5f;
		String combinations="";
		System.out.println("Bananas = 8, Oranges = 91, Apple = 1\n");
		for(int bananas=1;bananas<=100;bananas++)
		{
			for(int oranges=1;oranges<=100;oranges++)
			{
				for(int apples=1;apples<=100;apples++)
				{
					float cost=(bananas*b)+(oranges*o)+(apples*a);
					int totalfruits=bananas+oranges+apples;
					if(cost==100 && totalfruits==100)
					{
						combinations="Bananas = "+bananas+", Oranges = "+oranges+", Apple = "+apples;
					}
					
				}
			}
			
		}
		return combinations;
	}
	public static void main(String args[]){
		getPossibleFruitsCombinations();
	}
}