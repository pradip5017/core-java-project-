package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practica1 {

	public static void main(String args[])
	{
		int arr[]= {3,4,5,6,7,8,9,0,8,6};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(Integer d :arr)
		{
			if(!s1.add(d))
			{
				dublicate.add(d);
			}
		}
		System.out.println("Dublicate :"+dublicate);
	}
}
