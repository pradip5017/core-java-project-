package Interview_BasicArrayQuestion;

public class ArrayLength3 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,6,7,9};
		int result = arr[arr.length-1];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==result)
			{
				System.out.println(i);
			}
		}
	
	}
}
