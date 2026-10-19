package Interview_Question_practice;

public class ReversStringWithoughtUsingBuilIn_Method {
	public static void main(String args[])
	{
		String str = "pradip";
		String revers ="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
//			revers +=str.charAt(i);
			revers = revers +str.charAt(i);
		}
		System.out.println(revers);
		
	
		
	}

}
