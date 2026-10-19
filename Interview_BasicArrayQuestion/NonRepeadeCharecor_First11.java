package Interview_BasicArrayQuestion;
//1, find out non repeated charector in String
//2, find out repeated charector in String
public class NonRepeadeCharecor_First11 {
	public static void main(String[] args) {
		/*
		String s1 ="programming";
		
		String result="";
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(result.indexOf(ch)==-1)
			{
				result +=ch;
			}
		}
		System.out.println(result);
	*/
		
		
		
		// find out repeated charector
		
		String s1 ="programming";
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
		System.out.println(result);
	}

}
