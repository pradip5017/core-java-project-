package Interview_BasicArrayQuestion;

// all zero move on end of array
public class MoveAllZeros_EndOfArrays0 {
	public static void main(String args[])
	{
		int arr[]= {2,4,6,8,0,3,0,7,0};
		
		int num =0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]==0)
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int n : arr)
		{
			System.out.print(n+"  ");
		}
	}
}
