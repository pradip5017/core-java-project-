package Interview_BasicArrayQuestion;

import java.util.Scanner;

public class LinearSearchProgram {
	public static void main(String args[])
	{
		int arr[]= {11,2,5,8,9,5};
		int num = 5;
		int temp =0;// nothing any value in array to print item found
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]== num)
			{
				System.out.println("number store in this Index :"+i);
			temp=temp+1;
			}
		}
		if(temp==0)// nothing array element in array
		{
			System.out.println("item Fount :"+temp);
		}
		
	}

}
