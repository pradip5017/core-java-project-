package Interview_Question_practice;

public class Muliple_Charector_findout_practice01 {
	
	public static void main(String args[])
	{
		String s1 = "gggooorubeohncuoocdoo";
		
		int arr[]= new int[227];
		
		for(int i=0; i<s1.length(); i++)
		{
			arr[s1.charAt(i)]= arr[s1.charAt(i)]+1;
		}
		
		int max =-1;
		char c =' ';
		
		for(int i=0; i<s1.length(); i++)
		{
			if(max < arr[s1.charAt(i)])
			{
				max = arr[s1.charAt(i)];
				c=s1.charAt(i);
			}
		}
		System.out.println("The multiple charector= "+c+ "\n multiple charector number is length = "+max);
	}

}
