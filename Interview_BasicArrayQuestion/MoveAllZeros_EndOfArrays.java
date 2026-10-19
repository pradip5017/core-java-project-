package Interview_BasicArrayQuestion;

public class MoveAllZeros_EndOfArrays {
	public static void main(String args[])
	{
		int arr[]= {1,0,3,0,2,0,5,0,5};
		int n = arr.length;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==0)
				{
					int temp = arr[i];
					
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
