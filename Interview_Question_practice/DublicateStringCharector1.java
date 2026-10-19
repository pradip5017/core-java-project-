package Interview_Question_practice;

public class DublicateStringCharector1 {
	public static void main(String args[])
	{
		String s1 ="programming";
		String result =" ";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))
			{
				if(result.indexOf(ch)==-i)
				{
					result += ch;
				}
			}
		}
		System.out.println("Result ="+result);
	}

}
