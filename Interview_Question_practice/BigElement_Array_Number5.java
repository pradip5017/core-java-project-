package Interview_Question_practice;

public class BigElement_Array_Number5 {
	public static void main(String args[])
	{
		int arr[]= {131,232,533,44,66,45,454,43,66};
		
		int big =arr.length;
//		int min =arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > big)
			{
				big = arr[i];
			}
		}
		System.out.println(big);

	}

}
