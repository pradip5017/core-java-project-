package Interview_Question_practice;
import java.util.*;
public class Dublicate_Integer_findOut_Practica2 {

	public static void main(String args[])
	{
		int arr[]= {1,2,4,5,7,3,5,8,6,8,4};
		
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> dublicate = new HashSet<>();
		
		for(int num : arr)
		{
			if(!s1.add(num))
			{
				dublicate.add(num);
			}
		}
		System.out.println("Dublicate Valus :"+dublicate);
		System.out.println("Remove Dublicate Values"+s1);
}
}