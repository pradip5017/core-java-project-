package stringBuffer_class;
//As StringBuffer   objects are mutable so its length gets varry and hence we need to specify the capacity of stringbuffer object
/*
Capacity is nothing but the number of characters that are accommodate in StringBuffer  object.
Length is nothing but the number of characters that are actually present in StringBuffer object.

*/

public class Capacity_of_stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
StringBuffer sb = new StringBuffer();
System.out.println("default capacity of empty StringBuffer object = "+sb.capacity()); //16*2+2)


	sb.append("pradiprathodpradiprathod");
	System.out.println("after adding 16 characters capacity of StringBuffer object = "+sb.capacity()); //43
	
	
	
	sb.append("prradippradiprathodfpodihf");
	System.out.println("after adding 34 characters capacity of StringBuffer object = "+sb.capacity()); //70
	
	
	sb.append("prisdjpir hsddfjdjjdcdh");
	System.out.println("after adding 70 characters capacity of StringBuffer object = "+sb.capacity()); //142
	
	
	sb.append("rpipopipi");
	System.out.println("after adding 140 characters capacity of StringBuffer object = "+sb.capacity()); //16
	
	
	
	
	StringBuffer p1 = new StringBuffer("Hello words ");
	
	System.out.println("Defualt capacity is"+p1.capacity());
	System.out.println();
	}
}
