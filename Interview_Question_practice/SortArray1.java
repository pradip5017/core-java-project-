package Interview_Question_practice;

import java.util.Arrays;

public class SortArray1 {
	public static void main(String args[])
	{
		int arr[]= {11,22,3,4,5,7,8,9};
		
		Arrays.sort(arr);
		
		for(Integer num : arr)
		{
			System.out.print(num+" ");
		}
	}

}
