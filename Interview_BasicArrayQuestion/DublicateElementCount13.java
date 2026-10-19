package Interview_BasicArrayQuestion;

import java.util.HashSet;

public class DublicateElementCount13 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,5,7,8,4,3,7,9,4};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println("dublicate :"+dublicate);
		System.out.println(" dublicate remove :"+s1);
	}

}
