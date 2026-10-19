package Interview_BasicArrayQuestion;

public class ArraySortWithougthSoftFunction2 {
	public static void main(String args[])
	{
		int arr[]= {2,6,9,6,4,22,1,2,4,7};
		
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++)
				
			{
				if(arr[i]> arr[j])
						{
							int temp = arr[i];
							arr[i]= arr[j];
							arr[j]= temp;
						}
			}
		}
			for(int n : arr)
			{
				System.out.print(n+" ");
			}
		}
	
}
