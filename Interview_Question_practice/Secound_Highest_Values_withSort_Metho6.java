package Interview_Question_practice;

import java.util.Arrays;

public class Secound_Highest_Values_withSort_Metho6 {
	public static void main(String args[])
	{
		int arr[]= {34,5,6,8,9,43,57,97,42,68,87};
		
		Arrays.sort(arr);
		
		int secound = arr[arr.length-2];
		System.out.println(secound);
		
	}

}
