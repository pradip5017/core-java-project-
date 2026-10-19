package Interview_Question_practice;

public class Smalest_Array_Number3 {
	public static void main(String args[])
	{
		int arr[] = {22,33,45,6,66,44,34,5,34,344,45};
		
		int min = arr.length;
		

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
				
			}
		}
		System.out.println("Minimum Values of array :"+min);
//		System.out.println("Maximum value of Array :"+max);
	}

}
