package Interview_Question_practice;

import java.util.Arrays;

// find out secound largest number in array
public class Secound_Highest_Values01 {
	public static void main(String args[])
	{
		
		int arr[]= {1,44,23,67,6,2,69,9};
		
		int first = 0;
		int secound =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]> first)
			{
				secound = first;
				first = arr[i];
			}
			else if(arr[i]> secound && arr[i]!= first)
			{
				secound = arr[i];
			}
		}
		System.out.println("Secound Highest Number :"+secound);
		System.out.println("First Highest Number :"+first);
	}

}
