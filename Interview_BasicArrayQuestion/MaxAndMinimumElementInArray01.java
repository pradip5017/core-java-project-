package Interview_BasicArrayQuestion;

public class MaxAndMinimumElementInArray01 {
	public static void main(String args[])
	{
		int arr[]= {12,3,5,7,9,5,6,8};

		int min =arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				 min = arr[i];
			}
		}
		System.out.print(min+" ");
	}

}
