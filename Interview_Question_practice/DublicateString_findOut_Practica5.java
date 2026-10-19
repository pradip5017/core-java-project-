package Interview_Question_practice;
import java.util.*;
public class DublicateString_findOut_Practica5 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,1,2,3,4,56,7,7};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for( Integer int1 :arr)
		{
			if(!s1.add(int1))
			{
				dublicate.add(int1);
			}
		}
		System.out.println(dublicate);
		
	
	}

}
