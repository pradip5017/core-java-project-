package LeetCode;
import java.util.*;

public class UniqueElementSum1 {
	public static int findvalue(int[] arr)
	{
		HashMap<Integer, Integer> result = new HashMap<>();
		
		for(int str : arr)
		{
			result.put(str, result.getOrDefault(str, 0)+1);
			
		}
		int sum = 0;
		
		for(int str : arr)
		{
			if(result.get(str)==1)
			{
				sum +=str;
			}
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		int arr1[]= {1,2,3,4,5};
		System.out.println("values is ="+findvalue(arr1));
	}
}
