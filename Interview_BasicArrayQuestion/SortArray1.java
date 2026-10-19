package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SortArray1 {
	public static void main(String[] args) {
		
		int arr[]= {4,7,1,4,6,7,3,34};
		
		Arrays.sort(arr);
		
		for(int s : arr)
		{
			System.out.print(s+" ");
		}
	}

}
