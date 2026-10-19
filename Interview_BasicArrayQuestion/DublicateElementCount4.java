package Interview_BasicArrayQuestion;

import java.util.Scanner;

public class DublicateElementCount4 {
	public static void main(String args[])
	{		
		int arr[]= {2,4,5,1,4,8,7,5,9,5,7,5,4,5,9,};
		
		int count =0;
		for(int i=0; i<arr.length; i++)
		{
			count = 1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
			{
				System.out.println("Elemet  :"+arr[i]+" count :"+count);
			}
		}
	}

}
