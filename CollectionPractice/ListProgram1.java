package CollectionPractice;

import java.util.*;

// list is a Sequence order data store and duplicate Are Allow 
public class ListProgram1 {
	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
////		
//		list.add(12);
//		list.add(21);
//		list.add(34);
//		
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);
//		
		
		
		
		
//		list.addAll(Arrays.asList(33,45,75));
//		System.out.println(list);
		
		
		
		
		// Reverse Order in Collections
		
		List list = new ArrayList<>();
		list.add(12);
//		list.add("pradip");
		list.add(98);
		list.add(54);
		list.add(43);
		list.add(1);
		list.add(99);
		list.add(43);
		
		Collections.addAll(list, 12,45,78,97,44,3);
//		Collections.sort(list, Collections.reverseOrder());
		Collections.sort(list);
		System.out.println("List print : "+list);
		
		
//		System.out.println(list);
		
	
		
		
	
	}

}
