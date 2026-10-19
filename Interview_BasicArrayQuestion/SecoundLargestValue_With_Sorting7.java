package Interview_BasicArrayQuestion;

public class SecoundLargestValue_With_Sorting7 {
	public static void main(String args[])
	{
		int arr[]= {2,4,6,7,38,9};
		
		int first = 0;
		int secound =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}
			else if(arr[i]> secound && arr[i]!= first)
			{
				secound = arr[i];
			}
		}
		System.out.println("Secound :"+secound);
		System.out.println("first :"+first);
	}

}
