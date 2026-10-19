package Interview_BasicArrayQuestion;
//find out Array length in 5 element
public class ArrayLength {
	public static void main(String[] args) {
		int arr[]= {1,2,4,6,8,5,4,8,9};
		
		int result = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==result)
			{
				System.out.println(i);
			}
		}
	}

}
