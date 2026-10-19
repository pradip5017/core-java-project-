package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class ArraySort3 {

	public static void main (String args[])
	{
		
		// with sorting 
		
		/*
		int arr[]= {3,6,9,7,2,6,8};
		
		Arrays.sort(arr);
		
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
		
		*/
		
		
		// withought sorting
		
	
	
	int arr[]= {22,89,3,9,1,0,5};
	
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i] > arr[j])
			{
			int temp= arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	}
	
	System.out.println("Sorting array..!!");
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}
	
	
}
