package Interview_BasicArrayQuestion;

public class SortArray5 {
	public static void main(String[] args) {
		
	
	int arr[]= {3,5,0,0,7,8,9,1,3};
	
	int num = 0;
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i] > arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
			}
		}
	}
	for(int  n:  arr)
	{
		System.out.print(n+" ");
	}
	}
}
