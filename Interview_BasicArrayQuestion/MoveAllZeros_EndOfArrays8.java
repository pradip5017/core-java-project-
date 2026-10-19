package Interview_BasicArrayQuestion;

public class MoveAllZeros_EndOfArrays8 {
	public static void main(String args[])
	
	{
		int arr[]= {1,2,0,5,0,7,0};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; i++)
			{
				if(arr[i]==0)
				{
					int temp = arr[i];
					arr[i]=arr[j];
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
