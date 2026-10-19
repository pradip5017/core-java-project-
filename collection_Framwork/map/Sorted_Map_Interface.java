package collection_Framwork.map;

 
import java.util.SortedMap;               
//SortedMAp is child interface of Map interface which sorts the entries of map in ascending order based on the keys
//TreeMAp is  implementation class for SortedMap interface
import java.util.TreeMap;

//Collection=> interface
//Collections => class

public class Sorted_Map_Interface {

	public static void main(String[] args) {
		
		//SortedMap performs all the operations on Sorted entries
		
  TreeMap<Integer, String> hm= new TreeMap<Integer, String>();
		

		//1.putting/adding entries in hashmap  
				hm.put(139,"dhoni");               //here 139 is key and "dhoni" is value.. and one key and value pair is called as one entry
				hm.put(155,"sachin");  
				hm.put(900,"rohit");  
				hm.put(780,"virat");  
				hm.put(560,"rahane"); 
				//hm.put(160,"rohit");   //duplicate key does not allow in HashMap
				hm.put(130,"rishabh");  
				
		      System.out.println("asending "+hm);
		      
//		     1.
		     
		      	System.out.println("Decending "+hm.descendingKeySet());
		      	
		      	
		      	
//		      	2.
		      	
//		      	asc 
		      	
//		      	System.out.println(hm.ceilingEntry(900));
//		      	System.out.println(hm.ceilingEntry(560));
		      	
		      	
//		      	3. floor Entry
		      	
//		      	System.out.println(hm.floorEntry(155));
//		      	System.out.println(hm.floorEntry(900));
//		      	
		      	
//  		 4. head map

//		      	System.out.println(hm.headMap(560));
		      	
		      	
//		      	//5.tailMap()=> returns ALL entries which are greater than or equal to  given key
		      	
//		      	System.out.println(hm.tailMap(560));
		      	
//		      	
		      	
		      	
//		      	6.firstMap
		      	
		      	System.out.println(hm.firstEntry());  // 130=rishabh
		      	
//		      	7. LastMap
		      	
		      	System.out.println(hm.lastEntry()); //900=rohit
		      	
		      	
		      	
//		      
		      	
		      //8.subMap
				//sortedMap= {130=rishabh, 139=dhoni, 155=sachin, 160=rohit, 560=rahane, 780=virat}
//			System.out.println(hm.subMap(560, 900));  //{560=rahane, 780=virat}
	    		                           //returns entries from sortedmap where starting key is included where ending key is excluded
	}

}
