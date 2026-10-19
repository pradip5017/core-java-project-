package Interview_BasicArrayQuestion;

public class MissingNumber2 {
	public static void main(String args[])
	{
		int arr[]= {1,3,6,8,9};
		
		int n =9;
		for(int i=1; i<n; i++)
		{
			boolean found = false;
			for(int num : arr)
			{
				if(num == i)
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
