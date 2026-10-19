package Interview_BasicArrayQuestion;
//find out dublicate String
public class DuplicateString4 {
	public static void main(String[] args) {
		
		String s1 = "programming";
		String revers = "";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))
			{
				if(revers.indexOf(ch)==-1)
				{
					revers +=ch;
				}
			}
		}
		System.out.println(revers);
	}

}
