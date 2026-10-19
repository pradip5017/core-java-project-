package Interview_BasicArrayQuestion;

//find the length of arrays
public class ArrayLengthPractice1 {
	public static void main(String args[])
	{
		// find out second highest number
		int arr[]= {2,55,87,97,346,197,45,95};
		
		int first =0;
		int secound =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]> first)
			{
				secound = first;
				first = arr[i];
			}else if(arr[i]>secound && arr[i]!=first)
			{
				secound = arr[i];
			}
		}
		System.out.println("Secound Highest :"+secound);
		System.out.println("First highest :"+first);
		
	}

}
