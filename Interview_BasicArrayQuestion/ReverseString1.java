package Interview_BasicArrayQuestion;

public class ReverseString1 {
	public static void main(String args[])
	{
		String s1 = "programing";
		String revers= "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			revers = revers + s1.charAt(i);
		}
		System.out.println(revers);
	}

}
