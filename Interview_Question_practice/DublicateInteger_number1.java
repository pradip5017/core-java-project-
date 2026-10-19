package Interview_Question_practice;

import java.util.*;
public class DublicateInteger_number1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,45,222,66,67,55,33,33,22,44,33,222,33,22,22,44};
		
		Set<Integer> s1= new HashSet<>();
		
		Set<Integer> dublicate = new HashSet<>();
		
		for( Integer db : arr)
		{
			if(!s1.add(db))
			{
				dublicate.add(db);
			}
		}
		
		System.out.println(dublicate);
	}

}
