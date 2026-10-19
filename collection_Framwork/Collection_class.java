package collection_Framwork;

//Collection => group of OBJECTS that may be of similar type or of different types 
   
//framework  =>  it is an architecture which consists of predefined code in the form of classes,interfaces and method

//Collection Framework is divided into 2 categories
//1.Collection interface => List,Set,Map
//2.Collections  class

import java.util.ArrayList;                  


import java.util.Collections;
import java.util.List;

public class Collection_class {

	public static void main(String[] args) {
		//List is sequence data store and dublicate are allow
		
		List<Integer>  l1= new ArrayList(); //OR
		//ArrayList  l1= new ArrayList();
				   l1.add(29);  //0 //Object => Integer    //collection
				   l1.add(67); //1
				   l1.add(12);   //2
				   l1.add(13);   //3
				   l1.add(12); //4
				   l1.add(20); //5
				 
		 System.out.println(l1);
		 
//		 1 shorting
		 
//		 Collections.sort(l1);
//		 System.out.println(l1);
//		 
		 
//		 2 AddAll
//		 Collections.addAll(l1, 43,54,65,67,4);
//		 System.out.println(l1);
//		 
		 
//		 3 reverseOrder()
		 
//		 Collections.sort(l1, Collections.reverseOrder());
//		 System.out.println("reverse"+l1);
//		 
		 
//		 4 banarySearch()
//		 System.out.println(Collections.binarySearch(l1, 12));
//		 System.out.println(Collections.binarySearch(l1, 17));
		 
		 
//		 5 copy()
		 
//		 List<Integer> l2 = new ArrayList();
//		 
//		 Collections.addAll(l2, 0,0,0,0,0,0);
//		 
//		 System.out.println("Before copy "+l1); // copy one list to another 
//		 
//		 Collections.copy(l1, l2);
//		 
//		 System.out.println("After copy "+l2);
//		 
		 
		 
//		//6.disjoint(when there is no common elements between 2 collections)
		 List<Integer>  l2= new ArrayList(); //OR
			//ArrayList  l1= new ArrayList();
					   l2.add(200);  //0 //Object => Integer    //collection
					   l2.add(700); //1
					   l2.add(1200);   //2
					   l2.add(1300);     //3
					   l2.add(400); //4
					   l2.add(2000); //5
					 
			 System.out.println(l2);
			 
		System.out.println(Collections.disjoint(l1, l2));  //true => bcz, l1 and l2 are disjoint(no common element)
		 
		 
		 
	}

}
