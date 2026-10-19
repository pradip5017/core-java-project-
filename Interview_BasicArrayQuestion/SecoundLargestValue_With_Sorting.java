package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SecoundLargestValue_With_Sorting {
	public static void main(String[] args) {
		
		int arr[]= {2,33,55,74,75,22,33,88,86};
		
//		Arrays.sort(arr);
//		
//		int secoundHigh = arr[arr.length-2];
//		System.out.println(secoundHigh);
		
		
		// sorting array

		Arrays.sort(arr);
		for(int num :arr)
		{
			System.out.println(num);
		}
		
	}

}
