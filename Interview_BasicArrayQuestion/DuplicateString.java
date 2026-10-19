package Interview_BasicArrayQuestion;
//Find duplicate characters in a string.
//Remove duplicate characters from a string.
public class DuplicateString {
	public static void main(String args[])
	{
		String s1 ="programming";
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))  //find out duplicate characters from a string.
			{
				if(result.indexOf(ch)==-1) // remove Duplicate Character in String
				{
					result += ch;
				}
			}
		}
		System.out.println(result);	
	}

}
