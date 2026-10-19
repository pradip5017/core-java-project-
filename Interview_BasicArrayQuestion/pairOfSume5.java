package Interview_BasicArrayQuestion;

public class pairOfSume5 {
	public static void main(String[] args) {
		int arr[]= {2,3,-6,8,9,-5,4};
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
