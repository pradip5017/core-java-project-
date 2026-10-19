package Interview_BasicArrayQuestion;

public class FindOutBig_BigElement_in_Array0 {
	public static void main(String args[])
	{
		int arr[]= {2,4,699,8,9,1,5,97};
		
		int max =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max =+ arr[i];
			}
		}
		System.out.println("Maximum :"+max);
	}

}
