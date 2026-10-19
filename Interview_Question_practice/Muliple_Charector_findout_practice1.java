package Interview_Question_practice;

public class Muliple_Charector_findout_practice1 {
	public static void main(String args[])
	{
		String s = "gggooorubeohncuoocdoo";//find out the multiple charector in this wold

		int arr[]= new int[277];
		
		for(int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)]= arr[s.charAt(i)]+1;
			
		}
		
		int max = -1;
		char c = ' ';
		
		for(int i=0; i<s.length(); i++)
		{
			if(max < arr[s.charAt(i)])
			{
				max=arr[s.charAt(i)];
				c =s.charAt(i);	
			}
		}
		System.out.println(c +" length "+max);
	}

}
