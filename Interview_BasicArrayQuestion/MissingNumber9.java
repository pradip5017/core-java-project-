package Interview_BasicArrayQuestion;

public class MissingNumber9 {
	public static void main(String[] args) {
		int arr[]= {2,3,6,4,5,8,9,11};
		
		int num =arr[arr.length-1];
		
		for(int i=1; i<=num; i++)
		{
			boolean found = false;
			for(int n : arr)
			{
				if(n==i)
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.print(i+" ");
			}
		}
	}

}
