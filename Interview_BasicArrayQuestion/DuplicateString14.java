package Interview_BasicArrayQuestion;
// dublicate String find out
public class DuplicateString14 {
	public static void main(String args[])
	{
		String s1 ="programming";
		
		String result =" ";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))// find out dublicate
			{
				if(result.indexOf(ch)==-1)// remove Dublicate
				{
					result += ch;
				}
			}
		}
		System.out.println(" Dublicate :"+result);
	}

}
