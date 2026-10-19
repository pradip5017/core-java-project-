
package StringClass;

public class ReverseString {
	public static void main(String args[])
	{
		/*
		String s1 = "Programming";
		String result ="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			result +=s1.charAt(i);
		}
		System.out.println(result);
		*/
		
		String s1 = "Programming";
		
		StringBuffer  result = new StringBuffer(s1);
		System.out.println(result.reverse());
//		System.out.println(result);
	
		
		
	}

}
