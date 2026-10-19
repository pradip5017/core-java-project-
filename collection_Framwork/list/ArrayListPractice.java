package collection_Framwork.list;

import java.util.List;  
import java.util.*;
import java.util.ArrayList;
//Array list is a sequence order data store 
//dublicate are allow in array list 
// array list is a store dynamic data structure in program 
// no limit of memory allocation
// ArrayList is class in Collection 
public class ArrayListPractice {
	public static void main(String args[])
	{
		
	List<Integer> list =  new ArrayList<>();
	
	list.add(1);
	list.add(3);
	list.add(54);
	System.out.println(list);
	
	ArrayList<Integer> s1 = new ArrayList<>();
	
	s1.add(98);
	s1.add(3);
	s1.add(75);
	
	list.addAll(s1);
	System.out.println(list);
		
	list.remove(1);
	System.out.println("Remove 1st Element of list :"+list);
		
//	list.clear();
//	System.out.println("Remove of all element :"+list);
	
	list.addFirst(2);
	System.out.println("Adding first Element of list :"+list);
		
	 
	list.addLast(984);
	System.out.println("Adding last Element of Array :"+list);
	}

}
