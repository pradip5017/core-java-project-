package Interview_Question_practice;

public class Secound_Highest_Values14 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int first =0;
		int secound=0;
		
		for(Integer  num : arr)
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
		System.out.println("Secound highest :"+secound);
		System.out.println("First highest :"+first);
	}

}
