package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SortArray2 {
	
	public static void main(String[] args) {
		int arr[]= {4,6,8,3,5,1,4,5};
		
		Arrays.sort(arr);
		
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}
}
