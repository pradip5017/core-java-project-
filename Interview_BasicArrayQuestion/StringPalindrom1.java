package Interview_BasicArrayQuestion;

	// check the String  palindrom or not
public class StringPalindrom1 {
	public static void main(String args[])
	{
		String s1 = "madam";
		String result ="";
		
		for(int i=s1.length()-1; i>=0; i--) 
		{
			result = result +s1.charAt(i);
		}
		if(s1.equals(result))
		{
			System.out.println("True :"+result);
		}else
		{
			System.out.println("False:"+result);
		}
		
	}

}
