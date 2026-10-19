package Interview_BasicArrayQuestion;

public class CountPair9 {
	public static void main(String args[])
	{
		int arr[]= {1,3,6,9,-5,-7};
		int target = 4;
		int count =0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+ arr[j]==target)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = "+target);
					count++;
				}
			}
		}
		System.out.println("Count :"+count);
	}

}
