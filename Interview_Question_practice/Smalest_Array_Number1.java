package Interview_Question_practice;

public class Smalest_Array_Number1 {
	public static void main(String args[])
	{
		
		// smallest values find out in array 
		int arr[]= {11,23,44,56,77,444,5434,666,334,232,1,4,434,7,99};
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				 max = arr[i];
			}
		}
		System.out.println(max);
	}

}
