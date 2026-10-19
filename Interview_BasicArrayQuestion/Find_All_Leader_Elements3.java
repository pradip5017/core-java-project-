package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements3 {
	public static void main(String args[])
	{
		int arr[]= {44,34,34,56,44,35,67};
		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(i==0|| arr[i] > arr[i-1])
//			{
//				System.out.print(arr[i]+" ");
//			}
//		}
		
		int result = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > result)
			{
				result =+arr[i];
				System.out.print(result+" ");
			}
		}
	}

}
