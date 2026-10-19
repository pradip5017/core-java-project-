package Interview_BasicArrayQuestion;

public class SecoundLargestValue_Without_Sort {
	public static void main(String[] args) {
	// Find the second largest element in an array (without sorting). give me simple code
		
		
		int arr[]= {22,33,55,63,12,53,64,75,86,96,94,78};
		
		int first =0;
		int secound =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
				
			}else  if(arr[i] > secound && arr[i] != first)
			{
				secound = arr[i];
			}
		}
		
		System.out.println(first);
		System.out.println(secound);
		
		
		
		//secound way find out secound highest values in array
		/*
		int arr[]= {22,33,55,63,12,53,64,75,86,96,94,78};
		
		int first = Integer.MIN_VALUE;
		int secound = Integer.MIN_VALUE;
		
		for(Integer num : arr)
		{
			if(num > first)
			{
				secound = first;
				first = num;
			}else if(num > secound && num != first)
			{
				secound = num;
			}
		}
		System.out.println(first);
		System.out.println(secound);
		*/
	}

}
