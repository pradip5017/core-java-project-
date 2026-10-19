package Interview_Question_practice;

public class Muliple_Charector_findout_practice {
	public static void main(String args[])
	{
		String s = "gggooorubeohncuoocdoo";
		
		int []arr = new int[233];
		
		for(int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)]= arr[s.charAt(i)]+1;
			
		}
		
		int max =-1;
		char c =' ';
		
		for(int i=0; i<s.length(); i++)
		{
			if(max < arr[s.charAt(i)])
			{
				max = arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("Multiple charecter ="+c+ "\nAnd Length of Charecter= "+max);
	}

}
