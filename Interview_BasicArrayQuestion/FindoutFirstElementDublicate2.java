package Interview_BasicArrayQuestion;

public class FindoutFirstElementDublicate2 {
	public static void main(String args[])
	{
		String s1 ="programming langauge";
		
		String result = " ";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)!= result.lastIndexOf(ch))
			{
				result += ch;
				break;
			}
			
		}
		System.out.println("Result +"+result);
	}

}
