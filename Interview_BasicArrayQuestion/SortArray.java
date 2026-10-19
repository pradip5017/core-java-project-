package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[]= {2,99,9,63,5,3,2,4,7,2,1,4,6,7};
		
		Arrays.sort(arr);
		for(int num :arr)
		{
			System.out.print(num+" ");
		}
	}

}
