package collection_Framwork.set;

import java.util.LinkedHashSet;

//LinkedHashSet => LinkedList + HashSet(hashtable+set)
//LinkedHashSet  follows one property of set and one property of list,
//i.e it preserves insertion order(list) but not allow duplicate values(set)

//HashSet follows the properties of SET only

public class LinkedHashSet_class {

	public static void main(String[] args) {
	
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		  lhs.add(42);  //0
		  lhs.add(30);  //1
		  lhs.add(7);   //2
		  lhs.add(89);  //3
		  lhs.add(7);   //4
		  lhs.add(30);  //5
		     
		  
		  System.out.println("lhs1 "+lhs);
		  
		  
		  
		  LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();
			
		  lhs2.add(300);  //0
		  lhs2.add(30);  //1
		  lhs2.add(400);   //2
		  lhs2.add(89);  //3
		  lhs2.add(700);   //4
		  lhs2.add(200);  //5
		  lhs2.add(30); // dublicate are not allow in LinkedHashSet
		  
		      
		  
		  System.out.println("lhs2 "+lhs2);     //adding all the elements of lhs2 into lhs and storing result into lhs
		  
		/*  1 . union 
		//1.union => combining/joining 2 or more sets by avoiding duplicate elements
		  
		  
		
		  lhs.addAll(lhs2);
		  System.out.println("After addAll . lhs="+lhs);
		  System.out.println("After addAll . lhs2="+lhs2);
		  
		  */
		  
		  
/*  //2.intersection => finding common elements from 2 or more sets
		//retaining all the common elements of lhs2 into lhs and storing result into lhs
		  
		  
		  lhs.retainAll(lhs2);  
		  
		  System.out.println("After retainAll , lhs  . lhs="+lhs); //lhs1 = [30,  89,]
		  System.out.println("After retainAll , lhs2 ="+lhs2); //[300, 30, 400, 89, 700, 200]
		  
		  */
		  
		  //3.difference=> returns an elements which are present in one set but not in another set
		  //lhs1 = [42, 30, 7, 89, 12]
		//lhs2 = [300, 30, 400, 89, 700, 200]	
		  
		  lhs.removeAll(lhs2);    //removing all the elements of lhs2 from lhs and storing result into lhs
		                             //OR removing common elements from one set 
		  // lhs2.removeAll(lhs);
		  
			  System.out.println("after removeAll , lhs = "+lhs);   //lhs = [42,  7,]           //lhs1 = [30,  89,]
			  System.out.println("after removeAll , lhs2 = "+lhs2);        //lhs2 = [300, 30, 400, 89, 700, 200]
	}

}
