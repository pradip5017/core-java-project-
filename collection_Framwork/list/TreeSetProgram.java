package collection_Framwork.list;
import java.util.*;

// store the data in assending order to desendign order,
// dublicate are not allow in TreeSet in collection
public class TreeSetProgram {

	public static void main(String args[])
	{
		TreeSet<Integer> s1 = new TreeSet<>();
		
		s1.add(2);
		s1.add(53);
		s1.add(23);
		s1.add(98);
		s1.add(23);
		System.out.println(s1);
		
		s1.add(1);
		System.out.println(s1);
		
	}
}
