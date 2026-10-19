package Interview_BasicArrayQuestion;

import java.util.Arrays;

public class SecoundLargestValue_With_Sorting4 {
	public static void main(String[] args) {
		//find out secound highest number with Arrays.sort 
		
		
//		int arr[]= {1,2,4,6,82,39};
//		
//		Arrays.sort(arr);
//		int num = arr[arr.length-2];
//		System.out.println("Secound Highest Number : "+num);
	
	// find out secound highest number without sort method
		
		int arr[]= {1,4,6,9,8,5,34,67,34,69};
		
		int first =0;
		int secound =0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}else if (arr[i] > secound &  arr[i]!=first)
			{
				secound = arr[i];
			}
		}
		System.out.println("Highest Element :"+first);
		System.out.println("Secound Highest Element :"+secound);
	}

}
