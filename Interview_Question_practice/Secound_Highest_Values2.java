package Interview_Question_practice;

public class Secound_Highest_Values2 {
	public static void main(String args[])
	{
		int arr[]= {2,3,44,55,33,55,323,54,544,344,876};
		
		int first = Integer.MIN_VALUE;
		int secound = Integer.MIN_VALUE;
		
		for(Integer num : arr)
		{
			if(num > first)
			{
				secound = first;
				first = num;
			}
			else if(num > first &&  num !=secound)
			{
				
				first = num;
			}
		}
		System.out.println("Highest values :"+first);
		System.out.println("Highest Secound Value :"+secound);
	}

}
