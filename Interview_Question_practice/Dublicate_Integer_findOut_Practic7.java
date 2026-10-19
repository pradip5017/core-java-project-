package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practic7 {
	public static void main(String args[])
	{
		int arr[]= {12,1,2,45,6,2,4,6};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer s: arr)
		{
			if(!s1.add(s))
			{
				dublicate.add(s);
			}
		}
		System.out.print(dublicate+" ");
	}

}
