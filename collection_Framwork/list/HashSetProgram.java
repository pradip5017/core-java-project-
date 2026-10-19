package collection_Framwork.list;
import java.util.*;

// HashSet is randomaly data store
// dublicate elemenet are not allow in Hashset Class


public class HashSetProgram {
	public static void main(String args[])
	{
		HashSet<Integer> s1 = new HashSet<>();
		
		s1.add(12);
		s1.add(53);
		s1.add(89);
		s1.add(32);
		s1.add(12);
		
		System.out.println(s1);
		
		s1.add(22);
		s1.remove(2);
		System.out.println(s1.contains(53));//check element is present or not 
		
		
	}

}
