package Interview_Question_practice;

public class Muliple_Charector_findout_practice6 {

	public static void main(String args[])
	{
		String str = "pradipfiohsdkhaiowieksdjfkahoeeieeej";
		
		int arr[]= new int[222];
		for(int i=0; i<str.length(); i++) 
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		
		int max = -1;
		char c =' ';
		for(int i=0; i<str.length(); i++)
		{
			if(max < arr[str.charAt(i)])
			{
				max = arr[str.charAt(i)];
				c = str.charAt(i);
						
			}
		}
		System.out.println("multiple charector :"+c);
		System.out.println("How many time repeated charector count : "+max);
				
	}
}
