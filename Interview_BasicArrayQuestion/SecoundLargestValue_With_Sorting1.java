package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SecoundLargestValue_With_Sorting1 {
	public static void main(String[] args) {
		
		// using Inbuild method
		/*
		int arr[]= {22,33,4,55,77,816,34,65,867};
		
		Arrays.sort(arr);
		int secoundHigh = arr[arr.length-2];
		System.out.println(secoundHigh);
		*/	
		
		int arr[]= {22,44,66,23,53,65,86,23,57,85};
		
		int first = Integer.MIN_VALUE;
		int secound = Integer.MIN_VALUE;
		for(int num : arr)
		{
			if(num > first)
			{
				secound = first;
				first = num;
				
			}else if(num > secound && num != first)
			{
				secound = num;
			}
		}
		System.out.println("First Highest Values :"+first);
		System.out.println("Secound Highest values :"+secound);
	}

}
