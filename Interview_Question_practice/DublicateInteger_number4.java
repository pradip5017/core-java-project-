package Interview_Question_practice;

import java.util.HashSet;


public class DublicateInteger_number4 {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,5,6,7,4,2,5,7,8,5};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer i: arr)
		{
			if(!s1.add(i))
			{
				dublicate.add(i);
			}
		}
		System.out.println(dublicate);
	}

}
