package Interview_BasicArrayQuestion;
import java.util.*;
public class RemoveDublicateArray5 {
	public static void main(String args[])
	{
		int arr[]= {1,3,5,7,8,3,4,7,2,7,9,0,3,7};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				dublicate.add(n);
			}
		}
		System.out.println("Dublicate Number :"+dublicate);
		System.out.println("Withought Dublicate :"+s1);
	}

}
