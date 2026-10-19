package Interview_BasicArrayQuestion;

public class FindOutLargestAnd_Smallest_Element_inArray1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,55,7,88,34,7,8};
		int max =arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Max element of Array:"+max);
	}

}
