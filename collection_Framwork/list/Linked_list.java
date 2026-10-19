package collection_Framwork.list;
import java.util.*;
public class Linked_list {
	public static void main(String args[])
	{
		LinkedList<Integer> l1= new LinkedList<>();
		
		l1.offer(23);
		l1.add(89);
		l1.offer(54);
		l1.offer(2);
		l1.offer(54);
		l1.offer(99);
		System.out.println(l1);
		
		System.out.println(l1.poll());
		
		System.out.println(l1.peek());
		System.out.println(l1);
	}

}
