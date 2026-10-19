package Interview_Question_practice;
// find out dublicate Charector in String 
// and Remove dublicate charector in String
public class DublicateStringCharector {

	public static void main(String args[])
	
	{
		String s1 ="pradip";
		String result ="";
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(s1.indexOf(ch)!=s1.lastIndexOf(ch))
			{
				if(result.indexOf(ch)==-1)
				{
					result +=ch;
				}
			}
		}
		System.out.println("Dublicate Charector :"+result);
	}

}
