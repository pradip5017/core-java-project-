package collection_Framwork;
import java.util.*;

//ArrayList(non syn/multithreaded) => as arraylist is non-synchronized multiple threads 
//gets execute at the same time hence Arraylist faster as compared to Vector
//Vector(Synchronized/at a time one thread gets execute on Vector object) and 
//HashTable is synchronized

//Vector is the implementation class of List interface 
//Vector is same as ArrayList, means like ArrayList it also uses dynamic array to store
//its elements

//the only difference between both is ArrayList is non-synchronized whereas 
//Vector is Synchronized

//another difference between Vector and ArrayList is about capacity
//Default capacity of ArrayList before java8 is 10,,after java8 the capacity will be 0..
//means according to the no of elements capacity of ArrayList is decided
//Default capacity of Vector is 10

//And in LinkedList,it don't have capacity because the nodes/elements in LinkedList
//does not store in memory..each node is only having pointer to the next node

//In c++
//Q,Difference bet array and Vector?   //arrayList and Vector

//=> array is static                     //arrayList is nonsyn    
//=> Vector is dynamic                   //Vector is syn


//Q.What is diff between Vector and arrayList?
//Similarity => both Vector and arrayList internally uses dynamic array to stored the element
//Difference => ArrayList is non-synchronized and  Vector is synchronized 


public class Vector_Class {

	public static void main(String[] args) {
		
		Vector<Character> v1 = new Vector();
		 
		v1.add('h');
		v1.add('e');
		v1.add('l');
		v1.add('l');
		v1.add('o');
		
		System.out.println(v1);
		
//1 capacty
		
		System.out.println("defualt capacity of vector is ="+v1.capacity());
		System.out.println("Size of vector="+v1.size());
		
		
//		v1.add('f');
//		v1.add('r');
//		v1.add('n');
//		v1.add('d');
//		v1.add('s');
//		
//		System.out.println("After addtion exactally 10 chars, chapacity of "+v1.capacity());
//		v1.add('z');
//		System.out.println("After adding 11th capaticy of adding double by 2 (10+2)= "+v1.capacity());
//		
		
		  //2.insertElementAt() => in vector we can perform insertion and deletion at any position
		   // v1.insertElementAt('P', 2); //l
		    //System.out.println(v1);
		    
		    
		    //3.removing elements
		    //v1.remove(1);  //e
		    //System.out.println(v1);
		    
		    
		    //4.Accessing element from vector
		   // System.out.println( v1.elementAt(4));  //o
		    
		    
		    
		    //5.
		 //System.out.println(v1.firstElement());
		   
		    
		    //6.trims capacity of vector to its size
		    System.out.println("before trimToSize, capacity  = "+v1.capacity()); //10
		    v1.trimToSize();
		    System.out.println("afte trimToSize, capacity  = "+v1.capacity()); //5(because size of vector v1 is also 5)
	
	}

}
