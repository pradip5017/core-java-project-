package Interview_Question_practice;

public class ReverseString_Practical17 {
	public static void main(String args[])
	{
		String s1 ="programming";
		String revers ="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			revers = revers + s1.charAt(i);
		}
		System.out.println("Revers String :"+revers);
	}

}
