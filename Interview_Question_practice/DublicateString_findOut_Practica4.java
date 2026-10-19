package Interview_Question_practice;
import java.util.*;
public class DublicateString_findOut_Practica4 {

	public static void main(String args[])
	{
		int arr[] = {11,22,33,44,55,66,11,222,44};
		
		Set<Integer> s1 = new HashSet<>();
		
		Set<Integer> dublicate = new HashSet<>();
		
		for(Integer str : arr)
		{
			if(!s1.add(str))
			{
				dublicate.add(str);
			}
		}
		System.out.println(dublicate);
	}
}
