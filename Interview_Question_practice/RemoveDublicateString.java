package Interview_Question_practice;

public class RemoveDublicateString {
	public static void main(String[] args) {
		String s1 = "Programming";
		
		String dublicate ="";
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch =s1.charAt(i);
			if(dublicate.indexOf(ch)==-1)
			{
				dublicate += ch;
			}
			
		}
		System.out.println(dublicate);
	}

}
