package Interview_Question_practice;
import java.util.*;
public class Smalest_Array_Number4 {
	public static void main(String args[])
	{
		// find out the smallest number of array
		
//		int arr[] = {34,23,443,234,23,4,3,43,566,785,7785,4553,45};
		
//		int min = arr.length;
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i] < min)
//			{
//				min = arr[i];
//			}
//		}
//		System.out.println(min);
		
		
		//..............find out max element of array.........
//		int arr[]= {22,34,32,34,245,775,785,44,646,343,547,232,435};
//		
//		int max = arr.length;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i] > max)
//			{
//				max = arr[i];
//			}
//			
//		}
//		System.out.println(max);
//		
		
		
		//.....find out secound highest values in array.. in sorting..
//		int arr[] = {22,3,445,66,788,55454,234,677,434,645,6454,23};
//		
//		Arrays.sort(arr);
//		
//		int secoundHighestValues = arr[arr.length-2];
//		
//		System.out.println("Secound Highest Values :"+secoundHighestValues);
//		
		
		
		//.. find out secound highest values without using inbuilt function...
		
		int arr[] = {23,22,33,2,1,23,54,65,655,343,232,121,34,113,42,};
		
		int first = Integer.MIN_VALUE;
		int secound = Integer.MIN_VALUE;
		
		for(Integer num : arr)
		{
			if(num > first)
			{
				secound = first;
				first = num;
			}
			else if(num > first && num !=secound)
			{
				first = num;
			}
		}
		System.out.println("Highest value :"+first);
		System.out.println("Secound highest Values :"+secound);
	}
}
