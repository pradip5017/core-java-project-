package Interview_BasicArrayQuestion;

public class NonRepeadeCharecor_First {
	public static void main(String args[])
	{
		String s1 ="programming";
		
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(s1.indexOf(c)== s1.lastIndexOf(c))
			{
				System.out.println(c);
				break;
			}
			
		}
		
		
	}

}
