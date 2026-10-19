package Interview_BasicArrayQuestion;

public class CharacterCount {

	public static void main(String args[])
	{
		String s1 ="programing";
		

		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			int count =0;
			
			for(int j=0; j<s1.length(); j++)
			{
				if(ch == s1.charAt(j))
				{
					count++;
				}
			}
			System.out.println(ch + "="+count);
			
		}
	}
}
