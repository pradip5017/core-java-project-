package Interview_BasicArrayQuestion;

// all zero swift in last element in Array
public class MoveAllZeros_EndOfArrays12 {
	public static void main(String args[])
	{
		int arr[]= {1,4,6,0,5,0,8,0,12};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]==0)
				{
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}
}
