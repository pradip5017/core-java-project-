package Interview_BasicArrayQuestion;

public class NonRepeadeCharecor_First1 {
	public static void main(String args[])
	{
		String s1 = "programmingp";
		
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)==s1.lastIndexOf(ch))
			{
				result +=ch;
				break;
			}
		}
		System.out.println(result);
	}

}
