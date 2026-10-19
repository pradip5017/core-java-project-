package Interview_BasicArrayQuestion;

import java.util.HashSet;

public class DublicateElementCount5 {
	public static void main(String args[])
	{
		int arr[]= {24,9,3,5,7,8,5,7,9,2,4,8,9};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				dublicate.add(n);
			}
		}
		System.out.println(dublicate+" ");
	}

}
