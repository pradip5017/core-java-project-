package Interview_Question_practice;
import java.util.*;

public class DublicateString_findOut_Practica9 {
	public static void main(String args[])
	{
		String arr[] = {"Apple", "banana","Apple","banana","chery"};
		
		Set<String> s1 = new HashSet<>();
		Set<String> dublicate = new HashSet<>();
		
		for(String str :arr)
		{
			if(!s1.add(str))
			{
				dublicate.add(str);
			}
		}
		System.out.println(dublicate);
		
	}

}
