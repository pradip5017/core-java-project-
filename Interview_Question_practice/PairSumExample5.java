package Interview_Question_practice;

public class PairSumExample5 {
	public static void main(String args[])
	{
		int arr[]= {2,4,6,8,5,1,7,9};
		
		int target =10;
		int count =0;
		
		System.out.println("Total target :"+target);
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
		System.out.println("Total Count:"+count);
	}
}