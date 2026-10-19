package Interview_BasicArrayQuestion;

public class MissingNumber18 {

	public static void main(String args[])
	{
		int arr[]= {1,2,4,5,7,8};
		
		int num = 8;
		for(int i=0; i<=num; i++)
		{
			boolean found = false;
			for(int j=i; j<arr.length; j++)
			{
				if(arr[j]==i)
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
