package Interview_BasicArrayQuestion;
// remove String element
public class DuplicateStringRemove1 {
	public static void main(String[] args) {
		// Remove Dublicate string
		
		
//		String s1 = "programming";
//		String result ="";
//		
//		for(int i=0; i<s1.length(); i++)
//		{
//			char ch = s1.charAt(i);
//			
//			if(result.indexOf(ch)==-1)
//			{
//				result += ch;
//			}
//		}
//		System.out.println("Remove Dublicate String :"+result);
	
	
	// find out dublicate String elements
		String s1 = "programming";
		String result = "";
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))
			{
				if(result.indexOf(ch)==-1)
				{
					result +=ch;
				}
			}
		}
		System.out.println("Dublicate Charectors :"+result);
	}

}
