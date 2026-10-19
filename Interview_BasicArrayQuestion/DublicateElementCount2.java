package Interview_BasicArrayQuestion;

import java.util.HashSet;

public class DublicateElementCount2 {

	public static void main(String[] args) {
		int arr[]= {1,4,6,8,4,5,7,8,3,5,9};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				dublicate.add(n);
			}
		}
		System.out.println("Dublicate :"+dublicate);
		System.out.println("Non Dublicate :"+s1);
	}
}
