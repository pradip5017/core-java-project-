package Interview_BasicArrayQuestion;

public class MissingNumber113 {
	public static void main(String args[])
	// missing element fetching
	{
		int arr[]= {1,2,4,7,9};
		
		int n = 9;
		for(int i=0; i<n; i++)
		{
			boolean found = false;
			for(int num : arr)
			{
				if(num==i)
				{
					found = true;
					break;
				}
			}
		
			if(!found)
			{
				System.out.print(i+" ");
			}
		}
	}

}
