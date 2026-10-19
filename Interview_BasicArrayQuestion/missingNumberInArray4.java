package Interview_BasicArrayQuestion;

public class missingNumberInArray4 {
	public static void main(String args[])
	{
		int arr[] = {1,2,4,6,7,9,20};
		int num = 20;
		
		for(int i=0; i<=20; i++)
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
