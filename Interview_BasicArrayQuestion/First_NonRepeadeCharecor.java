package Interview_BasicArrayQuestion;
//Find the first non-repeating character in a string.
public class First_NonRepeadeCharecor {
	public static void main(String[] args) {
		
		String s1 ="programmingp";
		
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)== s1.lastIndexOf(ch))
			{
				System.out.println(ch);
				break;
			}
		}
	}

}
