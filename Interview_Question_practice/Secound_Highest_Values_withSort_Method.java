package Interview_Question_practice;

import java.util.Arrays;

public class Secound_Highest_Values_withSort_Method {
	public static void main(String args[])
	{
//		int arr[]= {1,2,33,44,65,77,45,33,55,343,234};
//		
//		int max = Integer.MIN_VALUE;
//		int secound = Integer.MAX_VALUE;
//		
//		for(Integer num : arr)
//		{
//			if(num > max )
//			{
//				secound = max; // updating first values
//				
//				max = num;
//				
//			}else if(num > secound && num != max)
//			{
//				secound = num;
//			}
//		}
//		System.out.println("Highest values ="+max);
//		System.out.println("Secound highest values ="+secound);
//	
		
		int arr[]= {2,3,4,5,737,66,45,34,64,32,676};
		
		Arrays.sort(arr);
		
		int secoundHigh= arr[arr.length-2];
		
		System.out.println(secoundHigh);
		
	}

}
