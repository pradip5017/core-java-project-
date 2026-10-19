package Interview_Question_practice;

import java.util.Arrays;

public class Secound_Highest_Values_withSort_Metho7 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,6,8,44,6};
		
		Arrays.sort(arr);
		
		int sorting = arr[arr.length-2];
		System.out.println("Sorting :"+sorting);
	}

}
