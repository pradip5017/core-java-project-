package collection_Framwork;

import java.util.Stack;

//Stack is a subclass of vector, the difference between Vector and Stack is we 
//can performed insertion and deletion operation at any index means on the middle
//of the vector also
//but In stack, insertion(push) and deletion(pop) operations are performed
//on top of stack only

//Stack follows the principle of Last In First Out(LIFO)
//there are 2 basic operations performs on the stack like push() and  pop() methods


public class Stack_class {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(65);
		s1.add(63);
		s1.add(5);
		s1.add(15);
		s1.add(25);
		
		
		System.out.println(s1);
		
		//1.
		  //System.out.println(s1.empty());  //false
		   
		  
		   
		   //2.push()=> insertion
		  // s1.push(45);
		  // System.out.println(s1);
		   
		   
		   
		   //3.pop() ==> access and remove element present on Top Of Stack
		   //System.out.println(s1.pop());   //10
		   //System.out.println(s1);
		   
		   
		   //4.peek ==> access but does not remove element present on Top Of Stack
		   //System.out.println(s1.peek());   //10
		   //System.out.println(s1);   
		   
		   
		   //5.search
//		   System.out.println(s1.search(5));  //index=3
//		   System.out.println(s1.search(35));  //index= -1 bcz,35 is not present in staxk s1
		   
		
		   
		   System.out.println(s1.capacity());

		   
//		   System.out.println(s1.size());
		

	}

}
