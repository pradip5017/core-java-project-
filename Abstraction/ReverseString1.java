package Abstraction;

public class ReverseString1 {
	public static void main(String args[])
	{
		String str = "Parmeshwar";
		
		String revers = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			revers = revers +str.charAt(i);
		}
		System.out.println(revers);
	}

}
