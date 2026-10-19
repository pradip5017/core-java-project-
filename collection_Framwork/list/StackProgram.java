package collection_Framwork.list;
import java.util.*;
// stack is last in first out datastructure in java
// stack is asyncronius data structure 
// stack is follow the 2 method push(); and pop();
// push() adding last element in stack;
// pop() removing last element in stack ;
public class StackProgram {
	public static void main(String args[])
	{
		Stack<String > s1 = new Stack<>();
		
		s1.push("lion");
		s1.push("dog");
		s1.push("cat");
		
		System.out.println(s1);
		System.out.println(s1.peek());
		
		Stack<String> s2 = new Stack<>();
		s2.add("pradip");
		s2.add("vishal");
		s2.add("nilesh");
		
		s1.addAll(s2);
		System.out.println(s1);
		System.out.println(s1.peek());
	}

}
