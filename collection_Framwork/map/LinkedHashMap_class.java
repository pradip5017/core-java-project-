package collection_Framwork.map;

import java.util.HashMap;         
import java.util.LinkedHashMap;

/*
//LinkedHashMap=> Linked list + hashMAp 
//LinkedHashMap is the child class of HashMap class
//LinkedHashMap=> linked list +Hash table + Map
//1. LinkedHAshMap  follows the insertion order(property of list)
//2. It does not allows duplicate entries..(property of set)

*/

//2.computer=> performs an operation on the value of given key


public class LinkedHashMap_class {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hm= new LinkedHashMap();
		
		//sequence data store and dublicate are not allows
		//1.putting/adding entries in hashmap  
				hm.put(139,"dhoni");               //here 139 is key and "dhoni" is value.. and one key and value pair is called as one entry
				hm.put(155,"sachin");  
				hm.put(160,"rohit");  
				hm.put(780,"virat");  
				hm.put(560,"rahane"); 
//				hm.put(160,"rohit");   //duplicate key does not allow in HashMap
				hm.put(130,"rishabh");  
				
		      System.out.println(hm);
		      
		      
//		      //2.computer=> performs an operation on the value of given key
		      
//		      hm.compute(160, (k,v)-> v.concat("Sharma"));
//		      System.out.println(hm);
		      
		      
		      
//		      hm.compute(560, (k,v)-> v.replace("r","Sh"));
//		      System.out.println(hm);
		      
//		      hm.compute(160, (k,v)-> v.toUpperCase());
//		      System.out.println(hm);
		      
		      
//		      //int to String conversion => String.valueOf()
			     //String to int conversion  => Integer.parseInt()
		      
		      
//		      String len = hm.compute(130, (k,v) -> String.valueOf(v.length()));
//		      System.out.println("Lenght of value of String "+len);
		      
		      
		    //3. computeIfAbsent/add If absent => it performs an operation only if given key is absent
//		      hm.computeIfAbsent(157 ,v->"ashwin");
//		      System.out.println(hm);
//		      
//		      hm.computeIfAbsent(155 ,v->"ashwin");
//		      System.out.println(hm);
		      
		      
		    //4.computeIfPresent() => update if  given key is present in map
		      hm.computeIfPresent(155 ,(k,v)->"ashwin");
		      System.out.println(hm);

	}

}
