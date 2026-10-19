package Interview_BasicArrayQuestion;

public class SearchingElementInArray {
	public static void main(String[] args) {
		int arr[]= {11,22,44,66,77,88};
		
		int num = 77;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				System.out.print("Index position :"+i+" ");
			}
	}

	}
}

