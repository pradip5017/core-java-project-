package CollectionPractice;

import java.util.*;

//Enumeration is cursor and it is iteration of vector 
// enumeration are only legecy class follow eg(vector & stack)

public class VectorProgram {
	public static void main(String[] args) {
		
		Vector v1 = new Vector<>();
		
		v1.add(12);
		v1.add(32);
		v1.add("pradip");
		v1.add(54);
		
//		System.out.println(v1);
		
		Enumeration e = v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(" Enumeration :"+e.nextElement());
		}
				
	}

}
