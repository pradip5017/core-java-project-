package Interview_BasicArrayQuestion;

public class ArrayLength1 {
	public static void main(String[] args) {
		int arr[]= {1,2,54,34,65,77,45};
		int length = 65;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==length)
			{
				System.out.println("Length :"+i);
			}
		}
	}

}
