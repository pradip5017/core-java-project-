package Interview_BasicArrayQuestion;
// find out First Dublicate Element in Array..!! 
public class FindoutFirstElementDublicate1 {
	public static void main(String[] args) {
		
		String s1 = "programming Hai mere bhai";
		String result ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(s1.indexOf(ch)!= s1.lastIndexOf(ch))
			{
				result += ch;
				break;
			}
		}
		System.out.println("First Dublicate Element :"+result);
	}

}
