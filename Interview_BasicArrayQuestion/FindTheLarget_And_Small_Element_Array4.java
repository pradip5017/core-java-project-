package Interview_BasicArrayQuestion;

public class FindTheLarget_And_Small_Element_Array4 {
	public static void main(String arrgs[])
	{
		int arr[]= {14,23,21,45,8,6,8,9,3,5};
//		int min =arr[0];
		int max = arr.length;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]> max)
			{
				max = arr[i];
			}
		}
//		System.out.println("Minimum element :"+min);
		System.out.println("Maximum Element :"+max);
	}

}
