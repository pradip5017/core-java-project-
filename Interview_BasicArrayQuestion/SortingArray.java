package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SortingArray {

	public static void main(String args[])
	{
		int arr[]= {43,2,4,5,623,6,41,1};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.print("Sorting :");
		for(int n :arr)
		{
			System.out.print(n+" ");
		}	
	}
}
