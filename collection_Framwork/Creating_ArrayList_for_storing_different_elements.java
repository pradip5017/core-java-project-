package collection_Framwork;

import java.util.ArrayList;               
import java.util.List;
//Collection => group of OBJECTS that may be of similar type or of different types
//framework  =>  it is an architecture which consists of predefined code in the form of classes,interfaces and method

//Collection Framework is divided into 2 categories
//1.Collection interface => List,Set,Queue, Map
//2.Collections  class

//java.util

//Data structure/organize=>Collection

//List => sequential/ordered type of collection
//1. list preserves/maintains the insertion order
//2. list allows duplicate elements/object


//Difference between Array and Collection(ArrayList)?
//1.in array, we can store only similar type of data
//1.in ArrayList, we can store both  similar as well as different type of data

//2.Array is static type of Data Structure means in an array we need to specify size of an array
//2.ArrayList is dynamic type of Data Structure means in an arraylist(or in any collection) we need NOT to specify size of an array


public class Creating_ArrayList_for_storing_different_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a[3]={4,6,78,8,22,2};     //array
		
		//List  l1= new ArrayList(); //OR
		
//		List l1 = new ArrayList();   //or
		ArrayList l1 = new ArrayList();
		l1.add(43);		//0 //Object => Integer    //collection

		l1.add(4.6f);	
		l1.add('p');	
		l1.add(true);
		l1.add(43);	
		l1.add(5.6);
		l1.add(43);	
		l1.add(45.6);
		
		System.out.println(l1);
		
		for(Object n : l1)  // for Each loop
		{
			System.out.println(n);
		}
		

	}

}
