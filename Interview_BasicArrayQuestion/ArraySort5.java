package Interview_BasicArrayQuestion;
import java.util.*;
public class ArraySort5 {
	
	public static void main(String args[])
	{
		int arr[]= {2,5,1,34,9,25,7,8,93,4};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}

}
