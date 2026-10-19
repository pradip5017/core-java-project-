package Interview_Question_practice;

public class Secound_Highest_Values12 {
	public static void main(String args[])
	{
		int arr[]= {24,4,6,88,4,23,7,3};
		
		int first = 0;
		int secound =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}
			else if(arr[i] > first && arr[i] != secound)
			{
				secound = arr[i];
			}
		}
		System.out.println("Secound highest :"+secound);
		System.out.println("First Highest number :"+first);
	}

}
