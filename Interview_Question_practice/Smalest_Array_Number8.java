package Interview_Question_practice;

public class Smalest_Array_Number8 {
	public static void main(String args[])
	{
		int arr[]= {14,26,22,90,4,6,78,45,86,45,24,56};
		
		int small = arr.length;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < small)
			{
				small = arr[i];
			}
		}
			System.out.println(small);	
	
	}

}
