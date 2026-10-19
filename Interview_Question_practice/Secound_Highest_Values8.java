package Interview_Question_practice;

import java.util.Arrays;

public class Secound_Highest_Values8 {
	public static void main(String args[])
	{
		int arr[]= {22,45,324,75,86,23,657,234,67,234,86,876};
		
		Arrays.sort(arr);
		int secoundHigh =   arr[arr.length-2];
		System.out.println();
	}

}
