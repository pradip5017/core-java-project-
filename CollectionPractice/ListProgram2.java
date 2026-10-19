package CollectionPractice;

import java.util.*;
// list is store data in index form 
// list is a insertion order data Structure 
// dublicate are allow in list 
// null values are allow in list interface


// there are three construction of arrayList class
//1 ArrayList is default constructor
//2 collection c
// 3 int initial capasity
public class ListProgram2 {
	public static void main(String[] args) {
		
		List list = new ArrayList<>();  // default constructor
		
		list.add(12);
		list.add(32);
		list.add("pradip");
		list.add(53);
		list.add(4,30);  // which index store 30 values
		list.add(54);
		list.add(null); // list allow multiple null  values
		list.add(null);
		list.add(292308509);
//		System.out.println(list);
		
//		ArrayList s1 = new ArrayList(list); //collection c constructor
		
//		Iterator it = list.iterator();
//		while(it.hasNext())
//		{
//		System.out.print(it.next()+" ");
//		}
	}

}
