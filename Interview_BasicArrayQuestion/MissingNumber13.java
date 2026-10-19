package Interview_BasicArrayQuestion;

public class MissingNumber13 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,5,7,9};
		
		int num = arr[arr.length-1];
		for(int i=1; i<=num; i++)
		{
			boolean found = true;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[j]==i)
				{
					found = false;
					break;
				}
			}
			if(found)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
