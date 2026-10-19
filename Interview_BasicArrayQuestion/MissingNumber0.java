package Interview_BasicArrayQuestion;
// find out mising element in arrays like = 4,6
public class MissingNumber0 {
	public static void main(String[] args) {
		
		int arr[]= {4,6,7,2,4,9,7};
		
		int num = arr[arr.length-1];
		
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
