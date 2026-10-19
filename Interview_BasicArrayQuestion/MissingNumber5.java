package Interview_BasicArrayQuestion;

public class MissingNumber5 {
	public static  void main(String args[])
	{
		int arr[]= {1,3,5,7,9};
		int n =9;
		
		for(int i=0; i<n; i++)
		{
			boolean found = false;
			
			for(int num :arr)
			{
				if(num==0)
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