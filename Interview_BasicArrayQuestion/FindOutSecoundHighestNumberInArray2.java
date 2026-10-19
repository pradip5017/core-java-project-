package Interview_BasicArrayQuestion;

public class FindOutSecoundHighestNumberInArray2 {
	public static void main(String args[])
	{
		int arr[]= {1,2,5,8,9,3,54,67,8,5,35,7};
		
		int first=0;
		int secound =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > first)
			{
				secound = first;
				first = arr[i];
			}else if(arr[i] > secound && arr[i]!=first)
			{
				secound = arr[i];
			}
		}
			System.out.println("First Highest :"+first);
			System.out.println("Secound Highest :"+secound);
	}
}
