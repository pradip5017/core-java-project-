package collection_Framwork.set;

import java.util.HashSet;

//Set or HashSet Properties
//1.Set is a unordered type of collection means it does not preserves the
//insertion order
//Ramdamlly data store 
//2. duplicates are not allowed

//HashSet
//HashSet is combination of set + hashtable(hashtable is a table which stores
//the elements in key and value pair)
//Set<Integer> hs=new HashSet<Integer>();

public class HashSet_class {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		  hs.add(42);  //0
		  hs.add(30);  //1
		  hs.add(7);   //2
		  hs.add(89);  //3
		  hs.add(7);   //4
		  hs.add(30);  //5
		  hs.add(39);
		  hs.add(33);  // its print randomally
		  
		  System.out.println(hs);
		  
		  //Iterating set using for each
		  for(Integer  b : hs)
		  {
			  System.out.println(b);
			  
		  }

	}

}
