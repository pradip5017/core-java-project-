package Interview_Question_practice;

public class PairSumExample6 {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int target =10;
		int count=0;
		
		System.out.println("Target :"+target);
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
		System.out.println("Count :"+count);
	}
}
