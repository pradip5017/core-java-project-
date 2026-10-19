package Interview_BasicArrayQuestion;

public class MissingNumber {
	public static void main(String[] args) 
	{
		int arr[]= {1,2,4,5,7,9};
		
		int n = 9;
		
		for(int i=1; i<n; i++)
		{
			boolean found = false;
			
			for(int num :arr)
			{
				if(num==i)
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.print(i +" ");
			}
		}
		
	}
}
