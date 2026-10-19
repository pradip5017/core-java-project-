package Interview_Question_practice;
import java.util.*;
public class DublicateString_findOut_Practical {
	public static void main(String args[])
	{
		String a[]= {"Apple","banana","chery","mango","Apple","banana"};
		
		Set<String> s1 = new HashSet<>();
		
		Set<String> dublicate = new HashSet<>();
		
		for( String arr : a)
		{
			if(!s1.add(arr))
			{
				dublicate.add(arr);
			}
		}
		System.out.println(dublicate);
		
	}

}
