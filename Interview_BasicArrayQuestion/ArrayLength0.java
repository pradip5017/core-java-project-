package Interview_BasicArrayQuestion;

public class ArrayLength0 {
	public static void main(String args[])
	{
		int arr[]= {1,2,4,6,7,9,8};
		
		int num = 7;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==num)
			{
				System.out.print("Index: "+ i);
			}
		}
	}

}
