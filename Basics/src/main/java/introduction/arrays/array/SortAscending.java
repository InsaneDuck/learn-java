package introduction.arrays.array;
import java.util.Scanner;
public class SortAscending 
{
    public static void main(String[] args) 
    {
    	int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i=0;i<size;i++) 
        {
            num[i] = sc.nextInt();
        }
        sc.close();
        int temp;
        for (int i=0;i<size;i++) 
        {
            for (int j=i+1;j<size;j++) 
            { 
                if (num[i]>num[j]) 
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i=0;i<size-1;i++) 
        {
            System.out.print(num[i]+", ");
        }
        System.out.print(num[size-1]);
    }
}