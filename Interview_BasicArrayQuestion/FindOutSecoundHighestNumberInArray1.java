package Interview_BasicArrayQuestion;

public class FindOutSecoundHighestNumberInArray1 {
	public static void main(String args[])
	{
		int arr[]= {1,2,83,94,5,36,72,81};
		int first =0;
		int secound= 0;
		
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
		System.out.println("First Highest :"+first);
		System.out.println("Secound Highest :"+secound);
	}

}
