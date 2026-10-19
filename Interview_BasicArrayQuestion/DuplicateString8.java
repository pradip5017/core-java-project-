package Interview_BasicArrayQuestion;
//find out dublicate String 
public class DuplicateString8 {
	public static void main(String args[])
	{
		// dublcate String Find out 
		
		String s1 ="programming";
		String result="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))
			{
				if(result.indexOf(ch)==-1)
				{
					result += ch;
				}
			}
		}
		System.out.println("Dublicate String  :"+result);
	
	
	// dublcate String Remove
		
		String s2= "programming";
		String result1 ="";
		for(int i=0; i<s2.length(); i++)
		{
			char ch= s2.charAt(i);
			if(result1.indexOf(ch)==-1)
			{
				result1 +=ch;
			}
		}
		System.out.println("Remove Dublicate String :"+result1);
	
	}
}
