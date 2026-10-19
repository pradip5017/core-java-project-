package Interview_BasicArrayQuestion;

public class FindOutLargestAnd_Smallest_Element_inArray {
	public static void main(String args[])
	{
		int arr[]= {2,4,5,8,9,11,4,6};
//		int min =arr[0];
		int max = 0;
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
