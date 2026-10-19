package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practica7 {
	public static void main(String args[])
	{
		// find out dublcate number
		int arr[]= {1,2,3,54,75,1,5,75,8,34,124,77,3,5,8,4};
		
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> dublicate = new HashSet<>();
		
		for(Integer num :arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			
			}
		}
		System.out.println(dublicate);
	}

}
