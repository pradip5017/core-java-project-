package Interview_BasicArrayQuestion;

public class ReversStreing {
	public static void main(String args[])
	{
		String s1 = "Programming";
		
		String result ="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			result = result + s1.charAt(i);
		}
		System.out.println("Reverse String : "+result);
	}

}
