package Interview_BasicArrayQuestion;
// move all zero end of Array
public class MoveAllZeros_EndOfArrays2 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,4,0,2,0,5,0,7};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]== 0)
				{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
			
		}
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}

}
