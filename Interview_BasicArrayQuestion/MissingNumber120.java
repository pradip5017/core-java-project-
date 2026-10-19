package Interview_BasicArrayQuestion;
import java.util.*;
public class MissingNumber120 {
	public static void main(String args[])
	{
		int arr[]= {2,4,3,6,8,11};
		
		int n = 11;
		
		for(int i=0; i<n; i++)
		{
			boolean found = false;
			
			for(int j=i; j<arr.length; j++)
			{
				if(arr[j]==i)
				{
				found = true;
				break;
				}
		}
		if(!found)
		{
			System.out.print(i+" ");
		}
	}
	}

}
