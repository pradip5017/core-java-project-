package Interview_Question_practice;
import java.util.*;
public class DublicateString_findOut_practice {
	public static void main(String args[])
	{
		String x[] = {"Apple","banana","chery","pinapple","mango","Apple","banana","mango"};
		
		Set<String> s1 = new HashSet<>();
		
		Set<String> dublicate = new HashSet<>();
		
		for(String str  :x)
			
		{
			if(!s1.add(str))
			{
				dublicate.add(str);
			}
		}
		
		System.out.println(dublicate);
	}
}
