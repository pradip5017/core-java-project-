package Interview_Question_practice;

import java.util.*;
public class DublicateString_findOut_Practica1 {
	public static void main(String args[])
	{
		String str []= {"Dhhamma", "Hrushikesh","Karan","Karan", "Hrushikesh"};
		
		Set<String> s1 = new HashSet<>();
		
		Set<String> dublicate = new HashSet<>();
		
		for(String str1 : str)
		{
			if(!s1.add(str1))
			{
				dublicate.add(str1);
			}
		}
		System.out.println(dublicate);

}
}
