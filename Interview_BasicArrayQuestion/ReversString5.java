package Interview_BasicArrayQuestion;

public class ReversString5 {
	public static void main(String args[])
	{
		// String Revers..!!
		
//		String s1 ="Programming";
//		String revers ="";
//		for(int i=s1.length()-1; i>=0; i--)
//		{
//			revers = revers + s1.charAt(i);
//		}
//		System.out.println("Revers :"+revers);
		
		
		
		// Wold Revers
		
	 String s1= " Java is Programming Language";
	 String arr[]= s1.split(" ");
	 
	 for(String wold : arr)
	 {
		 String revers ="";
		 for(int i=wold.length()-1; i>=0; i--)
		 {
			 revers = revers + wold.charAt(i);
		 }
		 System.out.print(revers+" ");
	 }
		
	}

}
