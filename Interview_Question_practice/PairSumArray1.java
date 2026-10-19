package Interview_Question_practice;

public class PairSumArray1 {

	public static void main(String args[])
	{
		int arr[]= {1,2,4,6,9,7,4};
		
		int target =7;
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
		System.out.println("count "+count);
		
	}
}
