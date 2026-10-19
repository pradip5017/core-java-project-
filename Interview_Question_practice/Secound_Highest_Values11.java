package Interview_Question_practice;

public class Secound_Highest_Values11 {
	public static void main(String args[])
	{
		int arr[]= {2,3,5,64,89,6};
		
		int first =0;
		int secound =0;
		
		for(int num : arr)
		{
			if(num > first)
			{
				secound = first;
				first = num;
				
			}
			else  if(num > first && num != secound)
			{
				first = num;
			}
		}
		System.out.println("First :"+first);
		System.out.println("Secound :"+secound);
	}

}
