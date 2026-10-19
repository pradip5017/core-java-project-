package Interview_Question_practice;

public class Muliple_Charector_findout_practice7 {
	public static void main(String args[])
	{
		String s1 = "loreiojsdjfhsdkfhsdhfbkjhdaaaafdfsdaadfsaa";
		
		int arr[] = new int[233];
		
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
		System.out.println("Multiple Charector ="+c);
		System.out.println("Length of multiple charector in String ="+max);
	}
}
