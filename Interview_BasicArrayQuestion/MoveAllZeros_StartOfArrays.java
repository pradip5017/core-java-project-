package Interview_BasicArrayQuestion;

public class MoveAllZeros_StartOfArrays {
	public static void main(String args[])
	{
		int arr[]= {2,5,0,6,8,0,9,1};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==0)
				{
					int temp = arr[i];
					arr[i] = arr[j];
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
