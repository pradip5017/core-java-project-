package Array;

public class InterviewQuestion1 {
	public static void main(String args[])
	{
		
//		String s1 = "hello world";
//		
//		
//		for(int i=s1.length()-1; i>=0; i--)
//		{
//			
//			s1 =s1 +s1.charAt(i);
//		}
//		System.out.println(s1);
//	}

		
		
		//secound options
		
		String s1 = "Wellcome";
		String result="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			result = result + s1.charAt(i);
		}
		System.out.println(result);
		
}
}