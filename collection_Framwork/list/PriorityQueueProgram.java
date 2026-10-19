package collection_Framwork.list;
import java.util.*;
public class PriorityQueueProgram {
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(43);
		pq.add(49);
		pq.add(44);
		pq.add(32);
		pq.add(43);
		
		System.out.println(pq);
		
		
		System.out.println(pq.element());
		System.out.println(pq);
		
		
	}

}
