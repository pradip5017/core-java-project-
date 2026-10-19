package Interview_BasicArrayQuestion;

import java.util.Arrays;
//find out secound highest number
public class ArraySort1 {
	public static void main(String args[])
	{
		int arr[]= {3,5,7,9,1,4,7,8};
		
		int first =0;
		int secound=0;
		
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}else if(arr[i] > secound && arr[i]!= first)
			{
				 secound = arr[i];
			}
		}
		System.out.println(secound);
	}

}
