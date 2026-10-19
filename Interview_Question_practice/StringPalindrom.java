package Interview_Question_practice;

public class StringPalindrom {
	
	public static void main(String args[])
	{
//		String s1 ="madam";
//		
//		String s2 ="";
//		for(int i=s1.length()-1; i>=0; i--)
//		{
//			s2 +=s1.charAt(i);
//		}
//		
//		if( s1.equals(s2))
//		{
//			System.out.println("True");
//		}
//		else {
//			System.out.println("false");
//		}
//		System.out.println(s2);
		
		
		String s1 ="pradip";
		
		String result ="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			result +=s1.charAt(i);
		}
		if(s1.equals(result))
		{
			System.out.println("True :"+result);
		}
		else
		{
			System.out.println("False :"+result);
		}
		
	}

}
