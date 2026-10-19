	package Interview_Question_practice;
	import java.util.*;
	public class DublicateString_findOut_Practica8 {
	 public static void main(String args[])
	 
	 {
		 String arr[]= {"pradip","pradip","rathod","rahul","rathod"};
		 
		 HashSet<String> s1 = new HashSet<>();
		 HashSet<String> dublicate = new HashSet<>();
		 
		 for( String str : arr)
		 {
			 if(!s1.add(str))
			 {
				 dublicate.add(str);
				 
			 }
		 }
		 System.out.println(dublicate);
		 
	 }
	}
