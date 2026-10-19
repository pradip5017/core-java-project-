package Interview_BasicArrayQuestion;

public class missingNumberInArray2 {
	public static void main(String args[])
	{
		int arr[]= {2,3,5,6,7,8};
		int num = 8;
		
		for(int i=1; i<=num; i++)
		{
			boolean found = false;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]==i )
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
