package Interview_BasicArrayQuestion;

public class FindOutSecoundHighestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,8,54,3,4,67,53,34};
		
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
		System.out.println("First Highest :"+first);
		System.out.println("Secound Highest :"+secound);
	}
}
