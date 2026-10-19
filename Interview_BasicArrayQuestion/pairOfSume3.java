package Interview_BasicArrayQuestion;

// target =7
// count 2
public class pairOfSume3 {
	public static void main(String[] args) {
		int arr[]= {2,3,-4,5,-8,6,1};
		int target = 7;
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
