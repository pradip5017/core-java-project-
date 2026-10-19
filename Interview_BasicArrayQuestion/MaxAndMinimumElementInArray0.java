package Interview_BasicArrayQuestion;

public class MaxAndMinimumElementInArray0 {
	public static void main(String args[])
	{
		int arr[]= {1,345,7,9,0,45,78};
		int max =0;
		
		for(int i=0; i<arr.length; i++)
			
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max+" ");
	}

}
