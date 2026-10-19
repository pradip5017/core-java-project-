package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SecoundLargestValue_With_Sorting9 {
	public static void main(String args[])
	{
		/*
		int arr[]= {22,34,35,728,56,45,88,34,26};
		
		
		Arrays.sort(arr);
		
		int secoundHigh = arr[arr.length-2];
		
		System.out.println(secoundHigh);
		*/
		
		
		int arr[]= {22,34,35,718,56,45,88,34,26};

		int first = Integer.MIN_VALUE;
		 int secound = Integer.MIN_VALUE;
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 if(arr[i] > first)
			 {
			secound = first;
			first = arr[i];
		 }
			 else if(arr[i] >secound && arr[i]!= first)
			 {
				 secound = arr[i];
			 }
		 }
		
		System.out.println("SEcound High Element :"+secound);
		System.out.println("First Highest Element:"+first);
		
	}

}
