package Interview_Question_practice;

// sorting arrays
public class ArraySortWithougthSoftFunction02 {
	public static void main(String args[])
	
	{
		int arr[]= {22,3,5,7,8,9,56,23,5,9};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
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
