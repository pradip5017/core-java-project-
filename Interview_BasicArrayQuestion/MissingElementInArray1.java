package Interview_BasicArrayQuestion;

public class MissingElementInArray1 {
	
	public static void main(String args[])
	{
		int arr[]= {1,3,5,7,8,9,34};
		
		int num = 34;
		
		for(int i=1; i<=34; i++)
		{
			boolean found = false;
			
			for(int j=0; j<arr.length; j++)
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
