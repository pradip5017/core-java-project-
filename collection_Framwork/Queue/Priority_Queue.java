package collection_Framwork.Queue;
import java.util.*;
	// priorityQueue means giving first privacy of element 
	// jo  element ko first priority milegi o print hoga 
	// for example = politics admi ko first priority hota hai 
public class Priority_Queue {
	public static void main(String args[])
	{
		// ascending to descending data store  
		// lowest to highest data store in priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//PriorityQueue<Integer> pq=  new PriorityQueue<>(Comparator.reverseOrder());// big value to small value data show to use this constructor
		pq.offer(56);
		pq.offer(34);
		pq.offer(43);
		pq.offer(31);
		pq.offer(43);
		pq.offer(35);
		pq.offer(87);
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		pq.peek(); // first priority given my 34 element
		System.out.println(pq);
	}

}
