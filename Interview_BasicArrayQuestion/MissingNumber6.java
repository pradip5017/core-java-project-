package Interview_BasicArrayQuestion;

public class MissingNumber6 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,4,6,7,9};
		
		int num =arr[arr.length-1];
		
		for(int i=1; i<=num; i++)
		{
		boolean b1 = false;
		
		for(int n: arr)
		{
			if(n==i)
			{
				b1 = true;
				break;
			}
		}
		if(!b1)
		{
			System.out.print(i+" ");
		}
		}
	}

}
