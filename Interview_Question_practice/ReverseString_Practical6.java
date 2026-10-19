package Interview_Question_practice;

public class ReverseString_Practical6 {
	public static void main(String args[])
	{
		String str = "Pradip Rathod";
		String Revers = " ";
		
		for(int i=str.length()-1; i>0; i--)
		{
			Revers = Revers + str.charAt(i);
		}
		System.out.println(Revers);
	}

}
