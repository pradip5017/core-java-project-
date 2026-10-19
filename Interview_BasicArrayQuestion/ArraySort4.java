package Interview_BasicArrayQuestion;

public class ArraySort4 {
	public static void main(String args[])
	{
		int arr[]= {2,44,67,9,5,1,8,23};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
			for(int n : arr)
			{
				System.out.print(n+" ");
			}
		}
	

}
