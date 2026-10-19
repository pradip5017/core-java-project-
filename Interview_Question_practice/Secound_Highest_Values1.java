package Interview_Question_practice;

public class Secound_Highest_Values1 {
	public static void main(String args[])
	{
		int arr[]= {2,3,4,5,6,77,55,33,22,534};
		
		int first = Integer.MIN_VALUE;
		int secound = Integer.MIN_VALUE;
		
		for(Integer num : arr )
		{
			if(num > first)
			{
				secound = first;
				first =num;
				
			}else if(num > first && num != secound)
			{
				first = num;
				
			}
		}
		System.out.println("First highest Values :"+first);
		System.out.println("highest Secound Element :"+secound);
	}

}
