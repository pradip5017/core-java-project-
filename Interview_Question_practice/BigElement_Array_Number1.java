package Interview_Question_practice;

public class BigElement_Array_Number1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,8,65,34,32,98,11};
		
		int big = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > big  )
			{
				big = arr[i];
			}
		}
		System.out.println(big);
	}

}
