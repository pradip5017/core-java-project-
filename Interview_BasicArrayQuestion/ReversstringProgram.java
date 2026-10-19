package Interview_BasicArrayQuestion;

public class ReversstringProgram {
	public static void main(String args[])
	{
		int arr[]= {11,22,33,44,56,78,9,0,3};
		
		int max =0;
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
