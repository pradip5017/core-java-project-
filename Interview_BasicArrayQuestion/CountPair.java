package Interview_BasicArrayQuestion;
//Write a program to count pairs with given difference.
public class CountPair {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,8,4,9};
		
		int target = 10;
		int  count =0;
		
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
