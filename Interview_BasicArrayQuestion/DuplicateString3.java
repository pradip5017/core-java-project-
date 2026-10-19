package Interview_BasicArrayQuestion;

// dublicate String find out
public class DuplicateString3 {

	public static void main(String[] args) {
		
		String s1 = "programming";
		
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))// this line find out dublicate elements 
			{
				if(result.indexOf(ch)==-1)
				{
					result += ch;
				}
			}
		}
		System.out.print(result+" ");
	}
}
