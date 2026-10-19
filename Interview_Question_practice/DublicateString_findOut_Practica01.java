package Interview_Question_practice;

import java.util.HashSet;

public class DublicateString_findOut_Practica01 {
	public static void  main(String args[])
	{
		String arr[] = {"pradip", "rathod","pradip", "rathod", "rahul"};
		
		HashSet<String> s1 = new HashSet<>();
		HashSet<String> dublicate = new HashSet<>();
		
		for(String s : arr)
		{
			if(!s1.add(s))
			{
				dublicate.add(s);
			}
		}
		System.out.println("Dublicate  :"+dublicate);
	}

}
