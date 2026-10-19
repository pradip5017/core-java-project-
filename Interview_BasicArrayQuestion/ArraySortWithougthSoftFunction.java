package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class ArraySortWithougthSoftFunction {
	public static void main(String args[])
	{
		int arr[]= {22,3,55,7,4,8,2,5,9,1,43};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
}
}
