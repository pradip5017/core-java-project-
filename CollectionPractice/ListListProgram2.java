package CollectionPractice;
import java.util.*;
public class ListListProgram2 {
	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList<>();
		
		l1.add(12);
		l1.add(43);
		l1.add(23);
		l1.add(89);
		
//		l1.remove(2);
		System.out.println(l1);
		
		ArrayList l2 =new ArrayList<>();
		l2.add(101);
		l2.add(102);
		l2.add(103);
		l2.add(104);
		
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l1.add("pradip"));
		l1.add("Rahul");
		System.out.println(l1);
		
		System.out.println(l1.contains(101));
		
		l1.remove("Rahul");
		System.out.println(l1);
		
//		l1.clear(); // clear of whole object
//		l1.clone(); // clone is create Exact Copy of object
//		System.out.println("clear :"+l1);
		
	
//		l1.removeAll(l2); // remove
//		l1.clear();
//		System.out.println(" :"+l1.size()); // check the size of ArrayList
//		l1.set(2, "pradip"); // remove old element this index and add new element this index
//		l1.indexOf(4);
		System.out.println(" :"+l1);
	}
	
}
