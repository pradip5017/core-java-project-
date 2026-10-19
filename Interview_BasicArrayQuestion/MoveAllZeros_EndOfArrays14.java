package Interview_BasicArrayQuestion;

public class MoveAllZeros_EndOfArrays14 {

	public static void main(String args[])
	{
		int arr[]= {2,4,0,5,0,8,9,0,12};
		
		for(int i=0; i<arr.length; i++)
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
			for(int n : arr)
			{
				System.out.print(n+" ");
			}
		
	}
}
