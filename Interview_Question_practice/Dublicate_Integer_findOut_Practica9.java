package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practica9 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,4,5,7,8,3};
		
		HashSet<Integer> s1 = new HashSet<>();
		
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer  num :arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println(dublicate);
	}

}
