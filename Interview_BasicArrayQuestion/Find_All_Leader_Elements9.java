package Interview_BasicArrayQuestion;

import java.util.Arrays;

// all leader element find out 
public class Find_All_Leader_Elements9 {
	public static void main(String args[])
	{
		int arr[]= {22,14,21,47,43,35,37,68}; // leader element is 22,47,68
		
		
		
		
		
		
		
		
		int num= 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > num)
			{
				num = arr[i];
				System.out.print(num+" ");
			}
		}
		
	
		 
	}

}
