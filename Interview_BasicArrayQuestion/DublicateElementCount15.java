package Interview_BasicArrayQuestion;
import java.util.*;
public class DublicateElementCount15 {
	public static void main(String args[])
	{
		int arr[]= {2,3,6,4,7,9,6,2,4,7,9};
		
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
		System.out.println("Non Dublicate :"+s1);
	}

}
