package StringClass;

public class StringClassPractice {
	public static void main(String args[])
	{
		String s1 ="Pradip";
		//String s1 ="Rathod";
		System.out.println(s1);
		
		//Rotation String
		
		String str = "programming";
		
		for(int i=0; i<str.length(); i++)
		{
		System.out.println(str.substring(i)+str.substring(0,i));;
		}
	}

}
