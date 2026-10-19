package Interview_Question_practice;

public class Small_Array_Number {
	public static void main(String args[])
	{
		int arr[]= {22,33,45,65,78,98,23,5,67,75,27,45};
		
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
