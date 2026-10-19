package Interview_Question_practice;

import java.util.HashMap;
import java.util.Map;
//import java.util.*;

public class Maximum_Repeate_Charector_Using_Map {
	public static void main(String args[])
	{
		String s ="abbcccdddd";
//		s=s.replaceAll("//s","");//remore Space of count
		
		HashMap<Character, Integer>hm = new HashMap<>();
		
		char[] c=s.toCharArray();
		
		for(char ch:c)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		int maxCount=0;
		char maxChar=' ';
		
		for(Map.Entry <Character, Integer> me: hm.entrySet())
		{
			if(maxCount < me.getValue())
			{
				maxCount = me.getValue();
				maxChar = me.getKey();
			}
		}
		System.out.println("Maximum repeated charecter is ="+maxChar);
	}

}
