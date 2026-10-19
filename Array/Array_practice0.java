package Array;

public class Array_practice0 {
	public static void main(String args[])
	{
		int arr[]= {11,22,34,55,77};
		
		System.out.println("The array reverse in using for loop");
		
		for(int i=arr.length-1;i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
