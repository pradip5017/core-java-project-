package Interview_BasicArrayQuestion;

public class CountCharectorInString1 {
	public static void main(String args[])
	{
		String num = "programming language";
		
		int count= 0;
		for(int i=0; i<num.length(); i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
