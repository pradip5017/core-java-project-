package Interview_BasicArrayQuestion;
//Move all zeros to the end of the array.
public class MoveAllZeros_EndOfArrays1 {
	public static void main(String[] args) {
		int arr[]= {2,4,6,0,3,0,6,7,4};
		
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
		for(int num : arr)
		{
			System.out.print(num+" ");
			
		}
	}

}
