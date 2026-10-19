package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practica4 {
	public static void main(String args[])
	{
		//find out doublicate element array
		int arr[]= {2,3,4,5,6,4,3,2,2,3,4,5,7,4,6,3,4,6,7};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println(dublicate);
		System.out.println(s1);
		
	}

}
