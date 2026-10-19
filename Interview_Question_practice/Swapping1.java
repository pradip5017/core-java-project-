package Interview_Question_practice;

public class Swapping1 {
	public static void main(String args[])
	{
		String s1 ="loreijfbodshfihsdihfaihsd";
		String dublicate = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			dublicate = dublicate +s1.charAt(i);
		}
		System.out.println(dublicate);
	}
}
