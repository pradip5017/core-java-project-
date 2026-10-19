package Interview_BasicArrayQuestion;

public class ArrayLength7 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,90};
		
		int result = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==result)
			{
				System.out.println(i);
			}
		}
	}

}
