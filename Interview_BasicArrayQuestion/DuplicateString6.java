package Interview_BasicArrayQuestion;
// find out dublicate String charector
public class DuplicateString6 {
	public static void main(String args[])
	{
		String s1 = "programming";
		String  result ="";
		
		for(int i=0; i<s1.length(); i++) 
		{
			char ch  = s1.charAt(i);
			
			if(s1.indexOf(ch)!=s1.lastIndexOf(ch))
			{
				if(result.indexOf(ch)==-1)
				{
					result +=ch;
					
				}
			}
		}
		System.out.println(result);
	}

}
