package Interview_Question_practice;

public class Smalest_Array_Number12 {

	public static void main(String args[])
	{
		int arr[]= {12,4,2,10,5,6,8,6,3,5};
		
		int small =arr.length;
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
