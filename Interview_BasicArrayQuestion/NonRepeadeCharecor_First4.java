package Interview_BasicArrayQuestion;

public class NonRepeadeCharecor_First4 {
	public static void main(String[] args) {
		
		String s1 = "programming";
		
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
	
			if(result.indexOf(ch)==-1)
			{
				result += ch;
			}
		}
		System.out.println(result);
	}
	
	
}
