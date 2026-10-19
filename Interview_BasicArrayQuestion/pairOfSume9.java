package Interview_BasicArrayQuestion;
//target 8
public class pairOfSume9 {
	public static void main(String[] args) {
		int arr[]= {1,2,8,6,9,-5,-9,4,-1};
		int target = 8;
		int count=0;
		
		for(int i=0; i<arr.length;i++)
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
