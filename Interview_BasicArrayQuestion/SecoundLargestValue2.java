package Interview_BasicArrayQuestion;

public class SecoundLargestValue2 {
	public static void main(String[] args) {
		
		int arr[]= {2,3,5,6,7,8,93,5,7,45,75,3,4,7};
		
		int first =0;
		int secound =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
				
			}else if(arr[i] > secound && arr[i]!= first)
			{
				secound = arr[i];
			}
		}
		System.out.println("First High :"+first);
		System.out.println("Secound High:"+secound);
	}

}
