package stringBuffer_class;
//parameterize constructor 
public class Constructor_of_String_Buffer {
	public static void main(String[] args) {
		
		//2.constructor2 =>StringBuffer(int initialCapacity)
		StringBuffer sb =new StringBuffer(1000);     //here, 1000 is the capacity specified by the user
		System.out.println("default capacity of empty StringBuffer object = "+sb.capacity()); //1000

//3.constructor3 =>StringBuffer(String str)
				
//		StringBuffer sb =new StringBuffer("hello");   //newCapacity= sb.length+sb.currentCapacity
//				System.out.println("total capacity of StringBuffer if it conatins = "+sb.capacity()); //1000
	}

}
