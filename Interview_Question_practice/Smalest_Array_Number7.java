package Interview_Question_practice;

public class Smalest_Array_Number7 {
	public static void main(String args[])
	{
		int arr[]= {23,34,45,56,67,8,94,15};
		
		int min =arr.length;
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
