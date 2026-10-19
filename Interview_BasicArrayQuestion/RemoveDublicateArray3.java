package Interview_BasicArrayQuestion;

import java.util.HashSet;

public class RemoveDublicateArray3 {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,5,7,8,9,6,5,4,3,5,6,8,9};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> result =new HashSet<>();
		
		for(int n :arr)
		{
			if(!s1.add(n))
			{
				result.add(n);
			}
		}
		System.out.println("Dublicate Array :"+result);
		System.out.println("Remove Dublicate:"+s1);
		
	}

}
