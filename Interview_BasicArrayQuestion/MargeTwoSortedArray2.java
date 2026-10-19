package Interview_BasicArrayQuestion;

public class MargeTwoSortedArray2 {
	public static void main(String args[])
	{
		int arr[]= {1,4,3,-6,8,5,9,-5}; //target 9
		int target =9;
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
		System.out.println("Count of Pair :"+count);
	}

}
