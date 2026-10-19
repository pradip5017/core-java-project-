package Interview_Question_practice;

public class BigElement_Array_Number6 {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,25,98,232,3,5,77,343,2,67,84};
		
		int big =arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > big )
			{
				big = arr[i];
			}
		}
		System.out.println(big);
	}
}
