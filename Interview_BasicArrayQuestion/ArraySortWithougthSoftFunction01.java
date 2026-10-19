package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class ArraySortWithougthSoftFunction01 {

	public static void main(String args[])
	{
		int arr[]= {3,5,7,1,3,9,7,9,2,58,4,0};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
							
				}
			}
		}
		for(int n : arr)
			{
			System.out.print(n+" ");
			};
	}
}
