package Interview_Question_practice;

import java.util.Arrays;

public class Secound_Highest_Values_withSort_Metho4 {
	public static void main(String args[])
	{
		int arr[] = {2,33,43,56,34,656,78,65};
		
		Arrays.sort(arr);
		
		int secoundHighestValue = arr[arr.length-2];
		System.out.println(secoundHighestValue);
		}
	
}
