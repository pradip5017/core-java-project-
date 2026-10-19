package Interview_BasicArrayQuestion;

public class PairOfSume {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,6,-1,8};
		int target = 7;
		int count =0;	
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println( arr[i]+" + "+arr[j]+" = "+target);
					count++;
				}
			}
		}
		System.out.println("Count :"+count);
	
	}
}
