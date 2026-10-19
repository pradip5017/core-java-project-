package StringClass;


//string id immutable (not- changeble
public class immutability_of_String {
	public static void main(String[] args)
	{
//		String s1 = new String("Hello"); 
//		System.out.println(s1);
//		
//		
//		System.out.println(s1.concat("user")); //changeble  and concatanation 
//		System.out.println(s1);
//	
	
	
	
	
	StringBuffer s1 = new StringBuffer("Hello");  // not changeble fixd value store 
	System.out.println(s1);  //hello 
	
	
	System.out.println(s1.append(" Pradip"));
	System.out.println(s1);
	}

}


