package Interview_Question_practice;

public class Smalest_Array_Number6 {
	public static void main(String args[])
	{
		int arr[] = {22,31,54,21,6,2,1,7,8,23,64,123,62,23,97};
		
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
