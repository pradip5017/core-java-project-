package Interview_BasicArrayQuestion;

public class ArrayLength5 {
	public static void main(String args[])
	{
		int arr[]= {1,3,5,7,89,3,5,9};
		
		int num = 7;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				System.out.print(i+" ");
			}
		}
	}

}
