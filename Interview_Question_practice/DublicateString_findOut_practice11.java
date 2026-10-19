package Interview_Question_practice;

import java.util.Set;
import java.util.*;

public class DublicateString_findOut_practice11 {
	public static void main(String args[])
	{
		String arr[]= {"Apple","banana","chery","Apple","banana"};
		
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = new HashSet<>();
		
		for( String str  : arr)
		{
			if(!s1.add(str))
			{
				s2.add(str);
			}
		}
		System.out.println(s2);
		
	}

}
