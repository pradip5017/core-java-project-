package collection_Framwork.Queue;
import java.util.*;
// queue is a interface of collection 

// 
public class Collection_interface_Queue {
	public static void main(String args[])
	{
		Queue<Integer> q1 = new LinkedList<>();
//		q1.add(2);
//		q1.add(9);
		
		q1.offer(2);
		q1.offer(54);
		q1.offer(99);
		System.out.println(q1);
		
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		
		
		
	}

}
