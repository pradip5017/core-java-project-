package Interview_BasicArrayQuestion;

import java.util.*;

//remove dublicate array element
public class RemoveDublicateArray {
	public static void main(String[] args) {
	
		/*
		
		int arr[]= {22,35,35,47,47,67};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		
		for( int num :arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println(s1);
		
		*/
		
		// without using HashSet<> interface
		
		/*
		int arr[]= {22,35,35,47,47,67};
		
		int  j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=arr[j])
			{
				j++;
				int temp = arr[j];
				arr[j]= arr[i];
				arr[i] = temp;
			}
		}
		for(int i=0; i<=j; i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
		
		
		
		// find out dublicate element of array
		int arr[]= {22,35,35,47,47,67};
		
		int j =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=arr[j])
			{
				j++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		for(int i=0; i<=j; j++)
		{
			System.out.print(arr[i]+" ");
		}
			
	}

}
