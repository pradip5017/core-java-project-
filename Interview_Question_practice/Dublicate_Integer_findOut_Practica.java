package Interview_Question_practice;

import java.util.Set;
import java.util.*;
public class Dublicate_Integer_findOut_Practica {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,7,6,5,4,3,22,2,4,5,3,5,23,5,1};
		
		Set<Integer> a1 = new HashSet<>();
		
		Set<Integer> dublicate = new HashSet<>();
		
		for(Integer s1 : arr)
		{
			if(!a1.add(s1))
			{
				dublicate.add(s1);
			}
		}
		System.out.println(dublicate);
	}

}
