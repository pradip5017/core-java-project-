package Interview_BasicArrayQuestion;

public class MaxAndMinimumElementInArray {
	public static void main(String args[])
	{
//		int arr[]= {11,2,3,6,8,9,5};
//		
////		int min = arr[0];
//		int max = 1;
//		for(int i=0;i<arr.length; i++)
//		{
//			if(arr[i] > max)
//			{ 
//				max =+arr[i];
//			}
//			
//		}
//		System.out.println(max);
		
		
		int arr[]= {2,6,4,8,9,2,11};
		
		int min=arr[0];// 
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minumum element in Array :"+min);
	}

}
