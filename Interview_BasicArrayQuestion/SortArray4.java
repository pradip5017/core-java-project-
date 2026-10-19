package Interview_BasicArrayQuestion;

import java.util.Arrays;

// sorting array
public class SortArray4 {
	public static void main(String args[])
	{
		int arr[]= {11,3,6,8,9,5,4};
		
		Arrays.sort(arr);
		
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}

}
