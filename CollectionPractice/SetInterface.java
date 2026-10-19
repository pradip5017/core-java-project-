package CollectionPractice;

import java.util.*;

// set is not store index element  it  is store hashcode type values
// set are not allow dublicate values 
// set are does not follow insertion order
// only one null value allow in set
public class SetInterface {
	public static void main(String[] args) {
		
		Set s1 = new HashSet<>();
		s1.add(12);
		s1.add(23);
		s1.add(43);
		s1.add(45);
		
		System.out.println("Set 1 :"+s1);
		
		
		HashSet s2 =  new HashSet<>();
		s2.add(101);
		s2.add(102);
		s2.add(103);
		s2.add(104);
		s1.addAll(s2);
		System.out.println("Set 2 :"+s2);
		s1.addAll(s2);

		s2.add(101);// dublicate are not allow in set
		
		s1.add(null);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		
		
		
	}

}
