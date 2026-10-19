package Interview_BasicArrayQuestion;
// move all Zero in first line
public class MoveAllZeros_EndOfArrays7 {
	
	public static void main(String args[])
	{
		int arr[]= {2,8,0,8,9,45,1,0,77};
		
		for(int i=0; i<arr.length;i++)
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
