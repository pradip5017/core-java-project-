package Interview_BasicArrayQuestion;

public class FindOutBig_BigElement_in_Array2 {
	public static void main(String args[])
	{
		int arr[]= {22,4,66,8,96,46,86,34};
		
		int max =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Max :"+max);
	}

}
