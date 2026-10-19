package Interview_BasicArrayQuestion;

public class CountPair10 {
	public static void main(String args[])
	{
		int arr[]= {1,4,6,8,-6,3,7};
		int target = 8;
		
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+target);
					count++;
				}
			}
		}
		System.out.println("count :"+count);	
	}

}
