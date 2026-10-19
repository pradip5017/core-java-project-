package LabdaExpression;

import java.util.Arrays; 
import java.util.List;
import java.util.stream.IntStream;
import java.util.*;


public class StreamApiQuestion {

	public static void main(String args[])
	{
		
		// sum of all Array 
//		int arr[]= {1,2,3,4,5,6,7,8};
//		
//		int sum =0;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			sum = sum + arr[i];
//		}
//		System.out.println(sum);
		
		
		// sum of Even number only
	
	/*	int arr[]= {1,2,3,4,5,6,7,8};
		
		int sum =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				sum +=arr[i];
			}
		}
		System.out.println(sum);
		*/
		
		
		// using Stream APi Features 
		
//		 int arr[]= {1,2,3,4,5,6,7,8};
//		 
//		 int sum = Arrays.stream(arr).filter(n -> n% 2==0).sum();
//		 System.out.println("Even Number Sum :"+sum);
		
		
		// sum of all array Element
		
//		int arr[]= {1,2,3,4,5,6,7,8};
//		
//		int sum = Arrays.stream(arr).sum();
//		
//		System.out.println(sum);
	
		
		// find out highest element of array
		
//		int arr[]= {1,2,3,98,4,5,6,7,8,5};
//		int max = 0;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i] > max)
//			{
//				max = arr[i];
//		}
//		}
//		System.out.println(max);
		
		
		// findout the max element in array
//		int arr[]= {11,2,3,4,5,6,7,8,10,4};
//		int max = Arrays.stream(arr).min().getAsInt();
//		
//		System.out.println(max);
		
		
	 // find out dublicate Array
		
		int arr[]= {1,2,3,4,5,6,3,2,4,4,6,7};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println(dublicate);
	}
}
