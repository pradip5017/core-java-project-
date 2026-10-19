package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practic6 {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,5,6,4,3,2};
		
		HashSet<Integer> s1= new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
			System.out.println(s1);
		}
	}

}
