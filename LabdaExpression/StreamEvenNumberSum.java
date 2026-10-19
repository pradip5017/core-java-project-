package LabdaExpression;

import java.util.Arrays; 
import java.util.stream.IntStream;

public class StreamEvenNumberSum {

	public static void main(String args[])
	{
		
		int arr[]= {1,2,3,4,5}; // even number sum
		
		int sum =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				sum += arr[i];
			}
		}
		System.out.println("Emperitive Approch :"+sum);
	
		// using Stream APi
		int array[]= {1,2,3,4,5};
		
		int sum2 = Arrays.stream(array).filter(n -> n % 2==0)
								.sum();
		System.out.println("Sum:"+sum2);
		
		// practice
		
		int add[]= {1,2,3,4,5};
		
		int add1 = Arrays.stream(add).sum();
		System.out.println("Sum of All Evement :"+add1);
		
	}
	
	
}
