package collection_Framwork.list;
import java.util.*;
public class LinkedHashSetProgram {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("pradip");
		lhs.add("Rathod");
		lhs.add("karan");
		lhs.add("pradip");// dublicate are not allow and sequence data store
		System.out.println(lhs);
		
		LinkedHashSet<String> h1 = new LinkedHashSet<>();
		h1.add("Vishal");
		h1.add("Pawan");
		h1.add("Herry");
		
		lhs.addAll(h1);
		System.out.println(lhs);
		
	}

}
