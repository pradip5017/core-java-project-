package collection_Framwork.list;

// collection Arraylist interface is used to store similar type and different type data sturucture 
// list is a static data structure not limit of size of memory space in list 
import java.util.*;
import java.util.Collection;
import java.util.ArrayList;
public class Collect_List {
	public static void main(String args[])
	{
		List<Object> arraylist = new ArrayList();
		
		arraylist.add(2);
		arraylist.add("pradip");
		arraylist.add("Rathod");
		arraylist.add("vishal");
		arraylist.add("nikam");
		arraylist.add(3);
		
//		
//		System.out.println(arraylist);
//		
//		arraylist.remove(2); // this will remove the element
//		System.out.println(arraylist);
//		
//		arraylist.remove(String.valueOf(2)); // this is remove whole element
//		System.out.println(arraylist);
//		
//		arraylist.clear(); // this line remove all element
//		System.out.println(arraylist);
//		
//		arraylist.add("Shree krishna..!!"); // add new elements
//		System.out.println(arraylist);
//		
////		arraylist.set(4, 300);
//		System.out.println(arraylist.contains(1));
//		
	
		for(int i=0; i<arraylist.size(); i++)
		{
			System.out.println(arraylist.get(i));
		}
		
		// for each loop 
		System.out.println("\n for Each loop..!!\n");
		for(Object obj : arraylist)
		{
			System.out.println(obj);
		}
	}

}
