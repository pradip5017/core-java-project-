package Interview_Question_practice;

public class Secound_Highest_Values3 {
	public static void main(String args[])
	{
		// find out secound highest values in this array
		int arr[]= {2,3,4,5,6,7,8,9,98,65,44,56,795};
		
		int first = Integer.MIN_VALUE;
		int secound =Integer.MIN_VALUE;
		
		for(Integer num : arr)
		{
			if(num > first)
			{
				secound = first;
				first = num;
			}
			else if(num > first && num != secound)
			{
				first = num;
				
			}
		}
		System.out.println("First Highest values : "+first);
		System.out.println("Secound highest values :"+secound);
	}

}
