package Interview_Question_practice;

public class Secound_Highest_Values7 {
	public static void main(String args[])
	{
		int arr[] = {2,3,4,56,65,78,99,65};
		
		int first = Integer.MIN_VALUE;
		int secound = Integer.MIN_VALUE;
		for(Integer num : arr)
		{
			if(num > first)
			{
				secound = first;
				first = num;
			} else if(num > first && num != secound)
			{
				first = num;
			}
		}
		System.out.println(first);
		System.out.println(secound);
	}

}
