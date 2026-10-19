package Interview_BasicArrayQuestion;

public class ReversString4 {
	public static void main(String[] args) {
		
		String s1= "programming Java";
		String revers = "";
		for(int i=s1.length()-1; i>=0; i--)
		{
			char ch = s1.charAt(i);
			
			revers = revers + s1.charAt(i);
		}
		System.out.println(revers);
	}

}
