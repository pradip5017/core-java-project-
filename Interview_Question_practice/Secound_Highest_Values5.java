package Interview_Question_practice;

public class Secound_Highest_Values5 {
	public static void main(String args[])
	{
		int arr[]= {3,4,5,3,2,5,6,4,7,3,9};
		
		int first=Integer.MIN_VALUE;
		
		int secound=Integer.MIN_VALUE;
		
		for(Integer num :arr)
		{
			if( num > secound)
			{
				secound = first;
				first = num;
		}
			else if(num > first && num !=secound)
			{
				first = num;
			}
		}
		System.out.println("First :"+first);
		System.out.println("Secound: "+secound);
			
	}

}
