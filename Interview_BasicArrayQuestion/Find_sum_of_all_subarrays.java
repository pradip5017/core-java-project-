package Interview_BasicArrayQuestion;

public class Find_sum_of_all_subarrays {
	public static void main(String[] args) {
		
	
	int arr[]= {1,2,3,4};
	
	int sum = 0;
	
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i; j<arr.length; j++)
		{
			for(int k=i; k<=j; k++)
			{
				sum +=arr[i];
			}
		}
	}
	System.out.println(sum);
}
}