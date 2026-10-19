package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practic5 {
	public static void main(String args[])
	{
		int arr[]= {4,5,6,7,8,2,8,5};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer s :arr)
		{
			if(!s1.add(s))
			{
				dublicate.add(s);
			}
		}
		System.out.println(dublicate);
	}

}
