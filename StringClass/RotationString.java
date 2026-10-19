package StringClass;

public class RotationString {
	public static void main(String args[])
	{
		String s1 ="Hello";
		
	
		for(int i=0; i<s1.length(); i++)
		{
			System.out.println(s1.substring(i)+s1.substring(0,i));
		}
	}

}
