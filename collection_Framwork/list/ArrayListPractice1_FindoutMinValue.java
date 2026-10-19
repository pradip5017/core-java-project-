package collection_Framwork.list;
import java.util.*;
public class ArrayListPractice1_FindoutMinValue {
	public static void main(String args[])
	{
		List<Integer> s1 = new ArrayList<>();
		
		s1.add(112);
		s1.add(53);
		s1.add(80);
		s1.add(43);
		s1.add(543);
		s1.add(834);
		
		System.out.println("Find out minimum Value:"+Collections.min(s1));// find out min values in ArrayList
		
		System.out.println("Maximum Values :"+Collections.max(s1));
		
		System.out.println("Values check true or False :"+s1.contains(43));// checking value true or false 
		
		System.out.println("Size of index :"+s1.size());
		
		
		
	}

}
