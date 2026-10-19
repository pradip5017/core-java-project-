package Interview_BasicArrayQuestion;
// find out First nonRepeated Charector in java
public class NonRepeadeCharecor_First3 {
	public static void main(String args[])
	{
//		String s1 = "programming";
//		String result ="";
//		
//		for(int i=0; i<s1.length(); i++)
//		{
//			char ch = s1.charAt(i);
//			
//			if(result.indexOf(ch)==-1)
//			{
//				result +=ch;
//				break;
//			}
//		}
//		System.out.println(result);
		
		
		
		
		// find out first repeated charector in array
		
		String s1 ="programming";
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))
			{
				if(result.indexOf(ch)==-1)
				{
					result +=ch;
					break;
				}
			}
		}
		System.out.println("Repeated Charector Element :"+result);
	}

}
