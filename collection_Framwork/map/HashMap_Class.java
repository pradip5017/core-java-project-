package collection_Framwork.map;

import java.util.HashMap;             
import java.util.Map;

public class HashMap_Class {

	public static void main(String[] args) {
		
		//Map<K, V> hm= new HashMap();
		
				HashMap<Integer,String> hm= new HashMap();
				
					//randamally data store 
				//1.putting/adding entries in hashmap  
						hm.put(139,"dhoni");               //here 139 is key and "dhoni" is value.. and one key and value pair is called as one entry
						hm.put(155,"sachin");  
						hm.put(160,"rohit");  
						hm.put(780,"virat");  
						hm.put(560,"rahane"); 
//						hm.put(160,"Krunal");   //duplicate key does not allow in HashMap
						hm.put(130,"rishabh");  
//						hm.put(155, "sachin");
				      System.out.println(hm);
				      
				    //2.updating entries in hashmap  
//					      hm.put(160,"hardik");
//					      System.out.println(hm);
					      
					      
					//3.Accessing value of given key
//					   System.out.println(hm.get(560));
				      
				      
				      //3.traversing HashMAp using for each loop
				      //for( Object  n: hm.entrySet())
				    	  //OR
				     for( Map.Entry<Integer, String>  n: hm.entrySet()) //Map.Entry is sub interface of MAp
				     {
				    	 System.out.println(n);
				     }
				      
				      
				      
				      //4.
//				    System.out.println(hm.keySet());   // [160, 560, 130, 139, 155, 780]
//				    System.out.println(hm.values());	//[rohit, rahane, rishabh, dhoni, sachin, virat]
		

	}

}
