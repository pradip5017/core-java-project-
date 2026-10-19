package Interview_Question_practice;
import java.util.*;
public class DublicateString_findOut_Practica3 {
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,9,6,5,3,2,1,4,8};
		
		Set<Integer>s1 = new HashSet<>();
		
		Set <Integer> dublicate = new HashSet<>();
		
		for(Integer str :arr )
		{
			if(!s1.add(str))
			{
				dublicate.add(str);
			}
		}
		System.out.println(dublicate);
		
	}

}
