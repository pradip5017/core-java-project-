package Interview_BasicArrayQuestion;

public class Missingnumber02 {
	public static void main(String args[])
	{
		int arr[]= {1,3,7,9,11};
		int num = 11;
		
		for(int i=0; i<=num; i++)
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
