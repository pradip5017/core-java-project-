package Interview_Question_practice;
import java.util.*;
public class DublicateString_findOut_Practica2 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,5,4,3,2,5,7};
		
		Set<Integer> s1 = new HashSet<>();
		
		Set<Integer> dublicate = new HashSet<>();
		
		for ( Integer str : arr)
		{
			if(!s1.add(str))
			{
				dublicate.add(str);
			}
		}
		System.out.println(dublicate);
	}
	
}
