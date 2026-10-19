package Interview_BasicArrayQuestion;

//target = 7
public class pairOfSume7 {
	public static void main(String[] args) {
		
		int arr[]= {1,3,6,2,-7,4,-9};
		int target = 7;
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
