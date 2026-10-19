package collection_Framwork.list;
import java.util.*;
// stack is a last in fist out(lifo)
public class Collection_Stack {

	public static void main(String args[])
	{
		Stack<String> st =  new Stack<>();
		
		st.push("pradip");
		st.push("Rathod");
		st.push("nikam");
		st.push("animal");
		
		System.out.println(st);
		System.out.println(st.peek());
		
		System.out.println(st.pop());
		System.out.println(st);
	}
}
