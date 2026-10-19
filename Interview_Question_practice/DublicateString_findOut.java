	package Interview_Question_practice;	
	import java.util.*;
	public class DublicateString_findOut {
		public static void main(String args[])
		{
			String s1[]= {"Apple","banana","chery","Apple","banana","Mango","chery","pineApple"};
			
			Set<String> seen = new  HashSet<>();
			
			Set<String> result= new HashSet<>();
			
			for( String str :s1)
			{
				if(!seen.add(str))
				{
					result.add(str);
				}
			}
			System.out.println(result);
		}
		
		
	}
