package Interview_Question_practice;

import java.util.Arrays;

public class Smalest_Array_Number {
	public static void main(String args[])
	{
		int arr[]= {22,3,44,56,65,76,2,34,2,1,44};
		
		int min = 	arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if( arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("minimum VAlues :"+min);
	}

}
