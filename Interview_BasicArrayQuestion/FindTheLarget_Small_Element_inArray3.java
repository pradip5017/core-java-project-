package Interview_BasicArrayQuestion;

public class FindTheLarget_Small_Element_inArray3 {
	public static void main(String args[])
	{
		int arr[]= {1,3,5,6,8,9};
		
		int max =arr.length;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
