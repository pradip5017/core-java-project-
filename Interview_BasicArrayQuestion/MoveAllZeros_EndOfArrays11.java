package Interview_BasicArrayQuestion;
// move all zero in last index
public class MoveAllZeros_EndOfArrays11 {
	public static void main(String[] args) {
		
		int arr[]= {2,0,3,0,5,7,0,9};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
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
