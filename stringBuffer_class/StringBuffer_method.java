package stringBuffer_class;

public class StringBuffer_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb =new StringBuffer("hello java");
		System.out.println(sb);
		
		//1.inserting string
//		sb.insert(2, "IS A BOY");
//		System.out.println(sb);
		
		
		   //2.inserting integer number
//				sb.insert(10, 22);
//				System.out.println(sb);
		//3.delete 
//		  sb.delete(2, 5);  //deletes string starting from 2nd index till 4(5-1)
//		  System.out.println(sb);
		
		
//		4.reverse()
//		sb.reverse();
//	    System.out.println(sb);	
	    
	    
		//5.replace()
//		sb.replace(6, 10, "PYTHON");
//		System.out.println(sb);
//		
//		
		
//		6. ensurecapacity()
	
//		System.out.println(sb.capacity());
//		sb.ensureCapacity(500);
//		System.out.println("After ensurecapacity"+sb.capacity()); //it trims/reduce the capacity of SB object to its size ,capacity =10
//		
		
		
//		 //7. sb.trimToSize()
		System.out.println("before trimToSize ,length of sb = "+sb.length()); //10
		System.out.println("before trimToSize ,capacity of sb = "+sb.capacity()); //26
		 sb.trimToSize();     //it trims/reduce the capacity
//it trims/reduce the capacity of SB object to its size ,capacity =10
		 
		 System.out.println("after trimToSize ,length of sb = "+sb.length()); //10
			System.out.println("after trimToSize ,capacity of sb = "+sb.capacity()); //10
		
	}

}
