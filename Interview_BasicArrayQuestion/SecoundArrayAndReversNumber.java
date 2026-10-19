package Interview_BasicArrayQuestion;

import java.util.HashSet;

public class SecoundArrayAndReversNumber {
	public static void main(String[] args) {
		
	int arr[]= {11,23,51,8,9,2,5,52,2,1,5,7};
	
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]< arr[j])
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(arr[1]);// secound highest element in arra
	
	for(int num : arr)
	{
		System.out.print(num+" "); // Sorting and Reverse Array Element
	}
	
	}

}
