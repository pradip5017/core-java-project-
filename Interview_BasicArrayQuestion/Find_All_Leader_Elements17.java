package Interview_BasicArrayQuestion;

public class Find_All_Leader_Elements17 {
	public static void main(String args[])
	{
		// leader number is 22,44,56,66
		int arr[]= {22,21,11,44,34,35,31,56,43,66};
		
		int max =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				 max =+ arr[i];
				System.out.print(max+" ");
			}
		}
	}

}
