package collection_Framwork;
import java.util.*;
public class Creating_ArrayList_for_storing_different_elements_practice {

	public static void main(String args[])
	{
		
		ArrayList a1 = new ArrayList();
		
		a1.add(98);
		a1.add(2.4);
		a1.add("pradip");
		a1.add(45);
		a1.add('p');
		a1.add(84);
		a1.add(true);
		
		System.out.println(a1);
		
		for(Object obj : a1)
		{
			System.out.println(obj);
			
		}
		
		
	}
}
