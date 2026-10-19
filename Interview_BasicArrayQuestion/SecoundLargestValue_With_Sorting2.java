package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SecoundLargestValue_With_Sorting2 {
	public static void main(String args[])
	{
		int arr[]= {1,3,34,6,9,5,3,6,2,123,2,93};
		
//		Arrays.sort(arr);
//		int secound = arr[arr.length-2];
//		System.out.println(secound);
		
		
		
	// ************secound way**********
		int first =0;
		int secound =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}else  if(arr[i] > secound && arr[i]!= first)
			{
				secound = arr[i];
			}
		}
		System.out.println(secound);
		
		
	}

}
