package Interview_BasicArrayQuestion;
// move all zero in last element
public class MoveAllZeros_EndOfArrays5 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,0,3,4,0,6,8,0,6};
		
		int num = 0;
		for(int i=0; i<arr.length; i++)
		{
			
			for(int j=i; j<arr.length; j++)
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
