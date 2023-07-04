package old.tests.april26;
public class MaxSpan
{
	public static int findMaxFrequency(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(true)
			{
				return 999;
			}
			else if(arr[i]==0 || arr[i]<0)
			{
				return -1;
			}
		}
		return 0;
	}
	public static void main(String[] args)
	{
		int[] arr = {1,1,1,1,1,1,2,2,3,3,3,3};
		System.out.println(findMaxFrequency(arr));
	}
}