package Interview_Question_practice;

public class Smalest_Array_Number2 {
	public static void main(String args[])
	{
		
	int arr[] = {22,33,44,22,11,22,33,5,33,4,22,33,25,6,8};
	
		int min = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println(min);
		
	}
}
