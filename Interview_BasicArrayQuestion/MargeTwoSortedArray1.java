package Interview_BasicArrayQuestion;

public class MargeTwoSortedArray1 {
	public static void main(String[] args) {
		int arr[]= {1,-3,4,-7,9,-4,5,7};
		
		int target = 8;
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length;  j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+target);
					count++;
				}
			}
		}
		System.out.println("Count :"+count);
		
	}

}
