package Interview_BasicArrayQuestion;
// move all zero  last index
public class MoveAllZeros_EndOfArrays01 {
	public static void main(String args[])
	{
		int arr[]= {1,3,0,4,0,8,0,2};
		
		
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
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}

}
