package Interview_BasicArrayQuestion;
// find out the small and larget element in array
public class FindTheLarget_Small_Element_inArray4 {
	public static void main(String args[])
	
	{
//		int arr[]= {11,44,78,54,64,23,66,84,23,7,65};
//		
//		int min =arr[0];
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i] < min)
//			{
//				min =+arr[i];
//			}
//		}
//		System.out.println(min);
		
		
		
		// max values 
		
		int arr[]= {11,44,78,54,64,23,66,84,23,7,65};
		
		int max = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =+arr[i];
			}
		}
		System.out.println(max);
	}
	

}
