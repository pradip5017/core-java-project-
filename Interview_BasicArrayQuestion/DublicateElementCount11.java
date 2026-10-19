package Interview_BasicArrayQuestion;

import java.util.HashSet;

public class DublicateElementCount11 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,5,4,2,6,8,9,6,4,5,3,5};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				duplicate.add(n);
			}
		}
		System.out.println(duplicate);
	}

}
