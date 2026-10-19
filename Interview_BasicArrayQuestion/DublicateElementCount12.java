package Interview_BasicArrayQuestion;

import java.util.HashSet;

// Find out dublicate Arrays 
public class DublicateElementCount12 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,5,7,9,5,3,6,8,3};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println("Dublicate :"+dublicate);
		System.out.println("remove Dublicate :"+s1);
	}

}
