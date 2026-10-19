package Interview_Question_practice;

import java.util.Arrays;

public class Secound_Highest_Values_withSort_Method1 {
	public static void main(String args[])
	{
		// find out secound highest value in array
		int arr[]= {2,3,4,5,6,78,66,33,43,22,445,64,23,455};
		
		Arrays.sort(arr);
		
		int secoundHighestValues = arr[arr.length-2];
		
		System.out.println(secoundHighestValues);
	}

}
