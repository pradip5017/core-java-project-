package Interview_Question_practice;
import java.util.*;

public class DublicateString_findOut_Practica0 {
	
	public static void main(String args[])
	{
		String arr[]= {"Apple", "Banana", "Apple","Chery","Banana","mango"};
		
		Set<String> s1 = new HashSet<>();
		
		Set<String> s2 = new HashSet<>();
		
		for(String srt : arr)
		{
			if(!s1.add(srt))
			{
				s2.add(srt);
			}
		}
		
		System.out.println(s2);
		
		
	}

}
