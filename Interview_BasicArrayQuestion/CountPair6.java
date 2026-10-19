package Interview_BasicArrayQuestion;

public class CountPair6 {
	
	public static void main(String args[])
	{
		int arr[]= {2,3,5,7,9,8,4,6};
		int target= 6;
		int count=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" + "+arr[j]+" ="+target);
					count++;
				}
			}
		}
		System.out.println("count :"+count);
	}
}
