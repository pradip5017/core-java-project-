package Array;

public class InterviewQuestion0 {
	public static void main(String args[])
	{
		String s = "gggooorubeohncuoocdoo";
		
		int arr[]= new int[256];
		
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
				c = s.charAt(i);
			}
			
		}
		System.out.println("The more charector values = "+c+"\nThe more chareactor values is Length = "+max);
	}
}
