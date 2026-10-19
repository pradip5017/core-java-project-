package Interview_BasicArrayQuestion;
// pair of sume (2 element compare and sum )
public class PairOfSume0 {
	public static void main(String args[])
	
	{
		// target 8
		int arr[]= {2,3,5,7,9,8,-6};
		
		int target = 10;
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i] + arr[j] == target)
				{
					System.out.println(arr[i]+"+"+arr[j]+" == "+target);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	

}
