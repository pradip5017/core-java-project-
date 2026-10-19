package Abstraction;

public class ReverseString {
	public static void main(String args[])
	{
		String s2="Pradip";
		
		String dublicate ="";
		
		for(int i=s2.length()-1; i>=0; i--)
		{
			dublicate = dublicate + s2.charAt(i);
		}
		System.out.println(dublicate);
		System.out.println(s2); 
	}
	
}
