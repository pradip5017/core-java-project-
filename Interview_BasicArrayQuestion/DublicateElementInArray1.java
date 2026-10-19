package Interview_BasicArrayQuestion;

import java.util.HashSet;

public class DublicateElementInArray1 {
	public static void main(String[] args) {
		int arr[]= {2,3,5,6,7,8,95,4,2,4,6,6};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> result= new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				result.add(n);
			}
		}
		System.out.println(result);
	}

}
