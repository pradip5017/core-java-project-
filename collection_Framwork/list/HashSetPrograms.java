package collection_Framwork.list;
import java.util.*;
public class HashSetPrograms {
	public static void main(String args[])
	{
		HashMap<Integer,String> s1 = new HashMap<>();
		
		s1.put(1, "pradip");
		s1.put(2, "Rathod");
		s1.put(3, "Vishal");
		System.out.println(s1);
		
		for(Integer key :s1.keySet())
		{
			System.out.println(key); // show key only
		}
		
		for(String obj : s1.values())
		{
			System.out.println(obj);// show values only
		}
	}

}
