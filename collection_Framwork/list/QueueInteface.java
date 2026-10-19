package collection_Framwork.list;
import java.util.*;
public class QueueInteface {
	public static void main(String args[])
	{
		Queue<Integer> s1 = new LinkedList<>();
		
		s1.offer(11);
		s1.offer(55);
		s1.offer(43);
		
		System.out.println(s1);
		
		System.out.println(s1.poll());
		System.out.println("Poll :"+s1);
		
		s1.add(64);
		s1.add(43);
//		s1.poll(); // remove first element
		System.out.println(s1);
		
		
	}

}
