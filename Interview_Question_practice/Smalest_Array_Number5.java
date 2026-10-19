package Interview_Question_practice;

public class Smalest_Array_Number5 {
	public static void main(String args[])
	{
		// find in smallest values in array
		int arr[] = {63,43,22,2,45,67,86,43,24};
		int min = arr[0];	
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
