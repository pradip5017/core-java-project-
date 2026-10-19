package Interview_Question_practice;

import java.util.HashSet; 
import java.util.Set;

public class DuvlicateString_findOut {

	public static void main(String args[])
	{
		String [] inpute = {"apple", "banana", "mango","apple","banana","chery"};
		
		Set<String> seen= new HashSet<>();
		
		Set<String> dublicate = new HashSet<>();
		
		for(String  str :inpute)
		{
			if(!seen.add(str))
			{
				dublicate.add(str);
			}
		}
		System.out.println(dublicate);
	}
}



/* String [] input = {"apple", "banana", "mango", "apple", "banana"};
		
		Set<String> seen = new HashSet<>();
		
		Set<String> dublicate = new HashSet<>();
		
		for(String str : input)
		{
			if(seen.add(str))
			{
				dublicate.add(str);
			}
		}
	
		System.out.println("Dublicate String "+dublicate);
		
		*/
