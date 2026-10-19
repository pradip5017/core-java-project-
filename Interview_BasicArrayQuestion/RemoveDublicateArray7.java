package Interview_BasicArrayQuestion;
import java.util.*;
public class RemoveDublicateArray7 {
	public static void main(String args[])
	{
		int arr[]= {12,4,26,1,38,1,5,8,9,4,5,9};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				dublicate.add(n);
			}
		}
		System.out.println("Dublicate:"+dublicate);
		System.out.println("Non dublicate :"+s1);
		
	}

}
