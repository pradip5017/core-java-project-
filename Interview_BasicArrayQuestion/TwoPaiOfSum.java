package Interview_BasicArrayQuestion;
// two of sum
public class TwoPaiOfSum {

	public static void main(String args[])
	{
		int arr[]= {1,-2,6,5,-4,-6,4,7,9};
		int target = 5;
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
		System.out.println("Count:"+count);
		
	}
}
