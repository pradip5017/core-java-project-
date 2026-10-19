package Interview_BasicArrayQuestion;

public class RotateArray1 {
	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6};
		
		int k =2;
		for(int i=0; i<k; i++)
		{
			int last = arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--)
			{
				arr[j]=arr[j-1];
			}
			arr[i]=last;
		}
		for(int n :arr)
		{
			System.out.print(n+" ");
		}
	}

}
