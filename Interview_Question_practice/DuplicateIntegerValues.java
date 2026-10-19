package Interview_Question_practice;

import java.util.HashSet;

public class DuplicateIntegerValues {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,5,7,9};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		
		for(Integer num : arr)
		{
			if(!s1.add(num))
			{
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);
	}
	

}
