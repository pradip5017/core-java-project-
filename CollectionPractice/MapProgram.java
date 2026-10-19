package CollectionPractice;
import java.util.*;
public class MapProgram {
	
	public static void main(String args[])
	{
		Map m1  = new TreeMap<>();
				
		
		m1.put(11, "pradip");
		m1.put(2, "lakhan");
		m1.put(3, "karna");
//		m1.putAll(m1);
		m1.put(34, "rahul");
		m1.put(0, "hrushikesh");
		m1.put(4, "ambadas");
		m1.put(2, "pavan"); // override of value lakhan to pavan
		System.out.println(m1);
		
		
		
				
	
		
		
	}

}
