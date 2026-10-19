package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SecoundLargestValue_With_Sorting0 {
	
	public static void main(String args[])
	{
		int arr[]= {2,3,4,5,66,433,23,37,92,35};
		
		// with Sorting

		/*
		Arrays.sort(arr);
		
		int secoundHigh =  arr [arr.length -2];
		
		System.out.println(secoundHigh);
		*/
		
		int first = 0;
		int secound = 0;
		
		for(int num : arr)
		{
			if(num > first)
			{
				secound = first;
				first = num;
			}
			else if(num > secound && num != first)
			{
				secound = num;
			}
		}
		System.out.println("Secound :"+secound);
	}

}
