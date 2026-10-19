package Interview_BasicArrayQuestion;

public class ArraySortWithougthSoftFunction02 {
	public static void  main(String args[])
	{
		int arr[]= {2,3,4,6,8,90,76,2,3,8,6,987,2};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int n: arr)
		{
			System.out.print(n+" ");
		}
	}

}
