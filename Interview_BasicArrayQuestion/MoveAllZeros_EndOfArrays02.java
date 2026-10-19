package Interview_BasicArrayQuestion;

// move all zero in last index
public class MoveAllZeros_EndOfArrays02 {
	public static void main(String args[])
	{
		int arr[]= {2,1,0,3,0,5,0,8};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==0)
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
