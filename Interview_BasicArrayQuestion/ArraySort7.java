package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class ArraySort7 {
	public static void main(String args[])
	{
		int arr[]= {2,44,1,55,73,8,5,27,85};
		
		Arrays.sort(arr);
		
		for(Integer  num : arr)
		{
			System.out.print(num+" ");
		}
	}

}
