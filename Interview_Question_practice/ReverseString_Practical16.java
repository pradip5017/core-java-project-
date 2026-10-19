package Interview_Question_practice;

public class ReverseString_Practical16 {
	public static void main(String args[])
	{
		String str ="pradip rathod";
		String revers = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			revers = revers +str.charAt(i);
		}
		System.out.println(revers);
	}

}
