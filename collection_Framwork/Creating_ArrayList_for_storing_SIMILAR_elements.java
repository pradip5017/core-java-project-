package collection_Framwork;

import java.util.ArrayList;          
import java.util.Arrays;
import java.util.List;

public class Creating_ArrayList_for_storing_SIMILAR_elements {

	public static void main(String[] args) {
		
		//Generics=> is used to achieve datatype safety in the programming and 
				//it is also used to apply restrictions on different type data to get insert into collection
		//and allows user to add same type of elements only 	     
		//generic is used as a parametric type enclosed in <> brackets. 
				//and in this brackets we need to pass classname as a parameter always
			       //means in below list we are passing <Integer> as a generic so,
				//we can not add different type of elements into "l1" except integer
		//Generic can be used as parameter with class and interface names only
		

		List<Integer> l1 = new ArrayList();
		
		l1.add(34);
		l1.add(35);
		l1.add(36);
//		l1.add(3.f7);   //error=> bcz, we cannot allow to other elements except integer in l1

		l1.add(38);
		l1.add(39);
		
		System.out.println(l1);
		
//		1.adding element on specific position
//		 l1.add(2, 34);
//		 System.out.println(l1);
		 
		 //2.removing an element from specific position
			// l1.remove(4);     //4=> index
			 //System.out.println(l1);
			 
			 
			 //3.removing all elements
			 //l1.clear();
			 //System.out.println(l1);
			
			 
			 //4.accessing element from collection
			 //System.out.println(l1.get(1));          //1=> index
			 
			 
			 //5.accessing index of given element
			 //System.out.println(l1.indexOf(12) );bhhinghgghjkoiyiukbfe435lk/.l,9886tk
			 //System.out.println(l1.lastIndexOf(12));
			 
			 
			 //6.replacing an element
			// l1.set(2, 34);
			 //System.out.println(l1);
			 
			 
			 //7.subList => subpart of whole list
//			 System.out.println(l1.subList(2, 5));     //starting index i.e 2 here is included in the output and ending index 5 is excluded from the output
		
//		    list to array conversion
			 //8.toArray => converting collection into fixed size array
			   
		    	Object a[]=new Object[l1.size()];
//		    	
		    	System.out.println("before copy array a :");	
		    	System.out.println(Arrays.toString(a));  //printing an array
//		    			
		    	a= l1.toArray();
			     System.out.println("after copy array a :");
			     System.out.println(Arrays.toString(a));   //printing an array

		
	}

}
