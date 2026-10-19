package Interview_Question_practice;

public class RemoveDublicateString1 {
	public static void main(String args[])
	{
		// remove Dublicate String 
		String s1 ="programming";
		String result =" ";
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(s1.indexOf(ch)==i)
			{
				result += ch;
			}
		}
		System.out.println("Result :"+result);
	}

}
