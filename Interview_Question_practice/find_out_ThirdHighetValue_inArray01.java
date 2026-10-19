package Interview_Question_practice;

import java.util.Arrays;

public class find_out_ThirdHighetValue_inArray01 {
	public static void main(String args[])
	{
		int arr[]= {1,23,3,56,8,54,73,23,67,5};
		
		// inbuilt Method by using sort////
//		Arrays.sort(arr);
//		
//		int third = arr[arr.length-3];
//		
//		System.out.println("Third = "+third);
		
		
		// building logic
		
		int first = arr[0];
		int secound = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}
			else if(arr[i] > first && arr[i]!= secound)
			{
				     secound = first;
			}
		}
		System.out.println("Secound ="+secound);
		System.out.println("first :"+first);
		
	}

}
