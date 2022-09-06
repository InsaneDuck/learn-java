package tests.april5;

public class SpinningArray 
{

	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,2,3,4,5};
		SpinningArray.rotate(arr, 3);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");	
		}
	}

	public static int[] rotate(int[] arr, int nop) 
	{
		if(arr!=null)
		{
			for(int i=0;i<nop;i++)
			{    
	            int last; 
	            last=arr[arr.length-1]; 
	            for(int j=arr.length-1;j>0;j--)
	            {    
	                arr[j]=arr[j-1];    
	            }
	            arr[0]=last;    
	        }
			return arr;
		}
		else if(nop==0)
		{
			return arr;
		}
		else
			return null;
		
	}

}
