package Interview_BasicArrayQuestion;

public class SecoundLargestValue {
	public static void main(String[] args) {
		
		int arr[]= {23,45,23,573,12,54,75,32};
		
		int first =0;
		int secound =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}else if(arr[i] > secound && arr[i] != first)
			{
				secound = arr[i];
			}
		}
		System.out.println("First Highest Element  :"+first);
		System.out.println("Secound Highest Element:"+secound);
	}

}
