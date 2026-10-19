package Interview_BasicArrayQuestion;

import java.util.HashSet;

public class RemoveDublicateArray1 {

	public static void main(String args[])
	{
		int arr[]= {1,2,4,3,5,6,4,3,5,7,6,4};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num :arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println("Remove Dublicate :"+s1);
		System.out.println("Dublicate : "+dublicate);
	}
}
