package Interview_BasicArrayQuestion;

public class MissingNumber111 {
	public static void main(String args[])
	{
		int arr[]= {1,3,5,7,9};
		int num = arr[arr.length-1];
		
		for(int i=1; i<num; i++)
		{
			boolean found = false;
			
			for(int n : arr)
			{
				if(n==i)
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
