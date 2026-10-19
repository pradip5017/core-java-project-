package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
//		int arr[]= {1,5,7,4,3,2,6};
//		
//		Arrays.sort(arr);
//		
//		for(int n : arr)
//		{
//			System.out.print(n+" ");
//		}
	
		
		// sorting Array Without using Arrays.sor
		int arr[]= {9,5,7,1,4,3,2,6};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]> arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println("Sorting Arrays:");
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}

}
