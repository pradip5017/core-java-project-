package Interview_Question_practice;
//* find the second-largest element in an array using Java
//arr = {12, 35, 1, 10, 34, 1};

import java.util.Arrays;

public class DublicateString_findOut_Practica {
	public static void main(String args[])
	{
		/*
		int arr[]= {12, 35, 1, 10, 34, 1};
		
		// using inbuild method Arryas.Sort
		Arrays.sort(arr);
		int secoundElement = arr[arr.length-2];
		System.out.println("Secound Element :"+secoundElement);
	
	*/
		
		// not using 
		
		int arr[]= {12, 35, 1, 10, 34, 1};
		
		int first = 0;
		int secound =0;
		
		for(int i=0; i<arr.length; i++)
		{
		
			if(arr[i] > secound)
			{
				secound = first;
				first = arr[i];
			}
			else if(arr[i] > first && arr[i]!= secound)
			{
				     first = secound;
			}
		}
		System.out.println("Secound Highest Element :"+secound);
		System.out.println("First highest Element :"+first);
	}
	
	

}
