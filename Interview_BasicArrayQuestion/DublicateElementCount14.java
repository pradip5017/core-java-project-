package Interview_BasicArrayQuestion;
import java.util.*;
public class DublicateElementCount14 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,5,8,9,6,3,2,6,8,9};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int n : arr)
		{
			if(!s1.add(n))
			{
				dublicate.add(n);
			}
		}
		System.out.println("Non Dublicate :"+s1);
		System.out.println("Dublicate:"+dublicate);
	}

}
