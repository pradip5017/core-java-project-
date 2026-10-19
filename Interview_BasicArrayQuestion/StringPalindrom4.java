package Interview_BasicArrayQuestion;
//String palindrom
public class StringPalindrom4 {
	public static void main(String[] args) {
		
		String s1 ="madam";
		String rev = "";
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev = rev + s1.charAt(i);
			
		}
		if(s1.equals(rev))
		{
			System.out.println("True :"+rev);
		}
		else
		{
			System.out.println("False :"+rev);
		}
	}

}
