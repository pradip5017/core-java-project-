package Interview_Question_practice;
import java.util.*;
public class DublicateString_findOut_practice3 {
	public static void main(String args[])
	{
		String s1[]= {"apple","banana","chery","apple","banana"};
		
		//Using for HashSet 
		Set<String> seen= new HashSet<>();
		
		Set<String> dublicate = new HashSet<>();
		
		for(String str : s1)
		{
			if(!seen.add(str))
			{
				dublicate.add(str);
			}
		}
		System.out.println(dublicate);
	}

}
