package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practica3 {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,5,6,7,3,45,5,6,7,9,0,3,4,6,5,6,3,2};
		
		Set<Integer> s1 = new HashSet<>();
		
		Set<Integer> s2 = new HashSet<>();
		
		for(Integer num :arr)
		{
			if(!s1.add(num))
			{
				s2.add(num);
			}
			
		}
		System.out.println(s2);
	}

}
