package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SecoundLargestValue_With_Sorting6 {
	public static void main(String args[])
	{
		int arr[]= {1,3,53,6,84,2};
	
		int first=0;
		int secound =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}
			else if(arr[i]> secound && arr[i]!= first)
			{
				secound = arr[i];
			}
		}

		System.out.println("First Highest :"+first);
		System.out.println("Secound Highest Element :"+secound);
	}
}
