package collection_Framwork.set;

import java.util.TreeSet;
//SortedSet is an interface and TreeSet is the implementation class of SortedSet
//SortedSet interface sorts the objects of collection in ascending order by default
//NavigableSet interface is the child interface of SortedSet interface and like SortedSet interface NavigableSet interface also sorts an  objects of collection in ascending order

public class SortedSet_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SortedSet<Integer> ts=new TreeSet<Integer>();
				//NavigableSet<Integer> ts=new TreeSet<Integer>();
				TreeSet<Integer> ts=new TreeSet<Integer>();
				ts.add(67);
				ts.add(89);
				ts.add(19);
				ts.add(12);
				ts.add(77);
				ts.add(3);
				ts.add(19);
				
				System.out.println("asending set="+ts);
				
				
				//1.Ceiling() => returns an element which is greater than or equal to the given element,
				
//				System.out.println(ts.ceiling(92));  //null bcz, equal to 92 or greater than 92 is not there in ts
//				System.out.println(ts.ceiling(17));
				
//				System.out.println(ts.floor(12));
				 
				
				
//			//2.floor() => returns an element which is less than or equal to the given element,
				
//				System.out.println(ts.floor(12)); // 12
				
				
				//3.headSet() => returns ALL  elements which are strictly less than given element from set
				
//				System.out.println(ts.headSet(19)); //[3, 12]
				
				//4.tailSet() => returns ALL  elements which are greater than or equal to given element from set
				
//				System.out.println(ts.tailSet(67));   //[67, 77, 89]
				
//				5.
//				System.out.println("decending  set ="+ts.descendingIterator());
				
				
				
//				/6.First() => returns first/smallest element from SortedSet
				
//				System.out.println(ts.first());  // 3
				
				//7.last() => returns last/largest element from SortedSet
				
//				System.out.println(ts.last());
				
//				8.pollFirst() => access and remove first/lowest element from SortedSet
//				sorted set=[3, 12, 19, 67, 77, 89]
				System.out.println(ts.pollFirst());   //3
				System.out.println(ts);
				
//				9.pollLast() => access and remove last/highest element from SortedSet
				
				System.out.println(ts.pollLast());
	}

}
