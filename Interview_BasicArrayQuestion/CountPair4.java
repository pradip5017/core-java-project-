package Interview_BasicArrayQuestion;

public class CountPair4 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,5,7,8,3,6};
		int target= 10;
		int count=0;
		
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
		System.out.println("Count :"+count);
	}

}
